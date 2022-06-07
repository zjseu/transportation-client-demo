// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * <pre>
 * 参考价明细信息
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType}
 */
public  final class ReferencePriceDetailType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType)
    ReferencePriceDetailTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReferencePriceDetailType.newBuilder() to construct.
  private ReferencePriceDetailType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReferencePriceDetailType() {
    upgradeClassReferencePrice_ = 0D;
    flightHotelLowestPrice_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReferencePriceDetailType(
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

            upgradeClassReferencePrice_ = input.readDouble();
            break;
          }
          case 17: {

            flightHotelLowestPrice_ = input.readDouble();
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
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ReferencePriceDetailType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ReferencePriceDetailType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType.class, com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType.Builder.class);
  }

  public static final int UPGRADECLASSREFERENCEPRICE_FIELD_NUMBER = 1;
  private double upgradeClassReferencePrice_;
  /**
   * <pre>
   * 升舱参考价 用于给前端展示升舱产品优势价差；优势价差 = 升舱参考价-客人购买经济舱价格-升舱费用
   * </pre>
   *
   * <code>double UpgradeClassReferencePrice = 1;</code>
   */
  public double getUpgradeClassReferencePrice() {
    return upgradeClassReferencePrice_;
  }

  public static final int FLIGHTHOTELLOWESTPRICE_FIELD_NUMBER = 2;
  private double flightHotelLowestPrice_;
  /**
   * <pre>
   * 飞宿最低价,(机票价格+酒店价格)&gt;飞宿最低价
   * </pre>
   *
   * <code>double FlightHotelLowestPrice = 2;</code>
   */
  public double getFlightHotelLowestPrice() {
    return flightHotelLowestPrice_;
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
    if (upgradeClassReferencePrice_ != 0D) {
      output.writeDouble(1, upgradeClassReferencePrice_);
    }
    if (flightHotelLowestPrice_ != 0D) {
      output.writeDouble(2, flightHotelLowestPrice_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (upgradeClassReferencePrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, upgradeClassReferencePrice_);
    }
    if (flightHotelLowestPrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, flightHotelLowestPrice_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType other = (com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getUpgradeClassReferencePrice())
        == java.lang.Double.doubleToLongBits(
            other.getUpgradeClassReferencePrice()));
    result = result && (
        java.lang.Double.doubleToLongBits(getFlightHotelLowestPrice())
        == java.lang.Double.doubleToLongBits(
            other.getFlightHotelLowestPrice()));
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
    hash = (37 * hash) + UPGRADECLASSREFERENCEPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getUpgradeClassReferencePrice()));
    hash = (37 * hash) + FLIGHTHOTELLOWESTPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFlightHotelLowestPrice()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType prototype) {
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
   * <pre>
   * 参考价明细信息
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType)
      com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ReferencePriceDetailType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ReferencePriceDetailType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType.class, com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType.newBuilder()
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
      upgradeClassReferencePrice_ = 0D;

      flightHotelLowestPrice_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ReferencePriceDetailType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType result = new com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType(this);
      result.upgradeClassReferencePrice_ = upgradeClassReferencePrice_;
      result.flightHotelLowestPrice_ = flightHotelLowestPrice_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType.getDefaultInstance()) return this;
      if (other.getUpgradeClassReferencePrice() != 0D) {
        setUpgradeClassReferencePrice(other.getUpgradeClassReferencePrice());
      }
      if (other.getFlightHotelLowestPrice() != 0D) {
        setFlightHotelLowestPrice(other.getFlightHotelLowestPrice());
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
      com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double upgradeClassReferencePrice_ ;
    /**
     * <pre>
     * 升舱参考价 用于给前端展示升舱产品优势价差；优势价差 = 升舱参考价-客人购买经济舱价格-升舱费用
     * </pre>
     *
     * <code>double UpgradeClassReferencePrice = 1;</code>
     */
    public double getUpgradeClassReferencePrice() {
      return upgradeClassReferencePrice_;
    }
    /**
     * <pre>
     * 升舱参考价 用于给前端展示升舱产品优势价差；优势价差 = 升舱参考价-客人购买经济舱价格-升舱费用
     * </pre>
     *
     * <code>double UpgradeClassReferencePrice = 1;</code>
     */
    public Builder setUpgradeClassReferencePrice(double value) {
      
      upgradeClassReferencePrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 升舱参考价 用于给前端展示升舱产品优势价差；优势价差 = 升舱参考价-客人购买经济舱价格-升舱费用
     * </pre>
     *
     * <code>double UpgradeClassReferencePrice = 1;</code>
     */
    public Builder clearUpgradeClassReferencePrice() {
      
      upgradeClassReferencePrice_ = 0D;
      onChanged();
      return this;
    }

    private double flightHotelLowestPrice_ ;
    /**
     * <pre>
     * 飞宿最低价,(机票价格+酒店价格)&gt;飞宿最低价
     * </pre>
     *
     * <code>double FlightHotelLowestPrice = 2;</code>
     */
    public double getFlightHotelLowestPrice() {
      return flightHotelLowestPrice_;
    }
    /**
     * <pre>
     * 飞宿最低价,(机票价格+酒店价格)&gt;飞宿最低价
     * </pre>
     *
     * <code>double FlightHotelLowestPrice = 2;</code>
     */
    public Builder setFlightHotelLowestPrice(double value) {
      
      flightHotelLowestPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 飞宿最低价,(机票价格+酒店价格)&gt;飞宿最低价
     * </pre>
     *
     * <code>double FlightHotelLowestPrice = 2;</code>
     */
    public Builder clearFlightHotelLowestPrice() {
      
      flightHotelLowestPrice_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReferencePriceDetailType>
      PARSER = new com.google.protobuf.AbstractParser<ReferencePriceDetailType>() {
    @java.lang.Override
    public ReferencePriceDetailType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReferencePriceDetailType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReferencePriceDetailType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReferencePriceDetailType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.ReferencePriceDetailType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

