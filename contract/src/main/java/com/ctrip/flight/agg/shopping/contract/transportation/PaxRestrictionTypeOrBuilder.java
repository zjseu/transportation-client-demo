// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface PaxRestrictionTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.PaxRestrictionType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 人数限制
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType PaxCountRange = 1;</code>
   */
  boolean hasPaxCountRange();
  /**
   * <pre>
   * 人数限制
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType PaxCountRange = 1;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType getPaxCountRange();
  /**
   * <pre>
   * 人数限制
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType PaxCountRange = 1;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.IntRangeTypeOrBuilder getPaxCountRangeOrBuilder();

  /**
   * <pre>
   * 年龄限制类型，0:AllPassengers, 1:OnePassengerAtLeast
   * </pre>
   *
   * <code>int32 AgeLimitType = 2;</code>
   */
  int getAgeLimitType();

  /**
   * <pre>
   * 年龄限制。部分特殊运价可能包含多个年龄范围。国内票对应了原Restrictions.PassengerAgeLimit字段
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType AgeLimitRange = 3;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType> 
      getAgeLimitRangeList();
  /**
   * <pre>
   * 年龄限制。部分特殊运价可能包含多个年龄范围。国内票对应了原Restrictions.PassengerAgeLimit字段
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType AgeLimitRange = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType getAgeLimitRange(int index);
  /**
   * <pre>
   * 年龄限制。部分特殊运价可能包含多个年龄范围。国内票对应了原Restrictions.PassengerAgeLimit字段
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType AgeLimitRange = 3;</code>
   */
  int getAgeLimitRangeCount();
  /**
   * <pre>
   * 年龄限制。部分特殊运价可能包含多个年龄范围。国内票对应了原Restrictions.PassengerAgeLimit字段
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType AgeLimitRange = 3;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.IntRangeTypeOrBuilder> 
      getAgeLimitRangeOrBuilderList();
  /**
   * <pre>
   * 年龄限制。部分特殊运价可能包含多个年龄范围。国内票对应了原Restrictions.PassengerAgeLimit字段
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType AgeLimitRange = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.IntRangeTypeOrBuilder getAgeLimitRangeOrBuilder(
      int index);

  /**
   * <pre>
   * 国籍白名单
   * </pre>
   *
   * <code>repeated string NationalityAllow = 4;</code>
   */
  java.util.List<java.lang.String>
      getNationalityAllowList();
  /**
   * <pre>
   * 国籍白名单
   * </pre>
   *
   * <code>repeated string NationalityAllow = 4;</code>
   */
  int getNationalityAllowCount();
  /**
   * <pre>
   * 国籍白名单
   * </pre>
   *
   * <code>repeated string NationalityAllow = 4;</code>
   */
  java.lang.String getNationalityAllow(int index);
  /**
   * <pre>
   * 国籍白名单
   * </pre>
   *
   * <code>repeated string NationalityAllow = 4;</code>
   */
  com.google.protobuf.ByteString
      getNationalityAllowBytes(int index);

  /**
   * <pre>
   * 国籍黑名单
   * </pre>
   *
   * <code>repeated string NationalityBlock = 5;</code>
   */
  java.util.List<java.lang.String>
      getNationalityBlockList();
  /**
   * <pre>
   * 国籍黑名单
   * </pre>
   *
   * <code>repeated string NationalityBlock = 5;</code>
   */
  int getNationalityBlockCount();
  /**
   * <pre>
   * 国籍黑名单
   * </pre>
   *
   * <code>repeated string NationalityBlock = 5;</code>
   */
  java.lang.String getNationalityBlock(int index);
  /**
   * <pre>
   * 国籍黑名单
   * </pre>
   *
   * <code>repeated string NationalityBlock = 5;</code>
   */
  com.google.protobuf.ByteString
      getNationalityBlockBytes(int index);
}