// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.baggage.proto

package com.ctrip.flight.agg.shopping.contract.baggage;

public interface BaggageWayTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.baggage.BaggageWayType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 关联BaggageType.RefNum
   * </pre>
   *
   * <code>int32 BaggageTypeRef = 1;</code>
   */
  int getBaggageTypeRef();

  /**
   * <pre>
   * 0=托运、1=手提
   * </pre>
   *
   * <code>int32 Type = 2;</code>
   */
  int getType();
}
