// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.travix.proto

package com.ctrip.flight.agg.shopping.contract.transportation.travix;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType}
 */
public  final class JourneyOptionType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType)
    JourneyOptionTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JourneyOptionType.newBuilder() to construct.
  private JourneyOptionType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JourneyOptionType() {
    departRegion_ = "";
    arriveRegion_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JourneyOptionType(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            departRegion_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            arriveRegion_ = s;
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
    return com.ctrip.flight.agg.shopping.contract.transportation.travix.ComCtripFlightAggShoppingContractTransportationTravix.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_JourneyOptionType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.travix.ComCtripFlightAggShoppingContractTransportationTravix.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_JourneyOptionType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType.class, com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType.Builder.class);
  }

  public static final int DEPARTREGION_FIELD_NUMBER = 1;
  private volatile java.lang.Object departRegion_;
  /**
   * <code>string DepartRegion = 1;</code>
   */
  public java.lang.String getDepartRegion() {
    java.lang.Object ref = departRegion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      departRegion_ = s;
      return s;
    }
  }
  /**
   * <code>string DepartRegion = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDepartRegionBytes() {
    java.lang.Object ref = departRegion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      departRegion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARRIVEREGION_FIELD_NUMBER = 2;
  private volatile java.lang.Object arriveRegion_;
  /**
   * <code>string ArriveRegion = 2;</code>
   */
  public java.lang.String getArriveRegion() {
    java.lang.Object ref = arriveRegion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      arriveRegion_ = s;
      return s;
    }
  }
  /**
   * <code>string ArriveRegion = 2;</code>
   */
  public com.google.protobuf.ByteString
      getArriveRegionBytes() {
    java.lang.Object ref = arriveRegion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      arriveRegion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getDepartRegionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, departRegion_);
    }
    if (!getArriveRegionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, arriveRegion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDepartRegionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, departRegion_);
    }
    if (!getArriveRegionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, arriveRegion_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType other = (com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType) obj;

    boolean result = true;
    result = result && getDepartRegion()
        .equals(other.getDepartRegion());
    result = result && getArriveRegion()
        .equals(other.getArriveRegion());
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
    hash = (37 * hash) + DEPARTREGION_FIELD_NUMBER;
    hash = (53 * hash) + getDepartRegion().hashCode();
    hash = (37 * hash) + ARRIVEREGION_FIELD_NUMBER;
    hash = (53 * hash) + getArriveRegion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType)
      com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.travix.ComCtripFlightAggShoppingContractTransportationTravix.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_JourneyOptionType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.travix.ComCtripFlightAggShoppingContractTransportationTravix.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_JourneyOptionType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType.class, com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType.newBuilder()
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
      departRegion_ = "";

      arriveRegion_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.travix.ComCtripFlightAggShoppingContractTransportationTravix.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_travix_JourneyOptionType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType result = new com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType(this);
      result.departRegion_ = departRegion_;
      result.arriveRegion_ = arriveRegion_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType.getDefaultInstance()) return this;
      if (!other.getDepartRegion().isEmpty()) {
        departRegion_ = other.departRegion_;
        onChanged();
      }
      if (!other.getArriveRegion().isEmpty()) {
        arriveRegion_ = other.arriveRegion_;
        onChanged();
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
      com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object departRegion_ = "";
    /**
     * <code>string DepartRegion = 1;</code>
     */
    public java.lang.String getDepartRegion() {
      java.lang.Object ref = departRegion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        departRegion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string DepartRegion = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDepartRegionBytes() {
      java.lang.Object ref = departRegion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        departRegion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string DepartRegion = 1;</code>
     */
    public Builder setDepartRegion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      departRegion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string DepartRegion = 1;</code>
     */
    public Builder clearDepartRegion() {
      
      departRegion_ = getDefaultInstance().getDepartRegion();
      onChanged();
      return this;
    }
    /**
     * <code>string DepartRegion = 1;</code>
     */
    public Builder setDepartRegionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      departRegion_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object arriveRegion_ = "";
    /**
     * <code>string ArriveRegion = 2;</code>
     */
    public java.lang.String getArriveRegion() {
      java.lang.Object ref = arriveRegion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        arriveRegion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ArriveRegion = 2;</code>
     */
    public com.google.protobuf.ByteString
        getArriveRegionBytes() {
      java.lang.Object ref = arriveRegion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        arriveRegion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ArriveRegion = 2;</code>
     */
    public Builder setArriveRegion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      arriveRegion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ArriveRegion = 2;</code>
     */
    public Builder clearArriveRegion() {
      
      arriveRegion_ = getDefaultInstance().getArriveRegion();
      onChanged();
      return this;
    }
    /**
     * <code>string ArriveRegion = 2;</code>
     */
    public Builder setArriveRegionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      arriveRegion_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JourneyOptionType>
      PARSER = new com.google.protobuf.AbstractParser<JourneyOptionType>() {
    @java.lang.Override
    public JourneyOptionType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JourneyOptionType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JourneyOptionType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JourneyOptionType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.travix.JourneyOptionType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

