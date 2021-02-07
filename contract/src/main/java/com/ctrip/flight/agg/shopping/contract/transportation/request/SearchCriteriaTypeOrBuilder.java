// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.request.proto

package com.ctrip.flight.agg.shopping.contract.transportation.request;

public interface SearchCriteriaTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.request.SearchCriteriaType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 用户请求的行程信息 TODO 需要支持指定交通类型吗
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.JourneyRequestType JourneyRequest = 1;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.request.JourneyRequestType> 
      getJourneyRequestList();
  /**
   * <pre>
   * 用户请求的行程信息 TODO 需要支持指定交通类型吗
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.JourneyRequestType JourneyRequest = 1;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.JourneyRequestType getJourneyRequest(int index);
  /**
   * <pre>
   * 用户请求的行程信息 TODO 需要支持指定交通类型吗
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.JourneyRequestType JourneyRequest = 1;</code>
   */
  int getJourneyRequestCount();
  /**
   * <pre>
   * 用户请求的行程信息 TODO 需要支持指定交通类型吗
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.JourneyRequestType JourneyRequest = 1;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.request.JourneyRequestTypeOrBuilder> 
      getJourneyRequestOrBuilderList();
  /**
   * <pre>
   * 用户请求的行程信息 TODO 需要支持指定交通类型吗
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.JourneyRequestType JourneyRequest = 1;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.JourneyRequestTypeOrBuilder getJourneyRequestOrBuilder(
      int index);

  /**
   * <pre>
   * 乘客信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType PaxRequest = 2;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType> 
      getPaxRequestList();
  /**
   * <pre>
   * 乘客信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType PaxRequest = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType getPaxRequest(int index);
  /**
   * <pre>
   * 乘客信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType PaxRequest = 2;</code>
   */
  int getPaxRequestCount();
  /**
   * <pre>
   * 乘客信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType PaxRequest = 2;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestTypeOrBuilder> 
      getPaxRequestOrBuilderList();
  /**
   * <pre>
   * 乘客信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestType PaxRequest = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.PaxRequestTypeOrBuilder getPaxRequestOrBuilder(
      int index);

  /**
   * <pre>
   * 机票舱等， Y: 经济舱； W：超级经济舱； C：公务舱；F：头等舱 TODO 其他交通工具没有这个信息
   * </pre>
   *
   * <code>repeated string CabinCode = 3;</code>
   */
  java.util.List<java.lang.String>
      getCabinCodeList();
  /**
   * <pre>
   * 机票舱等， Y: 经济舱； W：超级经济舱； C：公务舱；F：头等舱 TODO 其他交通工具没有这个信息
   * </pre>
   *
   * <code>repeated string CabinCode = 3;</code>
   */
  int getCabinCodeCount();
  /**
   * <pre>
   * 机票舱等， Y: 经济舱； W：超级经济舱； C：公务舱；F：头等舱 TODO 其他交通工具没有这个信息
   * </pre>
   *
   * <code>repeated string CabinCode = 3;</code>
   */
  java.lang.String getCabinCode(int index);
  /**
   * <pre>
   * 机票舱等， Y: 经济舱； W：超级经济舱； C：公务舱；F：头等舱 TODO 其他交通工具没有这个信息
   * </pre>
   *
   * <code>repeated string CabinCode = 3;</code>
   */
  com.google.protobuf.ByteString
      getCabinCodeBytes(int index);

  /**
   * <pre>
   * 币种
   * </pre>
   *
   * <code>string SaleCurrency = 4;</code>
   */
  java.lang.String getSaleCurrency();
  /**
   * <pre>
   * 币种
   * </pre>
   *
   * <code>string SaleCurrency = 4;</code>
   */
  com.google.protobuf.ByteString
      getSaleCurrencyBytes();

  /**
   * <pre>
   * 语种(Locale格式)
   * </pre>
   *
   * <code>string Language = 5;</code>
   */
  java.lang.String getLanguage();
  /**
   * <pre>
   * 语种(Locale格式)
   * </pre>
   *
   * <code>string Language = 5;</code>
   */
  com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType ExtensionOption = 6;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType> 
      getExtensionOptionList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType ExtensionOption = 6;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType getExtensionOption(int index);
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType ExtensionOption = 6;</code>
   */
  int getExtensionOptionCount();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType ExtensionOption = 6;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder> 
      getExtensionOptionOrBuilderList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType ExtensionOption = 6;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder getExtensionOptionOrBuilder(
      int index);

  /**
   * <pre>
   * 是否需要推荐位
   * </pre>
   *
   * <code>bool NeedRecommendation = 7;</code>
   */
  boolean getNeedRecommendation();

  /**
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.UserParameterType UserParameter = 8;</code>
   */
  boolean hasUserParameter();
  /**
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.UserParameterType UserParameter = 8;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.UserParameterType getUserParameter();
  /**
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.UserParameterType UserParameter = 8;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.UserParameterTypeOrBuilder getUserParameterOrBuilder();
}