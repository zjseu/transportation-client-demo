// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

public interface FlightSupplierTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.response.FlightSupplierType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 票台ID
   * </pre>
   *
   * <code>int32 AgencyID = 1;</code>
   */
  int getAgencyID();

  /**
   * <pre>
   * 供应商名称，iata号码的信息放在IATANumber节点中
   * </pre>
   *
   * <code>string OfficialName = 2;</code>
   */
  java.lang.String getOfficialName();
  /**
   * <pre>
   * 供应商名称，iata号码的信息放在IATANumber节点中
   * </pre>
   *
   * <code>string OfficialName = 2;</code>
   */
  com.google.protobuf.ByteString
      getOfficialNameBytes();

  /**
   * <pre>
   * IATA号
   * </pre>
   *
   * <code>string IATANumber = 3;</code>
   */
  java.lang.String getIATANumber();
  /**
   * <pre>
   * IATA号
   * </pre>
   *
   * <code>string IATANumber = 3;</code>
   */
  com.google.protobuf.ByteString
      getIATANumberBytes();

  /**
   * <pre>
   * 票台披露信息，比如代理资质：“中国国航授权代理”
   * </pre>
   *
   * <code>string AgentDisclosure = 4;</code>
   */
  java.lang.String getAgentDisclosure();
  /**
   * <pre>
   * 票台披露信息，比如代理资质：“中国国航授权代理”
   * </pre>
   *
   * <code>string AgentDisclosure = 4;</code>
   */
  com.google.protobuf.ByteString
      getAgentDisclosureBytes();

  /**
   * <pre>
   * 供应商资质信息
   * </pre>
   *
   * <code>string AgencyLicenseUrl = 5;</code>
   */
  java.lang.String getAgencyLicenseUrl();
  /**
   * <pre>
   * 供应商资质信息
   * </pre>
   *
   * <code>string AgencyLicenseUrl = 5;</code>
   */
  com.google.protobuf.ByteString
      getAgencyLicenseUrlBytes();
}
