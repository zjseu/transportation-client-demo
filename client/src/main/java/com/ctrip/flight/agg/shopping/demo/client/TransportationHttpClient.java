package com.ctrip.flight.agg.shopping.demo.client;

import com.ctrip.flight.agg.shopping.contract.transportation.request.SearchRequestType;
import com.ctrip.flight.agg.shopping.contract.transportation.response.SearchResponseType;
import com.ctrip.flight.agg.shopping.demo.callfomat.ZstdGoogleProtobuf3ContentFormatter;
import com.ctrip.flight.agg.shopping.demo.tokenmanager.app.AppTokenManager;
import com.ctrip.flight.agg.shopping.demo.tokenmanager.app.CerberusApp;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * HTTP access to ctrip flight list shopping's api
 *
 * @author yd.yu
 * @date 2020/12/28
 **/
public class TransportationHttpClient {

    private static CloseableHttpAsyncClient httpAsyncClient = HttpAsyncClients.createDefault();

    /**
     * AppTokenManager & CerberusApp：gateway validation for ctrip partner in the production environment
     */
    private static AppTokenManager appTokenManager;
    private static CerberusApp app;


    public static void main(String[] args) {
        try {
            // see Readme about url
            URL url = new URL("https://apiproxy.ctrip.com/apiproxy/soa2/20937/zstd-protobuf-3/search");

            // No gateway validation is necessary in test environment!
            initForProd();

            String completeURI = app.updateRequestUri(url.getPath());
            URL completeURL = new URL(url.getProtocol(), url.getHost(), completeURI);
            HttpPost request = new HttpPost(completeURL.toString());

            InputStream inputStream = convertRequest(MessageHelper.buildSearchRequest("test"));
            InputStreamEntity entity = new InputStreamEntity(inputStream, inputStream.available());
            request.setEntity(entity);

            httpAsyncClient.start();
            httpAsyncClient.execute(request, new FutureCallback<HttpResponse>() {
                @Override
                public void completed(HttpResponse httpResponse) {
                    processResult(httpResponse);
                }

                @Override
                public void failed(Exception e) {
                    System.out.println("fail：");
                    e.printStackTrace();
                }

                @Override
                public void cancelled() {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * validate gateway for ctrip partner in the production environment
     */
    private static void initForProd() {
        try {
            appTokenManager = new AppTokenManager();
            app = new CerberusApp(333L, "39d0ee5394e99ce4",
                    "7b63db2496ee983f344c802fa373d40f8a4f783369002b0e16785dfed4d19492");
            appTokenManager.addApp(app);
            appTokenManager.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static InputStream convertRequest(SearchRequestType searchRequestType) throws IOException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            ZstdGoogleProtobuf3ContentFormatter.INSTANCE.serialize(byteArrayOutputStream, searchRequestType);
            byte[] requestByteArray = byteArrayOutputStream.toByteArray();
            return new ByteArrayInputStream(requestByteArray);
        }
    }

    private static void processResult(HttpResponse httpResponse) {
        try {
            SearchResponseType result = null;
            // status code
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                System.out.println("fail");
                return;
            } else {
                InputStream responseInputStream = httpResponse.getEntity().getContent();
                result = ZstdGoogleProtobuf3ContentFormatter.INSTANCE.deserialize(SearchResponseType.class,
                        responseInputStream);
            }
            if (result == null || result.getResponseBody() == null
                    || result.getResponseBody().getItineraryList() == null) {
                System.out.println("query result is empty");
            } else {
                System.out.println(String.format("query result has %s flight group.",
                        result.getResponseBody().getItineraryList().size()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
