// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.baggage.proto

package com.ctrip.flight.agg.shopping.contract.baggage;

public interface PaxBaggageTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 年龄组合
   * </pre>
   *
   * <code>int32 AgeTypeGroup = 1;</code>
   */
  int getAgeTypeGroup();

  /**
   * <pre>
   * 行李额类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageWayType BaggageWay = 2;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.baggage.BaggageWayType> 
      getBaggageWayList();
  /**
   * <pre>
   * 行李额类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageWayType BaggageWay = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.baggage.BaggageWayType getBaggageWay(int index);
  /**
   * <pre>
   * 行李额类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageWayType BaggageWay = 2;</code>
   */
  int getBaggageWayCount();
  /**
   * <pre>
   * 行李额类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageWayType BaggageWay = 2;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.baggage.BaggageWayTypeOrBuilder> 
      getBaggageWayOrBuilderList();
  /**
   * <pre>
   * 行李额类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageWayType BaggageWay = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.baggage.BaggageWayTypeOrBuilder getBaggageWayOrBuilder(
      int index);
}