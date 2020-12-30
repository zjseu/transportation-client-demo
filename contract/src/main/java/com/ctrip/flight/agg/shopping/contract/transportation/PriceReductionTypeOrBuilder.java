// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface PriceReductionTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.PriceReductionType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 RefNum = 1;</code>
   */
  int getRefNum();

  /**
   * <pre>
   * 立减ID
   * </pre>
   *
   * <code>int64 PromotionID = 2;</code>
   */
  long getPromotionID();

  /**
   * <pre>
   * 使用人群范围
   * </pre>
   *
   * <code>string ForUser = 3;</code>
   */
  java.lang.String getForUser();
  /**
   * <pre>
   * 使用人群范围
   * </pre>
   *
   * <code>string ForUser = 3;</code>
   */
  com.google.protobuf.ByteString
      getForUserBytes();

  /**
   * <pre>
   * 立减金额
   * </pre>
   *
   * <code>double DiscountAmount = 4;</code>
   */
  double getDiscountAmount();

  /**
   * <pre>
   * 券规则code
   * </pre>
   *
   * <code>string CouponCode = 5;</code>
   */
  java.lang.String getCouponCode();
  /**
   * <pre>
   * 券规则code
   * </pre>
   *
   * <code>string CouponCode = 5;</code>
   */
  com.google.protobuf.ByteString
      getCouponCodeBytes();
}
