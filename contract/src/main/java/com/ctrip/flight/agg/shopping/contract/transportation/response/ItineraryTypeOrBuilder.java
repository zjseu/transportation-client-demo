// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

public interface ItineraryTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.response.ItineraryType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 行程组合类型, 所有的TransportType的位或操作,如：3-flight+Train
   * </pre>
   *
   * <code>int32 TransportTypeGroup = 1;</code>
   */
  int getTransportTypeGroup();

  /**
   * <pre>
   * 行程、段索引
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.TransportSegmentType TransportSegment = 2;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.response.TransportSegmentType> 
      getTransportSegmentList();
  /**
   * <pre>
   * 行程、段索引
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.TransportSegmentType TransportSegment = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.TransportSegmentType getTransportSegment(int index);
  /**
   * <pre>
   * 行程、段索引
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.TransportSegmentType TransportSegment = 2;</code>
   */
  int getTransportSegmentCount();
  /**
   * <pre>
   * 行程、段索引
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.TransportSegmentType TransportSegment = 2;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.response.TransportSegmentTypeOrBuilder> 
      getTransportSegmentOrBuilderList();
  /**
   * <pre>
   * 行程、段索引
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.TransportSegmentType TransportSegment = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.TransportSegmentTypeOrBuilder getTransportSegmentOrBuilder(
      int index);

  /**
   * <pre>
   * 出价信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType Offer = 3;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType> 
      getOfferList();
  /**
   * <pre>
   * 出价信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType Offer = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType getOffer(int index);
  /**
   * <pre>
   * 出价信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType Offer = 3;</code>
   */
  int getOfferCount();
  /**
   * <pre>
   * 出价信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType Offer = 3;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.response.OfferTypeOrBuilder> 
      getOfferOrBuilderList();
  /**
   * <pre>
   * 出价信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType Offer = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.OfferTypeOrBuilder getOfferOrBuilder(
      int index);

  /**
   * <pre>
   * 0:不是飞人, 1:普通飞人, 2:超级飞人
   * </pre>
   *
   * <code>int32 FlyingManType = 4;</code>
   */
  int getFlyingManType();

  /**
   * <pre>
   * 换乘信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.InterchangeType Interchange = 5;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.InterchangeType> 
      getInterchangeList();
  /**
   * <pre>
   * 换乘信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.InterchangeType Interchange = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.InterchangeType getInterchange(int index);
  /**
   * <pre>
   * 换乘信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.InterchangeType Interchange = 5;</code>
   */
  int getInterchangeCount();
  /**
   * <pre>
   * 换乘信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.InterchangeType Interchange = 5;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.InterchangeTypeOrBuilder> 
      getInterchangeOrBuilderList();
  /**
   * <pre>
   * 换乘信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.InterchangeType Interchange = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.InterchangeTypeOrBuilder getInterchangeOrBuilder(
      int index);

  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 6;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType> 
      getTagList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 6;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType getTag(int index);
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 6;</code>
   */
  int getTagCount();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 6;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder> 
      getTagOrBuilderList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 6;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder getTagOrBuilder(
      int index);

  /**
   * <pre>
   * 优先级, 数值越小优先级越高
   * </pre>
   *
   * <code>double Priority = 7;</code>
   */
  double getPriority();

  /**
   * <pre>
   * 被正常运价引用的运价信息，如：儿童标准价
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType ReferenceOffer = 8;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType> 
      getReferenceOfferList();
  /**
   * <pre>
   * 被正常运价引用的运价信息，如：儿童标准价
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType ReferenceOffer = 8;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType getReferenceOffer(int index);
  /**
   * <pre>
   * 被正常运价引用的运价信息，如：儿童标准价
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType ReferenceOffer = 8;</code>
   */
  int getReferenceOfferCount();
  /**
   * <pre>
   * 被正常运价引用的运价信息，如：儿童标准价
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType ReferenceOffer = 8;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.response.OfferTypeOrBuilder> 
      getReferenceOfferOrBuilderList();
  /**
   * <pre>
   * 被正常运价引用的运价信息，如：儿童标准价
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.OfferType ReferenceOffer = 8;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.OfferTypeOrBuilder getReferenceOfferOrBuilder(
      int index);
}
