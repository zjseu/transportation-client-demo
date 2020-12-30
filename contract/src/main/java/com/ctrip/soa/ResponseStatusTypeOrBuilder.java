// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaijiCommonTypes.proto

package com.ctrip.soa;

public interface ResponseStatusTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.soa.ResponseStatusType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.ctrip.soa.DateTime Timestamp = 1;</code>
   */
  boolean hasTimestamp();
  /**
   * <code>.com.ctrip.soa.DateTime Timestamp = 1;</code>
   */
  com.ctrip.soa.DateTime getTimestamp();
  /**
   * <code>.com.ctrip.soa.DateTime Timestamp = 1;</code>
   */
  com.ctrip.soa.DateTimeOrBuilder getTimestampOrBuilder();

  /**
   * <code>.com.ctrip.soa.AckCodeType Ack = 2;</code>
   */
  int getAckValue();
  /**
   * <code>.com.ctrip.soa.AckCodeType Ack = 2;</code>
   */
  com.ctrip.soa.AckCodeType getAck();

  /**
   * <code>.com.ctrip.soa.ErrorDataType Errors = 3;</code>
   */
  boolean hasErrors();
  /**
   * <code>.com.ctrip.soa.ErrorDataType Errors = 3;</code>
   */
  com.ctrip.soa.ErrorDataType getErrors();
  /**
   * <code>.com.ctrip.soa.ErrorDataType Errors = 3;</code>
   */
  com.ctrip.soa.ErrorDataTypeOrBuilder getErrorsOrBuilder();

  /**
   * <code>string Build = 4;</code>
   */
  String getBuild();
  /**
   * <code>string Build = 4;</code>
   */
  com.google.protobuf.ByteString
      getBuildBytes();

  /**
   * <code>string Version = 5;</code>
   */
  String getVersion();
  /**
   * <code>string Version = 5;</code>
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>repeated .com.ctrip.soa.ExtensionType Extension = 6;</code>
   */
  java.util.List<com.ctrip.soa.ExtensionType>
      getExtensionList();
  /**
   * <code>repeated .com.ctrip.soa.ExtensionType Extension = 6;</code>
   */
  com.ctrip.soa.ExtensionType getExtension(int index);
  /**
   * <code>repeated .com.ctrip.soa.ExtensionType Extension = 6;</code>
   */
  int getExtensionCount();
  /**
   * <code>repeated .com.ctrip.soa.ExtensionType Extension = 6;</code>
   */
  java.util.List<? extends com.ctrip.soa.ExtensionTypeOrBuilder>
      getExtensionOrBuilderList();
  /**
   * <code>repeated .com.ctrip.soa.ExtensionType Extension = 6;</code>
   */
  com.ctrip.soa.ExtensionTypeOrBuilder getExtensionOrBuilder(
          int index);
}
