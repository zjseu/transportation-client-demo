// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface PaxProductTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.PaxProductType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 乘客类型, 1: Adult; 2: Child; 4: Infant
   * </pre>
   *
   * <code>int32 AgeType = 1;</code>
   */
  int getAgeType();

  /**
   * <pre>
   * 销售币种的卖价
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType SaleCurrencyPriceDetail = 2;</code>
   */
  boolean hasSaleCurrencyPriceDetail();
  /**
   * <pre>
   * 销售币种的卖价
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType SaleCurrencyPriceDetail = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType getSaleCurrencyPriceDetail();
  /**
   * <pre>
   * 销售币种的卖价
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType SaleCurrencyPriceDetail = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailTypeOrBuilder getSaleCurrencyPriceDetailOrBuilder();

  /**
   * <pre>
   * 结算币种价格信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType SettlementCurrencyPriceDetail = 3;</code>
   */
  boolean hasSettlementCurrencyPriceDetail();
  /**
   * <pre>
   * 结算币种价格信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType SettlementCurrencyPriceDetail = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType getSettlementCurrencyPriceDetail();
  /**
   * <pre>
   * 结算币种价格信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType SettlementCurrencyPriceDetail = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailTypeOrBuilder getSettlementCurrencyPriceDetailOrBuilder();

  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 4;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType> 
      getTagList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType getTag(int index);
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 4;</code>
   */
  int getTagCount();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 4;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder> 
      getTagOrBuilderList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder getTagOrBuilder(
      int index);
}