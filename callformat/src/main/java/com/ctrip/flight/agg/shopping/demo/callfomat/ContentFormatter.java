package com.ctrip.flight.agg.shopping.demo.callfomat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface ContentFormatter {
    String getContentType();

    String getExtension();

    String getEncoding();

    <T> void serialize(OutputStream var1, T var2) throws IOException;

    <T> T deserialize(Class<T> var1, InputStream var2) throws IOException;
}