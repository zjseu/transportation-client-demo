package com.ctrip.flight.agg.shopping.demo.client;


import com.ctrip.flight.agg.shopping.contract.message.MessageHeaderType;
import com.ctrip.flight.agg.shopping.contract.message.RequestHeaderType;
import com.ctrip.flight.agg.shopping.contract.transportation.request.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * a helper for generating request object
 *
 * @author tiantianhuang
 * @date 2019/3/4 18:28
 */
public class MessageHelper {

    private static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static SearchRequestType buildSearchRequest(String txId) {
        MessageHeaderType.Builder messageHeaderType = MessageHeaderType.newBuilder();
        messageHeaderType.setChannel("Affiliate");
        // 0 is jest for demonstration purposes. Ctrip partners have their own values.
        messageHeaderType.setSubChannelID(0);
        messageHeaderType.setTransactionID(txId);

        RequestHeaderType.Builder headerType = RequestHeaderType.newBuilder();
        headerType.setDiagInput("Test");
        headerType.setLoggingLevel(111);
        headerType.setMessageHeader(messageHeaderType);

        SearchRequestType.Builder request = SearchRequestType.newBuilder();
        request.setRequestHeader(headerType);
        SearchCriteriaType.Builder criteriaType = SearchCriteriaType.newBuilder();
        criteriaType.addJourneyRequest(JourneyRequestType.newBuilder()
                .setDepartDate(LocalDate.now().plusDays(10).format(DATE_FORMATTER))
                .setDepartLocation(LocationType.newBuilder()
                        .setType(1)
                        .setLocation("SHA")
                        .build())
                .setArriveLocation(LocationType.newBuilder()
                        .setType(1)
                        .setLocation("HKG")
                        .build())
                .build());
        criteriaType.addPaxRequest(PaxRequestType.newBuilder()
                .setAgeType(1)
                .setCount(1)
                .build());
        criteriaType.addCabinCode("Y");
        request.setSearchCriteria(criteriaType);

        return request.build();
    }
}
