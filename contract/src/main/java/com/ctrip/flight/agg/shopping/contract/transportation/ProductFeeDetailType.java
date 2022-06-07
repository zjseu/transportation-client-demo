// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType}
 */
public  final class ProductFeeDetailType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType)
    ProductFeeDetailTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductFeeDetailType.newBuilder() to construct.
  private ProductFeeDetailType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductFeeDetailType() {
    ageTypeGroup_ = 0;
    marketingAmount_ = 0D;
    serviceToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductFeeDetailType(
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

            ageTypeGroup_ = input.readInt32();
            break;
          }
          case 17: {

            marketingAmount_ = input.readDouble();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            serviceToken_ = s;
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
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductFeeDetailType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductFeeDetailType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType.class, com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType.Builder.class);
  }

  public static final int AGETYPEGROUP_FIELD_NUMBER = 1;
  private int ageTypeGroup_;
  /**
   * <pre>
   * 对应的乘客类型组，可表示多个乘客类型。1: Adult; 2: Child; 4: Infant;
   * </pre>
   *
   * <code>int32 AgeTypeGroup = 1;</code>
   */
  public int getAgeTypeGroup() {
    return ageTypeGroup_;
  }

  public static final int MARKETINGAMOUNT_FIELD_NUMBER = 2;
  private double marketingAmount_;
  /**
   * <pre>
   *营销金额
   * </pre>
   *
   * <code>double MarketingAmount = 2;</code>
   */
  public double getMarketingAmount() {
    return marketingAmount_;
  }

  public static final int SERVICETOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object serviceToken_;
  /**
   * <pre>
   *透传X前置接口的policyToken/对应国内X产品倒查key
   * </pre>
   *
   * <code>string ServiceToken = 3;</code>
   */
  public java.lang.String getServiceToken() {
    java.lang.Object ref = serviceToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *透传X前置接口的policyToken/对应国内X产品倒查key
   * </pre>
   *
   * <code>string ServiceToken = 3;</code>
   */
  public com.google.protobuf.ByteString
      getServiceTokenBytes() {
    java.lang.Object ref = serviceToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceToken_ = b;
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
    if (ageTypeGroup_ != 0) {
      output.writeInt32(1, ageTypeGroup_);
    }
    if (marketingAmount_ != 0D) {
      output.writeDouble(2, marketingAmount_);
    }
    if (!getServiceTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, serviceToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ageTypeGroup_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, ageTypeGroup_);
    }
    if (marketingAmount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, marketingAmount_);
    }
    if (!getServiceTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, serviceToken_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType other = (com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType) obj;

    boolean result = true;
    result = result && (getAgeTypeGroup()
        == other.getAgeTypeGroup());
    result = result && (
        java.lang.Double.doubleToLongBits(getMarketingAmount())
        == java.lang.Double.doubleToLongBits(
            other.getMarketingAmount()));
    result = result && getServiceToken()
        .equals(other.getServiceToken());
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
    hash = (37 * hash) + AGETYPEGROUP_FIELD_NUMBER;
    hash = (53 * hash) + getAgeTypeGroup();
    hash = (37 * hash) + MARKETINGAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMarketingAmount()));
    hash = (37 * hash) + SERVICETOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getServiceToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType)
      com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductFeeDetailType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductFeeDetailType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType.class, com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType.newBuilder()
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
      ageTypeGroup_ = 0;

      marketingAmount_ = 0D;

      serviceToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_ProductFeeDetailType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType result = new com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType(this);
      result.ageTypeGroup_ = ageTypeGroup_;
      result.marketingAmount_ = marketingAmount_;
      result.serviceToken_ = serviceToken_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType.getDefaultInstance()) return this;
      if (other.getAgeTypeGroup() != 0) {
        setAgeTypeGroup(other.getAgeTypeGroup());
      }
      if (other.getMarketingAmount() != 0D) {
        setMarketingAmount(other.getMarketingAmount());
      }
      if (!other.getServiceToken().isEmpty()) {
        serviceToken_ = other.serviceToken_;
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
      com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ageTypeGroup_ ;
    /**
     * <pre>
     * 对应的乘客类型组，可表示多个乘客类型。1: Adult; 2: Child; 4: Infant;
     * </pre>
     *
     * <code>int32 AgeTypeGroup = 1;</code>
     */
    public int getAgeTypeGroup() {
      return ageTypeGroup_;
    }
    /**
     * <pre>
     * 对应的乘客类型组，可表示多个乘客类型。1: Adult; 2: Child; 4: Infant;
     * </pre>
     *
     * <code>int32 AgeTypeGroup = 1;</code>
     */
    public Builder setAgeTypeGroup(int value) {
      
      ageTypeGroup_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 对应的乘客类型组，可表示多个乘客类型。1: Adult; 2: Child; 4: Infant;
     * </pre>
     *
     * <code>int32 AgeTypeGroup = 1;</code>
     */
    public Builder clearAgeTypeGroup() {
      
      ageTypeGroup_ = 0;
      onChanged();
      return this;
    }

    private double marketingAmount_ ;
    /**
     * <pre>
     *营销金额
     * </pre>
     *
     * <code>double MarketingAmount = 2;</code>
     */
    public double getMarketingAmount() {
      return marketingAmount_;
    }
    /**
     * <pre>
     *营销金额
     * </pre>
     *
     * <code>double MarketingAmount = 2;</code>
     */
    public Builder setMarketingAmount(double value) {
      
      marketingAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *营销金额
     * </pre>
     *
     * <code>double MarketingAmount = 2;</code>
     */
    public Builder clearMarketingAmount() {
      
      marketingAmount_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object serviceToken_ = "";
    /**
     * <pre>
     *透传X前置接口的policyToken/对应国内X产品倒查key
     * </pre>
     *
     * <code>string ServiceToken = 3;</code>
     */
    public java.lang.String getServiceToken() {
      java.lang.Object ref = serviceToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *透传X前置接口的policyToken/对应国内X产品倒查key
     * </pre>
     *
     * <code>string ServiceToken = 3;</code>
     */
    public com.google.protobuf.ByteString
        getServiceTokenBytes() {
      java.lang.Object ref = serviceToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *透传X前置接口的policyToken/对应国内X产品倒查key
     * </pre>
     *
     * <code>string ServiceToken = 3;</code>
     */
    public Builder setServiceToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *透传X前置接口的policyToken/对应国内X产品倒查key
     * </pre>
     *
     * <code>string ServiceToken = 3;</code>
     */
    public Builder clearServiceToken() {
      
      serviceToken_ = getDefaultInstance().getServiceToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *透传X前置接口的policyToken/对应国内X产品倒查key
     * </pre>
     *
     * <code>string ServiceToken = 3;</code>
     */
    public Builder setServiceTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductFeeDetailType>
      PARSER = new com.google.protobuf.AbstractParser<ProductFeeDetailType>() {
    @java.lang.Override
    public ProductFeeDetailType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductFeeDetailType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductFeeDetailType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductFeeDetailType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.ProductFeeDetailType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
