// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface FlightPaxProductTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.FlightPaxProductType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 乘客资质，是底层返回的原始值
   * </pre>
   *
   * <code>string Eligibility = 1;</code>
   */
  java.lang.String getEligibility();
  /**
   * <pre>
   * 乘客资质，是底层返回的原始值
   * </pre>
   *
   * <code>string Eligibility = 1;</code>
   */
  com.google.protobuf.ByteString
      getEligibilityBytes();

  /**
   * <pre>
   * 乘客类型, 1: Adult; 2: Child; 4: Infant
   * </pre>
   *
   * <code>int32 AgeType = 2;</code>
   */
  int getAgeType();

  /**
   * <pre>
   * 销售币种的价格信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.FlightSaleCurrencyPriceDetailType SaleCurrencyPriceDetail = 3;</code>
   */
  boolean hasSaleCurrencyPriceDetail();
  /**
   * <pre>
   * 销售币种的价格信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.FlightSaleCurrencyPriceDetailType SaleCurrencyPriceDetail = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.FlightSaleCurrencyPriceDetailType getSaleCurrencyPriceDetail();
  /**
   * <pre>
   * 销售币种的价格信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.FlightSaleCurrencyPriceDetailType SaleCurrencyPriceDetail = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.FlightSaleCurrencyPriceDetailTypeOrBuilder getSaleCurrencyPriceDetailOrBuilder();

  /**
   * <pre>
   * 结算币种的价格信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.FlightSettlementCurrencyPriceDetailType SettlementCurrencyPriceDetail = 4;</code>
   */
  boolean hasSettlementCurrencyPriceDetail();
  /**
   * <pre>
   * 结算币种的价格信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.FlightSettlementCurrencyPriceDetailType SettlementCurrencyPriceDetail = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.FlightSettlementCurrencyPriceDetailType getSettlementCurrencyPriceDetail();
  /**
   * <pre>
   * 结算币种的价格信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.FlightSettlementCurrencyPriceDetailType SettlementCurrencyPriceDetail = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.FlightSettlementCurrencyPriceDetailTypeOrBuilder getSettlementCurrencyPriceDetailOrBuilder();

  /**
   * <pre>
   * 后返类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.RebateType Rebate = 5;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.RebateType> 
      getRebateList();
  /**
   * <pre>
   * 后返类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.RebateType Rebate = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.RebateType getRebate(int index);
  /**
   * <pre>
   * 后返类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.RebateType Rebate = 5;</code>
   */
  int getRebateCount();
  /**
   * <pre>
   * 后返类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.RebateType Rebate = 5;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.RebateTypeOrBuilder> 
      getRebateOrBuilderList();
  /**
   * <pre>
   * 后返类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.RebateType Rebate = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.RebateTypeOrBuilder getRebateOrBuilder(
      int index);

  /**
   * <pre>
   * 出票备注
   * </pre>
   *
   * <code>string TicketRemark = 6;</code>
   */
  java.lang.String getTicketRemark();
  /**
   * <pre>
   * 出票备注
   * </pre>
   *
   * <code>string TicketRemark = 6;</code>
   */
  com.google.protobuf.ByteString
      getTicketRemarkBytes();

  /**
   * <pre>
   * 乘客限制信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.PaxRestrictionType PaxRestriction = 7;</code>
   */
  boolean hasPaxRestriction();
  /**
   * <pre>
   * 乘客限制信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.PaxRestrictionType PaxRestriction = 7;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.PaxRestrictionType getPaxRestriction();
  /**
   * <pre>
   * 乘客限制信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.PaxRestrictionType PaxRestriction = 7;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.PaxRestrictionTypeOrBuilder getPaxRestrictionOrBuilder();

  /**
   * <pre>
   * 备注信息的索引
   * </pre>
   *
   * <code>int32 TextRemarkRef = 8;</code>
   */
  int getTextRemarkRef();

  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType> 
      getTagList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType getTag(int index);
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  int getTagCount();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder> 
      getTagOrBuilderList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder getTagOrBuilder(
      int index);
}
