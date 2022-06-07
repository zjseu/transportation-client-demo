// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

public interface MemberRegisterTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.response.MemberRegisterType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 营销Code
   * </pre>
   *
   * <code>string MarketingCode = 1;</code>
   */
  java.lang.String getMarketingCode();
  /**
   * <pre>
   * 营销Code
   * </pre>
   *
   * <code>string MarketingCode = 1;</code>
   */
  com.google.protobuf.ByteString
      getMarketingCodeBytes();

  /**
   * <pre>
   * 产品类型： 0：产品送里程 1：注册送里程
   * </pre>
   *
   * <code>int32 ProductType = 2;</code>
   */
  int getProductType();

  /**
   * <pre>
   * 会员类型: 0：新会员 1：老会员
   * </pre>
   *
   * <code>string VipType = 3;</code>
   */
  java.lang.String getVipType();
  /**
   * <pre>
   * 会员类型: 0：新会员 1：老会员
   * </pre>
   *
   * <code>string VipType = 3;</code>
   */
  com.google.protobuf.ByteString
      getVipTypeBytes();

  /**
   * <pre>
   * 是否需要在线注册 T/F
   * </pre>
   *
   * <code>string OnlineRegister = 4;</code>
   */
  java.lang.String getOnlineRegister();
  /**
   * <pre>
   * 是否需要在线注册 T/F
   * </pre>
   *
   * <code>string OnlineRegister = 4;</code>
   */
  com.google.protobuf.ByteString
      getOnlineRegisterBytes();

  /**
   * <pre>
   * 注册来源
   * </pre>
   *
   * <code>string RegisterSource = 5;</code>
   */
  java.lang.String getRegisterSource();
  /**
   * <pre>
   * 注册来源
   * </pre>
   *
   * <code>string RegisterSource = 5;</code>
   */
  com.google.protobuf.ByteString
      getRegisterSourceBytes();

  /**
   * <pre>
   * 赠送内容: 0:里程
   * </pre>
   *
   * <code>string GiveOption = 6;</code>
   */
  java.lang.String getGiveOption();
  /**
   * <pre>
   * 赠送内容: 0:里程
   * </pre>
   *
   * <code>string GiveOption = 6;</code>
   */
  com.google.protobuf.ByteString
      getGiveOptionBytes();

  /**
   * <pre>
   * 年龄限制。成人0，儿童1，必选
   * </pre>
   *
   * <code>string AgeLimit = 7;</code>
   */
  java.lang.String getAgeLimit();
  /**
   * <pre>
   * 年龄限制。成人0，儿童1，必选
   * </pre>
   *
   * <code>string AgeLimit = 7;</code>
   */
  com.google.protobuf.ByteString
      getAgeLimitBytes();

  /**
   * <pre>
   * 产品规则
   * </pre>
   *
   * <code>string ProductRule = 8;</code>
   */
  java.lang.String getProductRule();
  /**
   * <pre>
   * 产品规则
   * </pre>
   *
   * <code>string ProductRule = 8;</code>
   */
  com.google.protobuf.ByteString
      getProductRuleBytes();

  /**
   * <pre>
   * 规则内容
   * </pre>
   *
   * <code>string RuleContent = 9;</code>
   */
  java.lang.String getRuleContent();
  /**
   * <pre>
   * 规则内容
   * </pre>
   *
   * <code>string RuleContent = 9;</code>
   */
  com.google.protobuf.ByteString
      getRuleContentBytes();

  /**
   * <pre>
   * 年龄范围
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType AgeLimitRange = 10;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType> 
      getAgeLimitRangeList();
  /**
   * <pre>
   * 年龄范围
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType AgeLimitRange = 10;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType getAgeLimitRange(int index);
  /**
   * <pre>
   * 年龄范围
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType AgeLimitRange = 10;</code>
   */
  int getAgeLimitRangeCount();
  /**
   * <pre>
   * 年龄范围
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType AgeLimitRange = 10;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.IntRangeTypeOrBuilder> 
      getAgeLimitRangeOrBuilderList();
  /**
   * <pre>
   * 年龄范围
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType AgeLimitRange = 10;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.IntRangeTypeOrBuilder getAgeLimitRangeOrBuilder(
      int index);
}
