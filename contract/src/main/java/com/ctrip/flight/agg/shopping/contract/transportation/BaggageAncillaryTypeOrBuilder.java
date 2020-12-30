// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface BaggageAncillaryTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.BaggageAncillaryType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 关联X产品
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.BundleItemType BundleItem = 1;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.BundleItemType> 
      getBundleItemList();
  /**
   * <pre>
   * 关联X产品
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.BundleItemType BundleItem = 1;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.BundleItemType getBundleItem(int index);
  /**
   * <pre>
   * 关联X产品
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.BundleItemType BundleItem = 1;</code>
   */
  int getBundleItemCount();
  /**
   * <pre>
   * 关联X产品
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.BundleItemType BundleItem = 1;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.BundleItemTypeOrBuilder> 
      getBundleItemOrBuilderList();
  /**
   * <pre>
   * 关联X产品
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.BundleItemType BundleItem = 1;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.BundleItemTypeOrBuilder getBundleItemOrBuilder(
      int index);

  /**
   * <pre>
   * 行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType BaggageRef = 2;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType> 
      getBaggageRefList();
  /**
   * <pre>
   * 行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType BaggageRef = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType getBaggageRef(int index);
  /**
   * <pre>
   * 行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType BaggageRef = 2;</code>
   */
  int getBaggageRefCount();
  /**
   * <pre>
   * 行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType BaggageRef = 2;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefTypeOrBuilder> 
      getBaggageRefOrBuilderList();
  /**
   * <pre>
   * 行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType BaggageRef = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefTypeOrBuilder getBaggageRefOrBuilder(
      int index);
}
