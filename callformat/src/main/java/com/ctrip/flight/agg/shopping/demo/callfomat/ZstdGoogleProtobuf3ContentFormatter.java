package com.ctrip.flight.agg.shopping.demo.callfomat;

import com.github.luben.zstd.ZstdInputStream;
import com.github.luben.zstd.ZstdOutputStream;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;

/**
 * support serializer & deserializer for api
 *
 * @author shihh
 * @date 2022/01/05
 */
public class ZstdGoogleProtobuf3ContentFormatter implements ContentFormatter {
    public static final ZstdGoogleProtobuf3ContentFormatter INSTANCE = new ZstdGoogleProtobuf3ContentFormatter();
    private static final ConcurrentHashMap<Class, AbstractParser<Message>> PARSER_MAP = new ConcurrentHashMap<>();
    private final Logger logger = LoggerFactory.getLogger(ZstdGoogleProtobuf3ContentFormatter.class);

    private ZstdGoogleProtobuf3ContentFormatter() {
    }

    @Override
    public String getEncoding() {
        return "UTF-8";
    }

    @Override
    public <T> void serialize(OutputStream outputStream, T obj) throws IOException {
        if (!(obj instanceof Message)) {
            throw new IOException(obj.getClass().getName() + " can't be serialize");
        }
        Message message = (Message) obj;
        try (OutputStream outputs = new ZstdOutputStream(outputStream)) {
            message.writeTo(outputs);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public <T> T deserialize(final Class<T> cls, InputStream inputStream) throws IOException {
        if (!GeneratedMessageV3.class.isAssignableFrom(cls)) {
            throw new IOException(cls.getName() + " can't be deserialize");
        }
        try (InputStream inputs = new ZstdInputStream(inputStream)) {
            AbstractParser<Message> abstractParser = PARSER_MAP.get(cls);
            if (abstractParser == null) {
                abstractParser = new AbstractParser<Message>() {
                    private volatile Constructor constructor;

                    @Override
                    public Message parsePartialFrom(CodedInputStream input,
                                                    ExtensionRegistryLite extensionRegistry)
                            throws InvalidProtocolBufferException {
                        try {
                            if (constructor == null) {
                                synchronized (this) {
                                    if (constructor == null) {
                                        constructor = cls.getDeclaredConstructor(
                                                CodedInputStream.class, ExtensionRegistryLite.class);
                                        constructor.setAccessible(true);
                                    }
                                }
                            }
                            return (Message) constructor.newInstance(input, extensionRegistry);
                        } catch (Exception e) {
                            throw new InvalidProtocolBufferException(e.getMessage());
                        }
                    }
                };
                PARSER_MAP.putIfAbsent(cls, abstractParser);
            }
            return (T) abstractParser.parseFrom(inputs);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new IOException(cls.getName() + " can't be deserialize");
        }
    }

    @Override
    public String getContentType() {
        return "application/zstd-protobuf-3";
    }

    @Override
    public String getExtension() {
        return "zstd-protobuf-3";
    }
}
