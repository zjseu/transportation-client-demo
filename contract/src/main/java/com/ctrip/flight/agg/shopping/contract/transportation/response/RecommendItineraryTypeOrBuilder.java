// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

public interface RecommendItineraryTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.response.RecommendItineraryType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 推荐位类型
   * </pre>
   *
   * <code>string Type = 1;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * 推荐位类型
   * </pre>
   *
   * <code>string Type = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   *推荐位简体结构，重新列表查询
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.RedirectItineraryType RedirectItinerary = 2;</code>
   */
  boolean hasRedirectItinerary();
  /**
   * <pre>
   *推荐位简体结构，重新列表查询
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.RedirectItineraryType RedirectItinerary = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.RedirectItineraryType getRedirectItinerary();
  /**
   * <pre>
   *推荐位简体结构，重新列表查询
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.RedirectItineraryType RedirectItinerary = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.RedirectItineraryTypeOrBuilder getRedirectItineraryOrBuilder();

  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 3;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType> 
      getTagList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType getTag(int index);
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 3;</code>
   */
  int getTagCount();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 3;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder> 
      getTagOrBuilderList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder getTagOrBuilder(
      int index);
}
