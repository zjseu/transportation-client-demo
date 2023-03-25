// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType}
 */
public  final class TakeChildInfantNumLimitType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType)
    TakeChildInfantNumLimitTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TakeChildInfantNumLimitType.newBuilder() to construct.
  private TakeChildInfantNumLimitType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TakeChildInfantNumLimitType() {
    adtAgeLimit_ = 0;
    maxChdPerAdt_ = 0;
    maxInfPerAdt_ = 0;
    maxChdForCIPerAdt_ = 0;
    maxInfForCIPerAdt_ = 0;
    minAgeForChdTravelAlone_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TakeChildInfantNumLimitType(
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

            adtAgeLimit_ = input.readInt32();
            break;
          }
          case 16: {

            maxChdPerAdt_ = input.readInt32();
            break;
          }
          case 24: {

            maxInfPerAdt_ = input.readInt32();
            break;
          }
          case 32: {

            maxChdForCIPerAdt_ = input.readInt32();
            break;
          }
          case 40: {

            maxInfForCIPerAdt_ = input.readInt32();
            break;
          }
          case 48: {

            minAgeForChdTravelAlone_ = input.readInt32();
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
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_TakeChildInfantNumLimitType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_TakeChildInfantNumLimitType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType.class, com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType.Builder.class);
  }

  public static final int ADTAGELIMIT_FIELD_NUMBER = 1;
  private int adtAgeLimit_;
  /**
   * <pre>
   * 可携带儿童的成人年龄
   * </pre>
   *
   * <code>int32 AdtAgeLimit = 1;</code>
   */
  public int getAdtAgeLimit() {
    return adtAgeLimit_;
  }

  public static final int MAXCHDPERADT_FIELD_NUMBER = 2;
  private int maxChdPerAdt_;
  /**
   * <pre>
   * 可单独携带儿童的数量
   * </pre>
   *
   * <code>int32 MaxChdPerAdt = 2;</code>
   */
  public int getMaxChdPerAdt() {
    return maxChdPerAdt_;
  }

  public static final int MAXINFPERADT_FIELD_NUMBER = 3;
  private int maxInfPerAdt_;
  /**
   * <pre>
   * 可单独携带婴儿的数量
   * </pre>
   *
   * <code>int32 MaxInfPerAdt = 3;</code>
   */
  public int getMaxInfPerAdt() {
    return maxInfPerAdt_;
  }

  public static final int MAXCHDFORCIPERADT_FIELD_NUMBER = 4;
  private int maxChdForCIPerAdt_;
  /**
   * <pre>
   * 同时携带儿童婴儿，可携带儿童的数量
   * </pre>
   *
   * <code>int32 MaxChdForCIPerAdt = 4;</code>
   */
  public int getMaxChdForCIPerAdt() {
    return maxChdForCIPerAdt_;
  }

  public static final int MAXINFFORCIPERADT_FIELD_NUMBER = 5;
  private int maxInfForCIPerAdt_;
  /**
   * <pre>
   * 同时携带儿童婴儿，可携带婴儿的数量
   * </pre>
   *
   * <code>int32 MaxInfForCIPerAdt = 5;</code>
   */
  public int getMaxInfForCIPerAdt() {
    return maxInfForCIPerAdt_;
  }

  public static final int MINAGEFORCHDTRAVELALONE_FIELD_NUMBER = 6;
  private int minAgeForChdTravelAlone_;
  /**
   * <pre>
   * 儿童可单独出行的最低年龄
   * </pre>
   *
   * <code>int32 MinAgeForChdTravelAlone = 6;</code>
   */
  public int getMinAgeForChdTravelAlone() {
    return minAgeForChdTravelAlone_;
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
    if (adtAgeLimit_ != 0) {
      output.writeInt32(1, adtAgeLimit_);
    }
    if (maxChdPerAdt_ != 0) {
      output.writeInt32(2, maxChdPerAdt_);
    }
    if (maxInfPerAdt_ != 0) {
      output.writeInt32(3, maxInfPerAdt_);
    }
    if (maxChdForCIPerAdt_ != 0) {
      output.writeInt32(4, maxChdForCIPerAdt_);
    }
    if (maxInfForCIPerAdt_ != 0) {
      output.writeInt32(5, maxInfForCIPerAdt_);
    }
    if (minAgeForChdTravelAlone_ != 0) {
      output.writeInt32(6, minAgeForChdTravelAlone_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adtAgeLimit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, adtAgeLimit_);
    }
    if (maxChdPerAdt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxChdPerAdt_);
    }
    if (maxInfPerAdt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxInfPerAdt_);
    }
    if (maxChdForCIPerAdt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, maxChdForCIPerAdt_);
    }
    if (maxInfForCIPerAdt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, maxInfForCIPerAdt_);
    }
    if (minAgeForChdTravelAlone_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, minAgeForChdTravelAlone_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType other = (com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType) obj;

    boolean result = true;
    result = result && (getAdtAgeLimit()
        == other.getAdtAgeLimit());
    result = result && (getMaxChdPerAdt()
        == other.getMaxChdPerAdt());
    result = result && (getMaxInfPerAdt()
        == other.getMaxInfPerAdt());
    result = result && (getMaxChdForCIPerAdt()
        == other.getMaxChdForCIPerAdt());
    result = result && (getMaxInfForCIPerAdt()
        == other.getMaxInfForCIPerAdt());
    result = result && (getMinAgeForChdTravelAlone()
        == other.getMinAgeForChdTravelAlone());
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
    hash = (37 * hash) + ADTAGELIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getAdtAgeLimit();
    hash = (37 * hash) + MAXCHDPERADT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxChdPerAdt();
    hash = (37 * hash) + MAXINFPERADT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxInfPerAdt();
    hash = (37 * hash) + MAXCHDFORCIPERADT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxChdForCIPerAdt();
    hash = (37 * hash) + MAXINFFORCIPERADT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxInfForCIPerAdt();
    hash = (37 * hash) + MINAGEFORCHDTRAVELALONE_FIELD_NUMBER;
    hash = (53 * hash) + getMinAgeForChdTravelAlone();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType)
      com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_TakeChildInfantNumLimitType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_TakeChildInfantNumLimitType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType.class, com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType.newBuilder()
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
      adtAgeLimit_ = 0;

      maxChdPerAdt_ = 0;

      maxInfPerAdt_ = 0;

      maxChdForCIPerAdt_ = 0;

      maxInfForCIPerAdt_ = 0;

      minAgeForChdTravelAlone_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_TakeChildInfantNumLimitType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType result = new com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType(this);
      result.adtAgeLimit_ = adtAgeLimit_;
      result.maxChdPerAdt_ = maxChdPerAdt_;
      result.maxInfPerAdt_ = maxInfPerAdt_;
      result.maxChdForCIPerAdt_ = maxChdForCIPerAdt_;
      result.maxInfForCIPerAdt_ = maxInfForCIPerAdt_;
      result.minAgeForChdTravelAlone_ = minAgeForChdTravelAlone_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType.getDefaultInstance()) return this;
      if (other.getAdtAgeLimit() != 0) {
        setAdtAgeLimit(other.getAdtAgeLimit());
      }
      if (other.getMaxChdPerAdt() != 0) {
        setMaxChdPerAdt(other.getMaxChdPerAdt());
      }
      if (other.getMaxInfPerAdt() != 0) {
        setMaxInfPerAdt(other.getMaxInfPerAdt());
      }
      if (other.getMaxChdForCIPerAdt() != 0) {
        setMaxChdForCIPerAdt(other.getMaxChdForCIPerAdt());
      }
      if (other.getMaxInfForCIPerAdt() != 0) {
        setMaxInfForCIPerAdt(other.getMaxInfForCIPerAdt());
      }
      if (other.getMinAgeForChdTravelAlone() != 0) {
        setMinAgeForChdTravelAlone(other.getMinAgeForChdTravelAlone());
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
      com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int adtAgeLimit_ ;
    /**
     * <pre>
     * 可携带儿童的成人年龄
     * </pre>
     *
     * <code>int32 AdtAgeLimit = 1;</code>
     */
    public int getAdtAgeLimit() {
      return adtAgeLimit_;
    }
    /**
     * <pre>
     * 可携带儿童的成人年龄
     * </pre>
     *
     * <code>int32 AdtAgeLimit = 1;</code>
     */
    public Builder setAdtAgeLimit(int value) {
      
      adtAgeLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 可携带儿童的成人年龄
     * </pre>
     *
     * <code>int32 AdtAgeLimit = 1;</code>
     */
    public Builder clearAdtAgeLimit() {
      
      adtAgeLimit_ = 0;
      onChanged();
      return this;
    }

    private int maxChdPerAdt_ ;
    /**
     * <pre>
     * 可单独携带儿童的数量
     * </pre>
     *
     * <code>int32 MaxChdPerAdt = 2;</code>
     */
    public int getMaxChdPerAdt() {
      return maxChdPerAdt_;
    }
    /**
     * <pre>
     * 可单独携带儿童的数量
     * </pre>
     *
     * <code>int32 MaxChdPerAdt = 2;</code>
     */
    public Builder setMaxChdPerAdt(int value) {
      
      maxChdPerAdt_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 可单独携带儿童的数量
     * </pre>
     *
     * <code>int32 MaxChdPerAdt = 2;</code>
     */
    public Builder clearMaxChdPerAdt() {
      
      maxChdPerAdt_ = 0;
      onChanged();
      return this;
    }

    private int maxInfPerAdt_ ;
    /**
     * <pre>
     * 可单独携带婴儿的数量
     * </pre>
     *
     * <code>int32 MaxInfPerAdt = 3;</code>
     */
    public int getMaxInfPerAdt() {
      return maxInfPerAdt_;
    }
    /**
     * <pre>
     * 可单独携带婴儿的数量
     * </pre>
     *
     * <code>int32 MaxInfPerAdt = 3;</code>
     */
    public Builder setMaxInfPerAdt(int value) {
      
      maxInfPerAdt_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 可单独携带婴儿的数量
     * </pre>
     *
     * <code>int32 MaxInfPerAdt = 3;</code>
     */
    public Builder clearMaxInfPerAdt() {
      
      maxInfPerAdt_ = 0;
      onChanged();
      return this;
    }

    private int maxChdForCIPerAdt_ ;
    /**
     * <pre>
     * 同时携带儿童婴儿，可携带儿童的数量
     * </pre>
     *
     * <code>int32 MaxChdForCIPerAdt = 4;</code>
     */
    public int getMaxChdForCIPerAdt() {
      return maxChdForCIPerAdt_;
    }
    /**
     * <pre>
     * 同时携带儿童婴儿，可携带儿童的数量
     * </pre>
     *
     * <code>int32 MaxChdForCIPerAdt = 4;</code>
     */
    public Builder setMaxChdForCIPerAdt(int value) {
      
      maxChdForCIPerAdt_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 同时携带儿童婴儿，可携带儿童的数量
     * </pre>
     *
     * <code>int32 MaxChdForCIPerAdt = 4;</code>
     */
    public Builder clearMaxChdForCIPerAdt() {
      
      maxChdForCIPerAdt_ = 0;
      onChanged();
      return this;
    }

    private int maxInfForCIPerAdt_ ;
    /**
     * <pre>
     * 同时携带儿童婴儿，可携带婴儿的数量
     * </pre>
     *
     * <code>int32 MaxInfForCIPerAdt = 5;</code>
     */
    public int getMaxInfForCIPerAdt() {
      return maxInfForCIPerAdt_;
    }
    /**
     * <pre>
     * 同时携带儿童婴儿，可携带婴儿的数量
     * </pre>
     *
     * <code>int32 MaxInfForCIPerAdt = 5;</code>
     */
    public Builder setMaxInfForCIPerAdt(int value) {
      
      maxInfForCIPerAdt_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 同时携带儿童婴儿，可携带婴儿的数量
     * </pre>
     *
     * <code>int32 MaxInfForCIPerAdt = 5;</code>
     */
    public Builder clearMaxInfForCIPerAdt() {
      
      maxInfForCIPerAdt_ = 0;
      onChanged();
      return this;
    }

    private int minAgeForChdTravelAlone_ ;
    /**
     * <pre>
     * 儿童可单独出行的最低年龄
     * </pre>
     *
     * <code>int32 MinAgeForChdTravelAlone = 6;</code>
     */
    public int getMinAgeForChdTravelAlone() {
      return minAgeForChdTravelAlone_;
    }
    /**
     * <pre>
     * 儿童可单独出行的最低年龄
     * </pre>
     *
     * <code>int32 MinAgeForChdTravelAlone = 6;</code>
     */
    public Builder setMinAgeForChdTravelAlone(int value) {
      
      minAgeForChdTravelAlone_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 儿童可单独出行的最低年龄
     * </pre>
     *
     * <code>int32 MinAgeForChdTravelAlone = 6;</code>
     */
    public Builder clearMinAgeForChdTravelAlone() {
      
      minAgeForChdTravelAlone_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TakeChildInfantNumLimitType>
      PARSER = new com.google.protobuf.AbstractParser<TakeChildInfantNumLimitType>() {
    @java.lang.Override
    public TakeChildInfantNumLimitType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TakeChildInfantNumLimitType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TakeChildInfantNumLimitType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TakeChildInfantNumLimitType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.TakeChildInfantNumLimitType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
