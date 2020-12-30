// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaijiCommonTypes.proto

package com.ctrip.soa;

/**
 * Protobuf enum {@code com.ctrip.soa.AckCodeType}
 */
public enum AckCodeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Success = 0;</code>
   */
  Success(0),
  /**
   * <code>Failure = 1;</code>
   */
  Failure(1),
  /**
   * <code>Warning = 2;</code>
   */
  Warning(2),
  /**
   * <code>PartialFailure = 3;</code>
   */
  PartialFailure(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Success = 0;</code>
   */
  public static final int Success_VALUE = 0;
  /**
   * <code>Failure = 1;</code>
   */
  public static final int Failure_VALUE = 1;
  /**
   * <code>Warning = 2;</code>
   */
  public static final int Warning_VALUE = 2;
  /**
   * <code>PartialFailure = 3;</code>
   */
  public static final int PartialFailure_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static AckCodeType valueOf(int value) {
    return forNumber(value);
  }

  public static AckCodeType forNumber(int value) {
    switch (value) {
      case 0: return Success;
      case 1: return Failure;
      case 2: return Warning;
      case 3: return PartialFailure;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AckCodeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AckCodeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AckCodeType>() {
          public AckCodeType findValueByNumber(int number) {
            return AckCodeType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.ctrip.soa.BaijiCommonTypes.getDescriptor().getEnumTypes().get(0);
  }

  private static final AckCodeType[] VALUES = values();

  public static AckCodeType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AckCodeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.ctrip.soa.AckCodeType)
}

