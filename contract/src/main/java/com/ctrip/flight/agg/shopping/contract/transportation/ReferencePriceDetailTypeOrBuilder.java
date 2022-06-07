// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface ReferencePriceDetailTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 升舱参考价 用于给前端展示升舱产品优势价差；优势价差 = 升舱参考价-客人购买经济舱价格-升舱费用
   * </pre>
   *
   * <code>double UpgradeClassReferencePrice = 1;</code>
   */
  double getUpgradeClassReferencePrice();

  /**
   * <pre>
   * 飞宿最低价,(机票价格+酒店价格)&gt;飞宿最低价
   * </pre>
   *
   * <code>double FlightHotelLowestPrice = 2;</code>
   */
  double getFlightHotelLowestPrice();
}
