// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaijiCommonTypes.proto

package com.ctrip.soa;

/**
 * Protobuf type {@code com.ctrip.soa.ErrorFieldType}
 */
public  final class ErrorFieldType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.soa.ErrorFieldType)
    ErrorFieldTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ErrorFieldType.newBuilder() to construct.
  private ErrorFieldType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorFieldType() {
    fieldName_ = "";
    errorCode_ = "";
    message_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ErrorFieldType(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();

            fieldName_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            errorCode_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            message_ = s;
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
    return com.ctrip.soa.BaijiCommonTypes.internal_static_com_ctrip_soa_ErrorFieldType_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.soa.BaijiCommonTypes.internal_static_com_ctrip_soa_ErrorFieldType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.soa.ErrorFieldType.class, com.ctrip.soa.ErrorFieldType.Builder.class);
  }

  public static final int FIELDNAME_FIELD_NUMBER = 1;
  private volatile Object fieldName_;
  /**
   * <code>string FieldName = 1;</code>
   */
  public String getFieldName() {
    Object ref = fieldName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      fieldName_ = s;
      return s;
    }
  }
  /**
   * <code>string FieldName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFieldNameBytes() {
    Object ref = fieldName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      fieldName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERRORCODE_FIELD_NUMBER = 2;
  private volatile Object errorCode_;
  /**
   * <code>string ErrorCode = 2;</code>
   */
  public String getErrorCode() {
    Object ref = errorCode_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      errorCode_ = s;
      return s;
    }
  }
  /**
   * <code>string ErrorCode = 2;</code>
   */
  public com.google.protobuf.ByteString
      getErrorCodeBytes() {
    Object ref = errorCode_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      errorCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  private volatile Object message_;
  /**
   * <code>string Message = 3;</code>
   */
  public String getMessage() {
    Object ref = message_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string Message = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    Object ref = message_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFieldNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fieldName_);
    }
    if (!getErrorCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorCode_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFieldNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fieldName_);
    }
    if (!getErrorCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorCode_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ctrip.soa.ErrorFieldType)) {
      return super.equals(obj);
    }
    com.ctrip.soa.ErrorFieldType other = (com.ctrip.soa.ErrorFieldType) obj;

    boolean result = true;
    result = result && getFieldName()
        .equals(other.getFieldName());
    result = result && getErrorCode()
        .equals(other.getErrorCode());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIELDNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFieldName().hashCode();
    hash = (37 * hash) + ERRORCODE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorCode().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.soa.ErrorFieldType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.soa.ErrorFieldType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.soa.ErrorFieldType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.soa.ErrorFieldType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.soa.ErrorFieldType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.soa.ErrorFieldType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.soa.ErrorFieldType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.soa.ErrorFieldType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.soa.ErrorFieldType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.soa.ErrorFieldType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.soa.ErrorFieldType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.soa.ErrorFieldType parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ctrip.soa.ErrorFieldType prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.ctrip.soa.ErrorFieldType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.soa.ErrorFieldType)
      com.ctrip.soa.ErrorFieldTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.soa.BaijiCommonTypes.internal_static_com_ctrip_soa_ErrorFieldType_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.soa.BaijiCommonTypes.internal_static_com_ctrip_soa_ErrorFieldType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.soa.ErrorFieldType.class, com.ctrip.soa.ErrorFieldType.Builder.class);
    }

    // Construct using com.ctrip.soa.ErrorFieldType.newBuilder()
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
    @Override
    public Builder clear() {
      super.clear();
      fieldName_ = "";

      errorCode_ = "";

      message_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.soa.BaijiCommonTypes.internal_static_com_ctrip_soa_ErrorFieldType_descriptor;
    }

    @Override
    public com.ctrip.soa.ErrorFieldType getDefaultInstanceForType() {
      return getDefaultInstance();
    }

    @Override
    public com.ctrip.soa.ErrorFieldType build() {
      com.ctrip.soa.ErrorFieldType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public com.ctrip.soa.ErrorFieldType buildPartial() {
      com.ctrip.soa.ErrorFieldType result = new com.ctrip.soa.ErrorFieldType(this);
      result.fieldName_ = fieldName_;
      result.errorCode_ = errorCode_;
      result.message_ = message_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ctrip.soa.ErrorFieldType) {
        return mergeFrom((com.ctrip.soa.ErrorFieldType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.soa.ErrorFieldType other) {
      if (other == getDefaultInstance()) return this;
      if (!other.getFieldName().isEmpty()) {
        fieldName_ = other.fieldName_;
        onChanged();
      }
      if (!other.getErrorCode().isEmpty()) {
        errorCode_ = other.errorCode_;
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ctrip.soa.ErrorFieldType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.soa.ErrorFieldType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object fieldName_ = "";
    /**
     * <code>string FieldName = 1;</code>
     */
    public String getFieldName() {
      Object ref = fieldName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        fieldName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string FieldName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFieldNameBytes() {
      Object ref = fieldName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        fieldName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string FieldName = 1;</code>
     */
    public Builder setFieldName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      fieldName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string FieldName = 1;</code>
     */
    public Builder clearFieldName() {

      fieldName_ = getDefaultInstance().getFieldName();
      onChanged();
      return this;
    }
    /**
     * <code>string FieldName = 1;</code>
     */
    public Builder setFieldNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      fieldName_ = value;
      onChanged();
      return this;
    }

    private Object errorCode_ = "";
    /**
     * <code>string ErrorCode = 2;</code>
     */
    public String getErrorCode() {
      Object ref = errorCode_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        errorCode_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string ErrorCode = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrorCodeBytes() {
      Object ref = errorCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        errorCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ErrorCode = 2;</code>
     */
    public Builder setErrorCode(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      errorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ErrorCode = 2;</code>
     */
    public Builder clearErrorCode() {

      errorCode_ = getDefaultInstance().getErrorCode();
      onChanged();
      return this;
    }
    /**
     * <code>string ErrorCode = 2;</code>
     */
    public Builder setErrorCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      errorCode_ = value;
      onChanged();
      return this;
    }

    private Object message_ = "";
    /**
     * <code>string Message = 3;</code>
     */
    public String getMessage() {
      Object ref = message_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string Message = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Message = 3;</code>
     */
    public Builder setMessage(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Message = 3;</code>
     */
    public Builder clearMessage() {

      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string Message = 3;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      message_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ctrip.soa.ErrorFieldType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.soa.ErrorFieldType)
  private static final com.ctrip.soa.ErrorFieldType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.soa.ErrorFieldType();
  }

  public static com.ctrip.soa.ErrorFieldType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorFieldType>
      PARSER = new com.google.protobuf.AbstractParser<ErrorFieldType>() {
    @Override
    public ErrorFieldType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ErrorFieldType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ErrorFieldType> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ErrorFieldType> getParserForType() {
    return PARSER;
  }

  @Override
  public com.ctrip.soa.ErrorFieldType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
