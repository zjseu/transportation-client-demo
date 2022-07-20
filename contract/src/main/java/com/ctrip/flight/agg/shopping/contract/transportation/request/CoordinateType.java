// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.request.proto

package com.ctrip.flight.agg.shopping.contract.transportation.request;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType}
 */
public  final class CoordinateType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType)
    CoordinateTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CoordinateType.newBuilder() to construct.
  private CoordinateType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CoordinateType() {
    longitude_ = 0D;
    latitude_ = 0D;
    updateTime_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CoordinateType(
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
          case 9: {

            longitude_ = input.readDouble();
            break;
          }
          case 17: {

            latitude_ = input.readDouble();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            updateTime_ = s;
            break;
          }
          case 34: {
            com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType.Builder subBuilder = null;
            if (location_ != null) {
              subBuilder = location_.toBuilder();
            }
            location_ = input.readMessage(com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(location_);
              location_ = subBuilder.buildPartial();
            }

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
    return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_CoordinateType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_CoordinateType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType.class, com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType.Builder.class);
  }

  public static final int LONGITUDE_FIELD_NUMBER = 1;
  private double longitude_;
  /**
   * <pre>
   * 经度
   * </pre>
   *
   * <code>double Longitude = 1;</code>
   */
  public double getLongitude() {
    return longitude_;
  }

  public static final int LATITUDE_FIELD_NUMBER = 2;
  private double latitude_;
  /**
   * <pre>
   * 纬度
   * </pre>
   *
   * <code>double Latitude = 2;</code>
   */
  public double getLatitude() {
    return latitude_;
  }

  public static final int UPDATETIME_FIELD_NUMBER = 3;
  private volatile java.lang.Object updateTime_;
  /**
   * <pre>
   * 更新时间 format：yyyy-MM-dd'T'HH:mm:ss'Z'
   * </pre>
   *
   * <code>string UpdateTime = 3;</code>
   */
  public java.lang.String getUpdateTime() {
    java.lang.Object ref = updateTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      updateTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 更新时间 format：yyyy-MM-dd'T'HH:mm:ss'Z'
   * </pre>
   *
   * <code>string UpdateTime = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUpdateTimeBytes() {
    java.lang.Object ref = updateTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      updateTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 4;
  private com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType location_;
  /**
   * <pre>
   * 用户位置信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType Location = 4;</code>
   */
  public boolean hasLocation() {
    return location_ != null;
  }
  /**
   * <pre>
   * 用户位置信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType Location = 4;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType getLocation() {
    return location_ == null ? com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType.getDefaultInstance() : location_;
  }
  /**
   * <pre>
   * 用户位置信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType Location = 4;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.request.LocationTypeOrBuilder getLocationOrBuilder() {
    return getLocation();
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
    if (longitude_ != 0D) {
      output.writeDouble(1, longitude_);
    }
    if (latitude_ != 0D) {
      output.writeDouble(2, latitude_);
    }
    if (!getUpdateTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, updateTime_);
    }
    if (location_ != null) {
      output.writeMessage(4, getLocation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (longitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, longitude_);
    }
    if (latitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, latitude_);
    }
    if (!getUpdateTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, updateTime_);
    }
    if (location_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getLocation());
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType other = (com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getLongitude())
        == java.lang.Double.doubleToLongBits(
            other.getLongitude()));
    result = result && (
        java.lang.Double.doubleToLongBits(getLatitude())
        == java.lang.Double.doubleToLongBits(
            other.getLatitude()));
    result = result && getUpdateTime()
        .equals(other.getUpdateTime());
    result = result && (hasLocation() == other.hasLocation());
    if (hasLocation()) {
      result = result && getLocation()
          .equals(other.getLocation());
    }
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
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + UPDATETIME_FIELD_NUMBER;
    hash = (53 * hash) + getUpdateTime().hashCode();
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType)
      com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_CoordinateType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_CoordinateType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType.class, com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType.newBuilder()
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
      longitude_ = 0D;

      latitude_ = 0D;

      updateTime_ = "";

      if (locationBuilder_ == null) {
        location_ = null;
      } else {
        location_ = null;
        locationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_CoordinateType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType result = new com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType(this);
      result.longitude_ = longitude_;
      result.latitude_ = latitude_;
      result.updateTime_ = updateTime_;
      if (locationBuilder_ == null) {
        result.location_ = location_;
      } else {
        result.location_ = locationBuilder_.build();
      }
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType.getDefaultInstance()) return this;
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
      }
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (!other.getUpdateTime().isEmpty()) {
        updateTime_ = other.updateTime_;
        onChanged();
      }
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
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
      com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double longitude_ ;
    /**
     * <pre>
     * 经度
     * </pre>
     *
     * <code>double Longitude = 1;</code>
     */
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <pre>
     * 经度
     * </pre>
     *
     * <code>double Longitude = 1;</code>
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 经度
     * </pre>
     *
     * <code>double Longitude = 1;</code>
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
      onChanged();
      return this;
    }

    private double latitude_ ;
    /**
     * <pre>
     * 纬度
     * </pre>
     *
     * <code>double Latitude = 2;</code>
     */
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <pre>
     * 纬度
     * </pre>
     *
     * <code>double Latitude = 2;</code>
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 纬度
     * </pre>
     *
     * <code>double Latitude = 2;</code>
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object updateTime_ = "";
    /**
     * <pre>
     * 更新时间 format：yyyy-MM-dd'T'HH:mm:ss'Z'
     * </pre>
     *
     * <code>string UpdateTime = 3;</code>
     */
    public java.lang.String getUpdateTime() {
      java.lang.Object ref = updateTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        updateTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 更新时间 format：yyyy-MM-dd'T'HH:mm:ss'Z'
     * </pre>
     *
     * <code>string UpdateTime = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUpdateTimeBytes() {
      java.lang.Object ref = updateTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        updateTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 更新时间 format：yyyy-MM-dd'T'HH:mm:ss'Z'
     * </pre>
     *
     * <code>string UpdateTime = 3;</code>
     */
    public Builder setUpdateTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      updateTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 更新时间 format：yyyy-MM-dd'T'HH:mm:ss'Z'
     * </pre>
     *
     * <code>string UpdateTime = 3;</code>
     */
    public Builder clearUpdateTime() {
      
      updateTime_ = getDefaultInstance().getUpdateTime();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 更新时间 format：yyyy-MM-dd'T'HH:mm:ss'Z'
     * </pre>
     *
     * <code>string UpdateTime = 3;</code>
     */
    public Builder setUpdateTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      updateTime_ = value;
      onChanged();
      return this;
    }

    private com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType location_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType, com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.request.LocationTypeOrBuilder> locationBuilder_;
    /**
     * <pre>
     * 用户位置信息
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType Location = 4;</code>
     */
    public boolean hasLocation() {
      return locationBuilder_ != null || location_ != null;
    }
    /**
     * <pre>
     * 用户位置信息
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType Location = 4;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 用户位置信息
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType Location = 4;</code>
     */
    public Builder setLocation(com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
        onChanged();
      } else {
        locationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 用户位置信息
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType Location = 4;</code>
     */
    public Builder setLocation(
        com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
        onChanged();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 用户位置信息
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType Location = 4;</code>
     */
    public Builder mergeLocation(com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType value) {
      if (locationBuilder_ == null) {
        if (location_ != null) {
          location_ =
            com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType.newBuilder(location_).mergeFrom(value).buildPartial();
        } else {
          location_ = value;
        }
        onChanged();
      } else {
        locationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 用户位置信息
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType Location = 4;</code>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        location_ = null;
        onChanged();
      } else {
        location_ = null;
        locationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 用户位置信息
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType Location = 4;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType.Builder getLocationBuilder() {
      
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 用户位置信息
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType Location = 4;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.request.LocationTypeOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType.getDefaultInstance() : location_;
      }
    }
    /**
     * <pre>
     * 用户位置信息
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType Location = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType, com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.request.LocationTypeOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType, com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.request.LocationTypeOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CoordinateType>
      PARSER = new com.google.protobuf.AbstractParser<CoordinateType>() {
    @java.lang.Override
    public CoordinateType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CoordinateType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CoordinateType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CoordinateType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.request.CoordinateType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

