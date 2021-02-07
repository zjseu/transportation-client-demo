// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * <pre>
 * 让利信息
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.DiscountType}
 */
public  final class DiscountType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.DiscountType)
    DiscountTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DiscountType.newBuilder() to construct.
  private DiscountType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiscountType() {
    mode_ = 0;
    showType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DiscountType(
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
            com.ctrip.flight.agg.shopping.contract.transportation.AmountType.Builder subBuilder = null;
            if (amount_ != null) {
              subBuilder = amount_.toBuilder();
            }
            amount_ = input.readMessage(com.ctrip.flight.agg.shopping.contract.transportation.AmountType.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(amount_);
              amount_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            mode_ = input.readInt32();
            break;
          }
          case 24: {

            showType_ = input.readInt32();
            break;
          }
          case 34: {
            com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType.Builder subBuilder = null;
            if (discountLabel_ != null) {
              subBuilder = discountLabel_.toBuilder();
            }
            discountLabel_ = input.readMessage(com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(discountLabel_);
              discountLabel_ = subBuilder.buildPartial();
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
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_DiscountType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_DiscountType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.class, com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.Builder.class);
  }

  public static final int AMOUNT_FIELD_NUMBER = 1;
  private com.ctrip.flight.agg.shopping.contract.transportation.AmountType amount_;
  /**
   * <pre>
   * 让利金额，销售币种
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 1;</code>
   */
  public boolean hasAmount() {
    return amount_ != null;
  }
  /**
   * <pre>
   * 让利金额，销售币种
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 1;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.AmountType getAmount() {
    return amount_ == null ? com.ctrip.flight.agg.shopping.contract.transportation.AmountType.getDefaultInstance() : amount_;
  }
  /**
   * <pre>
   * 让利金额，销售币种
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 1;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder getAmountOrBuilder() {
    return getAmount();
  }

  public static final int MODE_FIELD_NUMBER = 2;
  private int mode_;
  /**
   * <pre>
   * 让利模式, 0:无效让利模式, 1:虚拟让利, 2:三方让利
   * </pre>
   *
   * <code>int32 Mode = 2;</code>
   */
  public int getMode() {
    return mode_;
  }

  public static final int SHOWTYPE_FIELD_NUMBER = 3;
  private int showType_;
  /**
   * <pre>
   * 让利展示类型, 0:无效展示类型, 1:标签让利, 2:已减让利
   * </pre>
   *
   * <code>int32 ShowType = 3;</code>
   */
  public int getShowType() {
    return showType_;
  }

  public static final int DISCOUNTLABEL_FIELD_NUMBER = 4;
  private com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType discountLabel_;
  /**
   * <pre>
   * 让利个性化标签
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType DiscountLabel = 4;</code>
   */
  public boolean hasDiscountLabel() {
    return discountLabel_ != null;
  }
  /**
   * <pre>
   * 让利个性化标签
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType DiscountLabel = 4;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType getDiscountLabel() {
    return discountLabel_ == null ? com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType.getDefaultInstance() : discountLabel_;
  }
  /**
   * <pre>
   * 让利个性化标签
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType DiscountLabel = 4;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelTypeOrBuilder getDiscountLabelOrBuilder() {
    return getDiscountLabel();
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
    if (amount_ != null) {
      output.writeMessage(1, getAmount());
    }
    if (mode_ != 0) {
      output.writeInt32(2, mode_);
    }
    if (showType_ != 0) {
      output.writeInt32(3, showType_);
    }
    if (discountLabel_ != null) {
      output.writeMessage(4, getDiscountLabel());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (amount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAmount());
    }
    if (mode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, mode_);
    }
    if (showType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, showType_);
    }
    if (discountLabel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getDiscountLabel());
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.DiscountType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.DiscountType other = (com.ctrip.flight.agg.shopping.contract.transportation.DiscountType) obj;

    boolean result = true;
    result = result && (hasAmount() == other.hasAmount());
    if (hasAmount()) {
      result = result && getAmount()
          .equals(other.getAmount());
    }
    result = result && (getMode()
        == other.getMode());
    result = result && (getShowType()
        == other.getShowType());
    result = result && (hasDiscountLabel() == other.hasDiscountLabel());
    if (hasDiscountLabel()) {
      result = result && getDiscountLabel()
          .equals(other.getDiscountLabel());
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
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount().hashCode();
    }
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + getMode();
    hash = (37 * hash) + SHOWTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getShowType();
    if (hasDiscountLabel()) {
      hash = (37 * hash) + DISCOUNTLABEL_FIELD_NUMBER;
      hash = (53 * hash) + getDiscountLabel().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.DiscountType prototype) {
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
   * 让利信息
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.DiscountType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.DiscountType)
      com.ctrip.flight.agg.shopping.contract.transportation.DiscountTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_DiscountType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_DiscountType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.class, com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.newBuilder()
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
      if (amountBuilder_ == null) {
        amount_ = null;
      } else {
        amount_ = null;
        amountBuilder_ = null;
      }
      mode_ = 0;

      showType_ = 0;

      if (discountLabelBuilder_ == null) {
        discountLabel_ = null;
      } else {
        discountLabel_ = null;
        discountLabelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_DiscountType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.DiscountType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.DiscountType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.DiscountType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.DiscountType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.DiscountType result = new com.ctrip.flight.agg.shopping.contract.transportation.DiscountType(this);
      if (amountBuilder_ == null) {
        result.amount_ = amount_;
      } else {
        result.amount_ = amountBuilder_.build();
      }
      result.mode_ = mode_;
      result.showType_ = showType_;
      if (discountLabelBuilder_ == null) {
        result.discountLabel_ = discountLabel_;
      } else {
        result.discountLabel_ = discountLabelBuilder_.build();
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.DiscountType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.DiscountType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.DiscountType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.getDefaultInstance()) return this;
      if (other.hasAmount()) {
        mergeAmount(other.getAmount());
      }
      if (other.getMode() != 0) {
        setMode(other.getMode());
      }
      if (other.getShowType() != 0) {
        setShowType(other.getShowType());
      }
      if (other.hasDiscountLabel()) {
        mergeDiscountLabel(other.getDiscountLabel());
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
      com.ctrip.flight.agg.shopping.contract.transportation.DiscountType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.DiscountType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.ctrip.flight.agg.shopping.contract.transportation.AmountType amount_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.AmountType, com.ctrip.flight.agg.shopping.contract.transportation.AmountType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder> amountBuilder_;
    /**
     * <pre>
     * 让利金额，销售币种
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 1;</code>
     */
    public boolean hasAmount() {
      return amountBuilder_ != null || amount_ != null;
    }
    /**
     * <pre>
     * 让利金额，销售币种
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 1;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.AmountType getAmount() {
      if (amountBuilder_ == null) {
        return amount_ == null ? com.ctrip.flight.agg.shopping.contract.transportation.AmountType.getDefaultInstance() : amount_;
      } else {
        return amountBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 让利金额，销售币种
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 1;</code>
     */
    public Builder setAmount(com.ctrip.flight.agg.shopping.contract.transportation.AmountType value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        amount_ = value;
        onChanged();
      } else {
        amountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 让利金额，销售币种
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 1;</code>
     */
    public Builder setAmount(
        com.ctrip.flight.agg.shopping.contract.transportation.AmountType.Builder builderForValue) {
      if (amountBuilder_ == null) {
        amount_ = builderForValue.build();
        onChanged();
      } else {
        amountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 让利金额，销售币种
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 1;</code>
     */
    public Builder mergeAmount(com.ctrip.flight.agg.shopping.contract.transportation.AmountType value) {
      if (amountBuilder_ == null) {
        if (amount_ != null) {
          amount_ =
            com.ctrip.flight.agg.shopping.contract.transportation.AmountType.newBuilder(amount_).mergeFrom(value).buildPartial();
        } else {
          amount_ = value;
        }
        onChanged();
      } else {
        amountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 让利金额，销售币种
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 1;</code>
     */
    public Builder clearAmount() {
      if (amountBuilder_ == null) {
        amount_ = null;
        onChanged();
      } else {
        amount_ = null;
        amountBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 让利金额，销售币种
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 1;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.AmountType.Builder getAmountBuilder() {
      
      onChanged();
      return getAmountFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 让利金额，销售币种
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 1;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder getAmountOrBuilder() {
      if (amountBuilder_ != null) {
        return amountBuilder_.getMessageOrBuilder();
      } else {
        return amount_ == null ?
            com.ctrip.flight.agg.shopping.contract.transportation.AmountType.getDefaultInstance() : amount_;
      }
    }
    /**
     * <pre>
     * 让利金额，销售币种
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Amount = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.AmountType, com.ctrip.flight.agg.shopping.contract.transportation.AmountType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder> 
        getAmountFieldBuilder() {
      if (amountBuilder_ == null) {
        amountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ctrip.flight.agg.shopping.contract.transportation.AmountType, com.ctrip.flight.agg.shopping.contract.transportation.AmountType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder>(
                getAmount(),
                getParentForChildren(),
                isClean());
        amount_ = null;
      }
      return amountBuilder_;
    }

    private int mode_ ;
    /**
     * <pre>
     * 让利模式, 0:无效让利模式, 1:虚拟让利, 2:三方让利
     * </pre>
     *
     * <code>int32 Mode = 2;</code>
     */
    public int getMode() {
      return mode_;
    }
    /**
     * <pre>
     * 让利模式, 0:无效让利模式, 1:虚拟让利, 2:三方让利
     * </pre>
     *
     * <code>int32 Mode = 2;</code>
     */
    public Builder setMode(int value) {
      
      mode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 让利模式, 0:无效让利模式, 1:虚拟让利, 2:三方让利
     * </pre>
     *
     * <code>int32 Mode = 2;</code>
     */
    public Builder clearMode() {
      
      mode_ = 0;
      onChanged();
      return this;
    }

    private int showType_ ;
    /**
     * <pre>
     * 让利展示类型, 0:无效展示类型, 1:标签让利, 2:已减让利
     * </pre>
     *
     * <code>int32 ShowType = 3;</code>
     */
    public int getShowType() {
      return showType_;
    }
    /**
     * <pre>
     * 让利展示类型, 0:无效展示类型, 1:标签让利, 2:已减让利
     * </pre>
     *
     * <code>int32 ShowType = 3;</code>
     */
    public Builder setShowType(int value) {
      
      showType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 让利展示类型, 0:无效展示类型, 1:标签让利, 2:已减让利
     * </pre>
     *
     * <code>int32 ShowType = 3;</code>
     */
    public Builder clearShowType() {
      
      showType_ = 0;
      onChanged();
      return this;
    }

    private com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType discountLabel_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType, com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelTypeOrBuilder> discountLabelBuilder_;
    /**
     * <pre>
     * 让利个性化标签
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType DiscountLabel = 4;</code>
     */
    public boolean hasDiscountLabel() {
      return discountLabelBuilder_ != null || discountLabel_ != null;
    }
    /**
     * <pre>
     * 让利个性化标签
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType DiscountLabel = 4;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType getDiscountLabel() {
      if (discountLabelBuilder_ == null) {
        return discountLabel_ == null ? com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType.getDefaultInstance() : discountLabel_;
      } else {
        return discountLabelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 让利个性化标签
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType DiscountLabel = 4;</code>
     */
    public Builder setDiscountLabel(com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType value) {
      if (discountLabelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        discountLabel_ = value;
        onChanged();
      } else {
        discountLabelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 让利个性化标签
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType DiscountLabel = 4;</code>
     */
    public Builder setDiscountLabel(
        com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType.Builder builderForValue) {
      if (discountLabelBuilder_ == null) {
        discountLabel_ = builderForValue.build();
        onChanged();
      } else {
        discountLabelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 让利个性化标签
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType DiscountLabel = 4;</code>
     */
    public Builder mergeDiscountLabel(com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType value) {
      if (discountLabelBuilder_ == null) {
        if (discountLabel_ != null) {
          discountLabel_ =
            com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType.newBuilder(discountLabel_).mergeFrom(value).buildPartial();
        } else {
          discountLabel_ = value;
        }
        onChanged();
      } else {
        discountLabelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 让利个性化标签
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType DiscountLabel = 4;</code>
     */
    public Builder clearDiscountLabel() {
      if (discountLabelBuilder_ == null) {
        discountLabel_ = null;
        onChanged();
      } else {
        discountLabel_ = null;
        discountLabelBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 让利个性化标签
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType DiscountLabel = 4;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType.Builder getDiscountLabelBuilder() {
      
      onChanged();
      return getDiscountLabelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 让利个性化标签
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType DiscountLabel = 4;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelTypeOrBuilder getDiscountLabelOrBuilder() {
      if (discountLabelBuilder_ != null) {
        return discountLabelBuilder_.getMessageOrBuilder();
      } else {
        return discountLabel_ == null ?
            com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType.getDefaultInstance() : discountLabel_;
      }
    }
    /**
     * <pre>
     * 让利个性化标签
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType DiscountLabel = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType, com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelTypeOrBuilder> 
        getDiscountLabelFieldBuilder() {
      if (discountLabelBuilder_ == null) {
        discountLabelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType, com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.DiscountLabelTypeOrBuilder>(
                getDiscountLabel(),
                getParentForChildren(),
                isClean());
        discountLabel_ = null;
      }
      return discountLabelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.DiscountType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.DiscountType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.DiscountType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.DiscountType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.DiscountType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiscountType>
      PARSER = new com.google.protobuf.AbstractParser<DiscountType>() {
    @java.lang.Override
    public DiscountType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DiscountType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DiscountType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiscountType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.DiscountType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
