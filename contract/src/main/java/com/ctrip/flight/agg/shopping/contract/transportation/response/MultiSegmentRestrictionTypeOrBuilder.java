// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

public interface MultiSegmentRestrictionTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.response.MultiSegmentRestrictionType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   **
   *多段的合并订位方式
   *0:未知由下单确定,1:分开订位,2:合并订位， 当前1和2仅供中转联程使用
   * </pre>
   *
   * <code>int32 MultiSegmentBookingType = 1;</code>
   */
  int getMultiSegmentBookingType();
}