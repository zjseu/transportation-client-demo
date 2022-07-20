// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface ServiceDiscountTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.ServiceDiscountType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 优惠金额的折扣项：1 机票、2 X产品
   * </pre>
   *
   * <code>int32 Item = 1;</code>
   */
  int getItem();

  /**
   * <pre>
   * 折扣金额
   * </pre>
   *
   * <code>double DiscountAmount = 2;</code>
   */
  double getDiscountAmount();

  /**
   * <pre>
   * 乘客类型, 1: Adult; 2: Child; 4: Infant
   * </pre>
   *
   * <code>int32 AgeType = 3;</code>
   */
  int getAgeType();

  /**
   * <pre>
   * 打折卡折扣模式
   * </pre>
   *
   * <code>int32 DiscountMode = 4;</code>
   */
  int getDiscountMode();

  /**
   * <pre>
   * 打折卡折扣比例
   * </pre>
   *
   * <code>double DiscountRate = 5;</code>
   */
  double getDiscountRate();

  /**
   * <pre>
   * 使用次数限制
   * </pre>
   *
   * <code>int32 LimitTimes = 6;</code>
   */
  int getLimitTimes();

  /**
   * <pre>
   * 优惠总上限
   * </pre>
   *
   * <code>double TotalDiscountAmount = 7;</code>
   */
  double getTotalDiscountAmount();

  /**
   * <pre>
   * 单次优惠下限
   * </pre>
   *
   * <code>double SingleMinDiscountAmount = 8;</code>
   */
  double getSingleMinDiscountAmount();

  /**
   * <pre>
   * 单次优惠上限
   * </pre>
   *
   * <code>double SingleMaxDiscountAmount = 9;</code>
   */
  double getSingleMaxDiscountAmount();

  /**
   * <pre>
   * 折扣周期 与使用次数限制相关联 标识周期内的使用次数限制
   * </pre>
   *
   * <code>int32 Period = 10;</code>
   */
  int getPeriod();

  /**
   * <pre>
   * 活动名称
   * </pre>
   *
   * <code>string Name = 11;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * 活动名称
   * </pre>
   *
   * <code>string Name = 11;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
