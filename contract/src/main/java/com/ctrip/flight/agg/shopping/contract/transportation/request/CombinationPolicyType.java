// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.request.proto

package com.ctrip.flight.agg.shopping.contract.transportation.request;

/**
 * <pre>
 * 严格反查国内混政策产品时需要传入
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType}
 */
public  final class CombinationPolicyType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType)
    CombinationPolicyTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombinationPolicyType.newBuilder() to construct.
  private CombinationPolicyType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombinationPolicyType() {
    journeyNo_ = 0;
    policyToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombinationPolicyType(
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

            policyToken_ = s;
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
    return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_CombinationPolicyType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_CombinationPolicyType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType.class, com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType.Builder.class);
  }

  public static final int JOURNEYNO_FIELD_NUMBER = 1;
  private int journeyNo_;
  /**
   * <pre>
   * 行程号
   * </pre>
   *
   * <code>int32 JourneyNo = 1;</code>
   */
  public int getJourneyNo() {
    return journeyNo_;
  }

  public static final int POLICYTOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object policyToken_;
  /**
   * <pre>
   * 混政策token
   * </pre>
   *
   * <code>string PolicyToken = 2;</code>
   */
  public java.lang.String getPolicyToken() {
    java.lang.Object ref = policyToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      policyToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 混政策token
   * </pre>
   *
   * <code>string PolicyToken = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPolicyTokenBytes() {
    java.lang.Object ref = policyToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      policyToken_ = b;
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
    if (journeyNo_ != 0) {
      output.writeInt32(1, journeyNo_);
    }
    if (!getPolicyTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, policyToken_);
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
    if (!getPolicyTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, policyToken_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType other = (com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType) obj;

    boolean result = true;
    result = result && (getJourneyNo()
        == other.getJourneyNo());
    result = result && getPolicyToken()
        .equals(other.getPolicyToken());
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
    hash = (37 * hash) + POLICYTOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPolicyToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType prototype) {
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
   * 严格反查国内混政策产品时需要传入
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType)
      com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_CombinationPolicyType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_CombinationPolicyType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType.class, com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType.newBuilder()
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

      policyToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.request.ComCtripFlightAggShoppingContractTransportationRequest.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_CombinationPolicyType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType result = new com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType(this);
      result.journeyNo_ = journeyNo_;
      result.policyToken_ = policyToken_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType.getDefaultInstance()) return this;
      if (other.getJourneyNo() != 0) {
        setJourneyNo(other.getJourneyNo());
      }
      if (!other.getPolicyToken().isEmpty()) {
        policyToken_ = other.policyToken_;
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
      com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int journeyNo_ ;
    /**
     * <pre>
     * 行程号
     * </pre>
     *
     * <code>int32 JourneyNo = 1;</code>
     */
    public int getJourneyNo() {
      return journeyNo_;
    }
    /**
     * <pre>
     * 行程号
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
     * 行程号
     * </pre>
     *
     * <code>int32 JourneyNo = 1;</code>
     */
    public Builder clearJourneyNo() {
      
      journeyNo_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object policyToken_ = "";
    /**
     * <pre>
     * 混政策token
     * </pre>
     *
     * <code>string PolicyToken = 2;</code>
     */
    public java.lang.String getPolicyToken() {
      java.lang.Object ref = policyToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        policyToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 混政策token
     * </pre>
     *
     * <code>string PolicyToken = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPolicyTokenBytes() {
      java.lang.Object ref = policyToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        policyToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 混政策token
     * </pre>
     *
     * <code>string PolicyToken = 2;</code>
     */
    public Builder setPolicyToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      policyToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 混政策token
     * </pre>
     *
     * <code>string PolicyToken = 2;</code>
     */
    public Builder clearPolicyToken() {
      
      policyToken_ = getDefaultInstance().getPolicyToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 混政策token
     * </pre>
     *
     * <code>string PolicyToken = 2;</code>
     */
    public Builder setPolicyTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      policyToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombinationPolicyType>
      PARSER = new com.google.protobuf.AbstractParser<CombinationPolicyType>() {
    @java.lang.Override
    public CombinationPolicyType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombinationPolicyType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombinationPolicyType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombinationPolicyType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.request.CombinationPolicyType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
