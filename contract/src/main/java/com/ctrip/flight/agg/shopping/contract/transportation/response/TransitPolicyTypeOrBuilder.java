// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

public interface TransitPolicyTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.response.TransitPolicyType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 政策开始日期	yyyy-MM-dd
   * </pre>
   *
   * <code>string EffectDate = 1;</code>
   */
  java.lang.String getEffectDate();
  /**
   * <pre>
   * 政策开始日期	yyyy-MM-dd
   * </pre>
   *
   * <code>string EffectDate = 1;</code>
   */
  com.google.protobuf.ByteString
      getEffectDateBytes();

  /**
   * <pre>
   * 政策截止日期	yyyy-MM-dd
   * </pre>
   *
   * <code>string ExpireDate = 2;</code>
   */
  java.lang.String getExpireDate();
  /**
   * <pre>
   * 政策截止日期	yyyy-MM-dd
   * </pre>
   *
   * <code>string ExpireDate = 2;</code>
   */
  com.google.protobuf.ByteString
      getExpireDateBytes();
}
