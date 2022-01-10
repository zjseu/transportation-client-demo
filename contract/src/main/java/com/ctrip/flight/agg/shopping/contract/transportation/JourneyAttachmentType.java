// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * <pre>
 * 与行程有关的相关信息
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType}
 */
public  final class JourneyAttachmentType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType)
    JourneyAttachmentTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JourneyAttachmentType.newBuilder() to construct.
  private JourneyAttachmentType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JourneyAttachmentType() {
    journeyNo_ = 0;
    productCombinationType_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JourneyAttachmentType(
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

            journeyNo_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              productCombinationType_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            productCombinationType_.add(s);
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        productCombinationType_ = productCombinationType_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_JourneyAttachmentType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_JourneyAttachmentType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType.class, com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType.Builder.class);
  }

  private int bitField0_;
  public static final int JOURNEYNO_FIELD_NUMBER = 1;
  private int journeyNo_;
  /**
   * <pre>
   * 行程号，从1开始
   * </pre>
   *
   * <code>int32 JourneyNo = 1;</code>
   */
  public int getJourneyNo() {
    return journeyNo_;
  }

  public static final int PRODUCTCOMBINATIONTYPE_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList productCombinationType_;
  /**
   * <pre>
   * 国内的产品组合类型，RT/MT时有值
   * </pre>
   *
   * <code>repeated string ProductCombinationType = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getProductCombinationTypeList() {
    return productCombinationType_;
  }
  /**
   * <pre>
   * 国内的产品组合类型，RT/MT时有值
   * </pre>
   *
   * <code>repeated string ProductCombinationType = 2;</code>
   */
  public int getProductCombinationTypeCount() {
    return productCombinationType_.size();
  }
  /**
   * <pre>
   * 国内的产品组合类型，RT/MT时有值
   * </pre>
   *
   * <code>repeated string ProductCombinationType = 2;</code>
   */
  public java.lang.String getProductCombinationType(int index) {
    return productCombinationType_.get(index);
  }
  /**
   * <pre>
   * 国内的产品组合类型，RT/MT时有值
   * </pre>
   *
   * <code>repeated string ProductCombinationType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProductCombinationTypeBytes(int index) {
    return productCombinationType_.getByteString(index);
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
    if (journeyNo_ != 0) {
      output.writeInt32(1, journeyNo_);
    }
    for (int i = 0; i < productCombinationType_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, productCombinationType_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (journeyNo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, journeyNo_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < productCombinationType_.size(); i++) {
        dataSize += computeStringSizeNoTag(productCombinationType_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getProductCombinationTypeList().size();
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType other = (com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType) obj;

    boolean result = true;
    result = result && (getJourneyNo()
        == other.getJourneyNo());
    result = result && getProductCombinationTypeList()
        .equals(other.getProductCombinationTypeList());
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
    hash = (37 * hash) + JOURNEYNO_FIELD_NUMBER;
    hash = (53 * hash) + getJourneyNo();
    if (getProductCombinationTypeCount() > 0) {
      hash = (37 * hash) + PRODUCTCOMBINATIONTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getProductCombinationTypeList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType prototype) {
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
   * 与行程有关的相关信息
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType)
      com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_JourneyAttachmentType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_JourneyAttachmentType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType.class, com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType.newBuilder()
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
      journeyNo_ = 0;

      productCombinationType_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_JourneyAttachmentType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType result = new com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.journeyNo_ = journeyNo_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        productCombinationType_ = productCombinationType_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.productCombinationType_ = productCombinationType_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType.getDefaultInstance()) return this;
      if (other.getJourneyNo() != 0) {
        setJourneyNo(other.getJourneyNo());
      }
      if (!other.productCombinationType_.isEmpty()) {
        if (productCombinationType_.isEmpty()) {
          productCombinationType_ = other.productCombinationType_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureProductCombinationTypeIsMutable();
          productCombinationType_.addAll(other.productCombinationType_);
        }
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
      com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int journeyNo_ ;
    /**
     * <pre>
     * 行程号，从1开始
     * </pre>
     *
     * <code>int32 JourneyNo = 1;</code>
     */
    public int getJourneyNo() {
      return journeyNo_;
    }
    /**
     * <pre>
     * 行程号，从1开始
     * </pre>
     *
     * <code>int32 JourneyNo = 1;</code>
     */
    public Builder setJourneyNo(int value) {
      
      journeyNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 行程号，从1开始
     * </pre>
     *
     * <code>int32 JourneyNo = 1;</code>
     */
    public Builder clearJourneyNo() {
      
      journeyNo_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList productCombinationType_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureProductCombinationTypeIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        productCombinationType_ = new com.google.protobuf.LazyStringArrayList(productCombinationType_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * 国内的产品组合类型，RT/MT时有值
     * </pre>
     *
     * <code>repeated string ProductCombinationType = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getProductCombinationTypeList() {
      return productCombinationType_.getUnmodifiableView();
    }
    /**
     * <pre>
     * 国内的产品组合类型，RT/MT时有值
     * </pre>
     *
     * <code>repeated string ProductCombinationType = 2;</code>
     */
    public int getProductCombinationTypeCount() {
      return productCombinationType_.size();
    }
    /**
     * <pre>
     * 国内的产品组合类型，RT/MT时有值
     * </pre>
     *
     * <code>repeated string ProductCombinationType = 2;</code>
     */
    public java.lang.String getProductCombinationType(int index) {
      return productCombinationType_.get(index);
    }
    /**
     * <pre>
     * 国内的产品组合类型，RT/MT时有值
     * </pre>
     *
     * <code>repeated string ProductCombinationType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProductCombinationTypeBytes(int index) {
      return productCombinationType_.getByteString(index);
    }
    /**
     * <pre>
     * 国内的产品组合类型，RT/MT时有值
     * </pre>
     *
     * <code>repeated string ProductCombinationType = 2;</code>
     */
    public Builder setProductCombinationType(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProductCombinationTypeIsMutable();
      productCombinationType_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 国内的产品组合类型，RT/MT时有值
     * </pre>
     *
     * <code>repeated string ProductCombinationType = 2;</code>
     */
    public Builder addProductCombinationType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProductCombinationTypeIsMutable();
      productCombinationType_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 国内的产品组合类型，RT/MT时有值
     * </pre>
     *
     * <code>repeated string ProductCombinationType = 2;</code>
     */
    public Builder addAllProductCombinationType(
        java.lang.Iterable<java.lang.String> values) {
      ensureProductCombinationTypeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, productCombinationType_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 国内的产品组合类型，RT/MT时有值
     * </pre>
     *
     * <code>repeated string ProductCombinationType = 2;</code>
     */
    public Builder clearProductCombinationType() {
      productCombinationType_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 国内的产品组合类型，RT/MT时有值
     * </pre>
     *
     * <code>repeated string ProductCombinationType = 2;</code>
     */
    public Builder addProductCombinationTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureProductCombinationTypeIsMutable();
      productCombinationType_.add(value);
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JourneyAttachmentType>
      PARSER = new com.google.protobuf.AbstractParser<JourneyAttachmentType>() {
    @java.lang.Override
    public JourneyAttachmentType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JourneyAttachmentType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JourneyAttachmentType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JourneyAttachmentType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.JourneyAttachmentType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
