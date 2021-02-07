// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.baggage.proto

package com.ctrip.flight.agg.shopping.contract.baggage;

public interface BaggageSizeTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.baggage.BaggageSizeType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 尺寸限制类型。1：三边之和；2：长*宽*高
   * </pre>
   *
   * <code>int32 SizeLimitType = 1;</code>
   */
  int getSizeLimitType();

  /**
   * <pre>
   * 尺寸大小(不含单位)，格式：180 或者 10*12*14
   * </pre>
   *
   * <code>string Size = 2;</code>
   */
  java.lang.String getSize();
  /**
   * <pre>
   * 尺寸大小(不含单位)，格式：180 或者 10*12*14
   * </pre>
   *
   * <code>string Size = 2;</code>
   */
  com.google.protobuf.ByteString
      getSizeBytes();

  /**
   * <pre>
   * 尺寸单位，格式：CM
   * </pre>
   *
   * <code>string Unit = 3;</code>
   */
  java.lang.String getUnit();
  /**
   * <pre>
   * 尺寸单位，格式：CM
   * </pre>
   *
   * <code>string Unit = 3;</code>
   */
  com.google.protobuf.ByteString
      getUnitBytes();
}