// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

/**
 * <pre>
 * 与TransportRefType一一对应
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType}
 */
public  final class TransportFareMappingType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType)
    TransportFareMappingTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransportFareMappingType.newBuilder() to construct.
  private TransportFareMappingType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransportFareMappingType() {
    transportRef_ = 0;
    paxSeat_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransportFareMappingType(
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

            transportRef_ = input.readInt32();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              paxSeat_ = new java.util.ArrayList<com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType>();
              mutable_bitField0_ |= 0x00000002;
            }
            paxSeat_.add(
                input.readMessage(com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.parser(), extensionRegistry));
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
        paxSeat_ = java.util.Collections.unmodifiableList(paxSeat_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_TransportFareMappingType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_TransportFareMappingType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType.class, com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType.Builder.class);
  }

  private int bitField0_;
  public static final int TRANSPORTREF_FIELD_NUMBER = 1;
  private int transportRef_;
  /**
   * <pre>
   * (航班/火车/巴士等) 详情索引号
   * </pre>
   *
   * <code>int32 TransportRef = 1;</code>
   */
  public int getTransportRef() {
    return transportRef_;
  }

  public static final int PAXSEAT_FIELD_NUMBER = 2;
  private java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType> paxSeat_;
  /**
   * <pre>
   * 乘客类型对应的舱等舱位信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
   */
  public java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType> getPaxSeatList() {
    return paxSeat_;
  }
  /**
   * <pre>
   * 乘客类型对应的舱等舱位信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
   */
  public java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatTypeOrBuilder> 
      getPaxSeatOrBuilderList() {
    return paxSeat_;
  }
  /**
   * <pre>
   * 乘客类型对应的舱等舱位信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
   */
  public int getPaxSeatCount() {
    return paxSeat_.size();
  }
  /**
   * <pre>
   * 乘客类型对应的舱等舱位信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType getPaxSeat(int index) {
    return paxSeat_.get(index);
  }
  /**
   * <pre>
   * 乘客类型对应的舱等舱位信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatTypeOrBuilder getPaxSeatOrBuilder(
      int index) {
    return paxSeat_.get(index);
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
    if (transportRef_ != 0) {
      output.writeInt32(1, transportRef_);
    }
    for (int i = 0; i < paxSeat_.size(); i++) {
      output.writeMessage(2, paxSeat_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transportRef_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, transportRef_);
    }
    for (int i = 0; i < paxSeat_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, paxSeat_.get(i));
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType other = (com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType) obj;

    boolean result = true;
    result = result && (getTransportRef()
        == other.getTransportRef());
    result = result && getPaxSeatList()
        .equals(other.getPaxSeatList());
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
    hash = (37 * hash) + TRANSPORTREF_FIELD_NUMBER;
    hash = (53 * hash) + getTransportRef();
    if (getPaxSeatCount() > 0) {
      hash = (37 * hash) + PAXSEAT_FIELD_NUMBER;
      hash = (53 * hash) + getPaxSeatList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType prototype) {
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
   * 与TransportRefType一一对应
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType)
      com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_TransportFareMappingType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_TransportFareMappingType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType.class, com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType.newBuilder()
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
        getPaxSeatFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      transportRef_ = 0;

      if (paxSeatBuilder_ == null) {
        paxSeat_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        paxSeatBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.ComCtripFlightAggShoppingContractTransportationResponse.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_response_TransportFareMappingType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType result = new com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.transportRef_ = transportRef_;
      if (paxSeatBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          paxSeat_ = java.util.Collections.unmodifiableList(paxSeat_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.paxSeat_ = paxSeat_;
      } else {
        result.paxSeat_ = paxSeatBuilder_.build();
      }
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType.getDefaultInstance()) return this;
      if (other.getTransportRef() != 0) {
        setTransportRef(other.getTransportRef());
      }
      if (paxSeatBuilder_ == null) {
        if (!other.paxSeat_.isEmpty()) {
          if (paxSeat_.isEmpty()) {
            paxSeat_ = other.paxSeat_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePaxSeatIsMutable();
            paxSeat_.addAll(other.paxSeat_);
          }
          onChanged();
        }
      } else {
        if (!other.paxSeat_.isEmpty()) {
          if (paxSeatBuilder_.isEmpty()) {
            paxSeatBuilder_.dispose();
            paxSeatBuilder_ = null;
            paxSeat_ = other.paxSeat_;
            bitField0_ = (bitField0_ & ~0x00000002);
            paxSeatBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPaxSeatFieldBuilder() : null;
          } else {
            paxSeatBuilder_.addAllMessages(other.paxSeat_);
          }
        }
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
      com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int transportRef_ ;
    /**
     * <pre>
     * (航班/火车/巴士等) 详情索引号
     * </pre>
     *
     * <code>int32 TransportRef = 1;</code>
     */
    public int getTransportRef() {
      return transportRef_;
    }
    /**
     * <pre>
     * (航班/火车/巴士等) 详情索引号
     * </pre>
     *
     * <code>int32 TransportRef = 1;</code>
     */
    public Builder setTransportRef(int value) {
      
      transportRef_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (航班/火车/巴士等) 详情索引号
     * </pre>
     *
     * <code>int32 TransportRef = 1;</code>
     */
    public Builder clearTransportRef() {
      
      transportRef_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType> paxSeat_ =
      java.util.Collections.emptyList();
    private void ensurePaxSeatIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        paxSeat_ = new java.util.ArrayList<com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType>(paxSeat_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType, com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatTypeOrBuilder> paxSeatBuilder_;

    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType> getPaxSeatList() {
      if (paxSeatBuilder_ == null) {
        return java.util.Collections.unmodifiableList(paxSeat_);
      } else {
        return paxSeatBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public int getPaxSeatCount() {
      if (paxSeatBuilder_ == null) {
        return paxSeat_.size();
      } else {
        return paxSeatBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType getPaxSeat(int index) {
      if (paxSeatBuilder_ == null) {
        return paxSeat_.get(index);
      } else {
        return paxSeatBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public Builder setPaxSeat(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType value) {
      if (paxSeatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaxSeatIsMutable();
        paxSeat_.set(index, value);
        onChanged();
      } else {
        paxSeatBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public Builder setPaxSeat(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.Builder builderForValue) {
      if (paxSeatBuilder_ == null) {
        ensurePaxSeatIsMutable();
        paxSeat_.set(index, builderForValue.build());
        onChanged();
      } else {
        paxSeatBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public Builder addPaxSeat(com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType value) {
      if (paxSeatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaxSeatIsMutable();
        paxSeat_.add(value);
        onChanged();
      } else {
        paxSeatBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public Builder addPaxSeat(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType value) {
      if (paxSeatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaxSeatIsMutable();
        paxSeat_.add(index, value);
        onChanged();
      } else {
        paxSeatBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public Builder addPaxSeat(
        com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.Builder builderForValue) {
      if (paxSeatBuilder_ == null) {
        ensurePaxSeatIsMutable();
        paxSeat_.add(builderForValue.build());
        onChanged();
      } else {
        paxSeatBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public Builder addPaxSeat(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.Builder builderForValue) {
      if (paxSeatBuilder_ == null) {
        ensurePaxSeatIsMutable();
        paxSeat_.add(index, builderForValue.build());
        onChanged();
      } else {
        paxSeatBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public Builder addAllPaxSeat(
        java.lang.Iterable<? extends com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType> values) {
      if (paxSeatBuilder_ == null) {
        ensurePaxSeatIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paxSeat_);
        onChanged();
      } else {
        paxSeatBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public Builder clearPaxSeat() {
      if (paxSeatBuilder_ == null) {
        paxSeat_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        paxSeatBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public Builder removePaxSeat(int index) {
      if (paxSeatBuilder_ == null) {
        ensurePaxSeatIsMutable();
        paxSeat_.remove(index);
        onChanged();
      } else {
        paxSeatBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.Builder getPaxSeatBuilder(
        int index) {
      return getPaxSeatFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatTypeOrBuilder getPaxSeatOrBuilder(
        int index) {
      if (paxSeatBuilder_ == null) {
        return paxSeat_.get(index);  } else {
        return paxSeatBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatTypeOrBuilder> 
         getPaxSeatOrBuilderList() {
      if (paxSeatBuilder_ != null) {
        return paxSeatBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(paxSeat_);
      }
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.Builder addPaxSeatBuilder() {
      return getPaxSeatFieldBuilder().addBuilder(
          com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.getDefaultInstance());
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.Builder addPaxSeatBuilder(
        int index) {
      return getPaxSeatFieldBuilder().addBuilder(
          index, com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.getDefaultInstance());
    }
    /**
     * <pre>
     * 乘客类型对应的舱等舱位信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType PaxSeat = 2;</code>
     */
    public java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.Builder> 
         getPaxSeatBuilderList() {
      return getPaxSeatFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType, com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatTypeOrBuilder> 
        getPaxSeatFieldBuilder() {
      if (paxSeatBuilder_ == null) {
        paxSeatBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType, com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.PaxSeatTypeOrBuilder>(
                paxSeat_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        paxSeat_ = null;
      }
      return paxSeatBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransportFareMappingType>
      PARSER = new com.google.protobuf.AbstractParser<TransportFareMappingType>() {
    @java.lang.Override
    public TransportFareMappingType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransportFareMappingType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransportFareMappingType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransportFareMappingType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.response.TransportFareMappingType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
