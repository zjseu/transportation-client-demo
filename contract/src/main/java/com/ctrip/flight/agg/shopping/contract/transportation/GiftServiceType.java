// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType}
 */
public  final class GiftServiceType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType)
    GiftServiceTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GiftServiceType.newBuilder() to construct.
  private GiftServiceType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GiftServiceType() {
    serviceID_ = 0L;
    serviceName_ = "";
    serviceType_ = 0;
    checked_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GiftServiceType(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            serviceID_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            serviceName_ = s;
            break;
          }
          case 24: {

            serviceType_ = input.readInt32();
            break;
          }
          case 32: {

            checked_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_GiftServiceType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_GiftServiceType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType.class, com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType.Builder.class);
  }

  public static final int SERVICEID_FIELD_NUMBER = 1;
  private long serviceID_;
  /**
   * <pre>
   *服务ID
   * </pre>
   *
   * <code>int64 ServiceID = 1;</code>
   */
  public long getServiceID() {
    return serviceID_;
  }

  public static final int SERVICENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object serviceName_;
  /**
   * <pre>
   * 服务名
   * </pre>
   *
   * <code>string ServiceName = 2;</code>
   */
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 服务名
   * </pre>
   *
   * <code>string ServiceName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICETYPE_FIELD_NUMBER = 3;
  private int serviceType_;
  /**
   * <pre>
   * 服务类型，1：基础类服务，2：增值类服务
   * </pre>
   *
   * <code>int32 ServiceType = 3;</code>
   */
  public int getServiceType() {
    return serviceType_;
  }

  public static final int CHECKED_FIELD_NUMBER = 4;
  private boolean checked_;
  /**
   * <pre>
   *礼盒界面上是否勾选当前服务,如中转的行李直挂、放心出行等，前端会根据此信息来展示不同的文本, 0:false,1:true
   * </pre>
   *
   * <code>bool Checked = 4;</code>
   */
  public boolean getChecked() {
    return checked_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (serviceID_ != 0L) {
      output.writeInt64(1, serviceID_);
    }
    if (!getServiceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceName_);
    }
    if (serviceType_ != 0) {
      output.writeInt32(3, serviceType_);
    }
    if (checked_ != false) {
      output.writeBool(4, checked_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (serviceID_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, serviceID_);
    }
    if (!getServiceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceName_);
    }
    if (serviceType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, serviceType_);
    }
    if (checked_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, checked_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType other = (com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType) obj;

    boolean result = true;
    result = result && (getServiceID()
        == other.getServiceID());
    result = result && getServiceName()
        .equals(other.getServiceName());
    result = result && (getServiceType()
        == other.getServiceType());
    result = result && (getChecked()
        == other.getChecked());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVICEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getServiceID());
    hash = (37 * hash) + SERVICENAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    hash = (37 * hash) + SERVICETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getServiceType();
    hash = (37 * hash) + CHECKED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getChecked());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType)
      com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_GiftServiceType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_GiftServiceType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType.class, com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      serviceID_ = 0L;

      serviceName_ = "";

      serviceType_ = 0;

      checked_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_GiftServiceType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType result = new com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType(this);
      result.serviceID_ = serviceID_;
      result.serviceName_ = serviceName_;
      result.serviceType_ = serviceType_;
      result.checked_ = checked_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType.getDefaultInstance()) return this;
      if (other.getServiceID() != 0L) {
        setServiceID(other.getServiceID());
      }
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        onChanged();
      }
      if (other.getServiceType() != 0) {
        setServiceType(other.getServiceType());
      }
      if (other.getChecked() != false) {
        setChecked(other.getChecked());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long serviceID_ ;
    /**
     * <pre>
     *服务ID
     * </pre>
     *
     * <code>int64 ServiceID = 1;</code>
     */
    public long getServiceID() {
      return serviceID_;
    }
    /**
     * <pre>
     *服务ID
     * </pre>
     *
     * <code>int64 ServiceID = 1;</code>
     */
    public Builder setServiceID(long value) {
      
      serviceID_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *服务ID
     * </pre>
     *
     * <code>int64 ServiceID = 1;</code>
     */
    public Builder clearServiceID() {
      
      serviceID_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object serviceName_ = "";
    /**
     * <pre>
     * 服务名
     * </pre>
     *
     * <code>string ServiceName = 2;</code>
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 服务名
     * </pre>
     *
     * <code>string ServiceName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 服务名
     * </pre>
     *
     * <code>string ServiceName = 2;</code>
     */
    public Builder setServiceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 服务名
     * </pre>
     *
     * <code>string ServiceName = 2;</code>
     */
    public Builder clearServiceName() {
      
      serviceName_ = getDefaultInstance().getServiceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 服务名
     * </pre>
     *
     * <code>string ServiceName = 2;</code>
     */
    public Builder setServiceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceName_ = value;
      onChanged();
      return this;
    }

    private int serviceType_ ;
    /**
     * <pre>
     * 服务类型，1：基础类服务，2：增值类服务
     * </pre>
     *
     * <code>int32 ServiceType = 3;</code>
     */
    public int getServiceType() {
      return serviceType_;
    }
    /**
     * <pre>
     * 服务类型，1：基础类服务，2：增值类服务
     * </pre>
     *
     * <code>int32 ServiceType = 3;</code>
     */
    public Builder setServiceType(int value) {
      
      serviceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 服务类型，1：基础类服务，2：增值类服务
     * </pre>
     *
     * <code>int32 ServiceType = 3;</code>
     */
    public Builder clearServiceType() {
      
      serviceType_ = 0;
      onChanged();
      return this;
    }

    private boolean checked_ ;
    /**
     * <pre>
     *礼盒界面上是否勾选当前服务,如中转的行李直挂、放心出行等，前端会根据此信息来展示不同的文本, 0:false,1:true
     * </pre>
     *
     * <code>bool Checked = 4;</code>
     */
    public boolean getChecked() {
      return checked_;
    }
    /**
     * <pre>
     *礼盒界面上是否勾选当前服务,如中转的行李直挂、放心出行等，前端会根据此信息来展示不同的文本, 0:false,1:true
     * </pre>
     *
     * <code>bool Checked = 4;</code>
     */
    public Builder setChecked(boolean value) {
      
      checked_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *礼盒界面上是否勾选当前服务,如中转的行李直挂、放心出行等，前端会根据此信息来展示不同的文本, 0:false,1:true
     * </pre>
     *
     * <code>bool Checked = 4;</code>
     */
    public Builder clearChecked() {
      
      checked_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GiftServiceType>
      PARSER = new com.google.protobuf.AbstractParser<GiftServiceType>() {
    @java.lang.Override
    public GiftServiceType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GiftServiceType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GiftServiceType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GiftServiceType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

