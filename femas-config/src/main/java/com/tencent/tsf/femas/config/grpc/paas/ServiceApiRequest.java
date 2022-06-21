// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaasPolling.proto

package com.tencent.tsf.femas.config.grpc.paas;

import com.tencent.tsf.femas.common.util.StringUtils;

/**
 * Protobuf type {@code grpc.ServiceApiRequest}
 */
public final class ServiceApiRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.ServiceApiRequest)
    ServiceApiRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServiceApiRequest.newBuilder() to construct.
  private ServiceApiRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceApiRequest() {
    namespaceId_ = "";
    serviceName_ = "";
    applicationVersion_ = "";
    data_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServiceApiRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServiceApiRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            namespaceId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            serviceName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            applicationVersion_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            data_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.tencent.tsf.femas.config.grpc.paas.LongPollingServer.internal_static_grpc_ServiceApiRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tencent.tsf.femas.config.grpc.paas.LongPollingServer.internal_static_grpc_ServiceApiRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest.class, com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest.Builder.class);
  }

  public static final int NAMESPACEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object namespaceId_;
  /**
   * <code>string namespaceId = 1;</code>
   * @return The namespaceId.
   */
  @java.lang.Override
  public java.lang.String getNamespaceId() {
    java.lang.Object ref = namespaceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespaceId_ = s;
      return s;
    }
  }
  /**
   * <code>string namespaceId = 1;</code>
   * @return The bytes for namespaceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNamespaceIdBytes() {
    java.lang.Object ref = namespaceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namespaceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object serviceName_;
  /**
   * <code>string serviceName = 2;</code>
   * @return The serviceName.
   */
  @java.lang.Override
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   * <code>string serviceName = 2;</code>
   * @return The bytes for serviceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APPLICATIONVERSION_FIELD_NUMBER = 3;
  private volatile java.lang.Object applicationVersion_;
  /**
   * <code>string applicationVersion = 3;</code>
   * @return The applicationVersion.
   */
  @java.lang.Override
  public java.lang.String getApplicationVersion() {
    java.lang.Object ref = applicationVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      applicationVersion_ = s;
      return s;
    }
  }
  /**
   * <code>string applicationVersion = 3;</code>
   * @return The bytes for applicationVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApplicationVersionBytes() {
    java.lang.Object ref = applicationVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      applicationVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 4;
  private volatile java.lang.Object data_;
  /**
   * <code>string data = 4;</code>
   * @return The data.
   */
  @java.lang.Override
  public java.lang.String getData() {
    java.lang.Object ref = data_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      data_ = s;
      return s;
    }
  }
  /**
   * <code>string data = 4;</code>
   * @return The bytes for data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataBytes() {
    java.lang.Object ref = data_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      data_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) {
      return true;
    }
    if (isInitialized == 0) {
      return false;
    }

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (StringUtils.isNotBlank((String)namespaceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namespaceId_);
    }
    if (StringUtils.isNotBlank((String)serviceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceName_);
    }
    if (StringUtils.isNotBlank((String)applicationVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, applicationVersion_);
    }
    if (StringUtils.isNotBlank((String)data_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, data_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (StringUtils.isNotBlank((String)namespaceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namespaceId_);
    }
    if (StringUtils.isNotBlank((String)serviceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceName_);
    }
    if (StringUtils.isNotBlank((String)applicationVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, applicationVersion_);
    }
    if (StringUtils.isNotBlank((String)data_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, data_);
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
    if (!(obj instanceof com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest)) {
      return super.equals(obj);
    }
    com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest other = (com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest) obj;

    if (!getNamespaceId().equals(other.getNamespaceId())) {
      return false;
    }
    if (!getServiceName().equals(other.getServiceName())) {
      return false;
    }
    if (!getApplicationVersion().equals(other.getApplicationVersion())){
      return false;
    }
    if (!getData().equals(other.getData())) {
      return false;
    }
    if (!unknownFields.equals(other.unknownFields)){
      return false;
    }
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAMESPACEID_FIELD_NUMBER;
    hash = (53 * hash) + getNamespaceId().hashCode();
    hash = (37 * hash) + SERVICENAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    hash = (37 * hash) + APPLICATIONVERSION_FIELD_NUMBER;
    hash = (53 * hash) + getApplicationVersion().hashCode();
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parseFrom(
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
  public static Builder newBuilder(com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest prototype) {
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
   * Protobuf type {@code grpc.ServiceApiRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.ServiceApiRequest)
      com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tencent.tsf.femas.config.grpc.paas.LongPollingServer.internal_static_grpc_ServiceApiRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tencent.tsf.femas.config.grpc.paas.LongPollingServer.internal_static_grpc_ServiceApiRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest.class, com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest.Builder.class);
    }

    // Construct using com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest.newBuilder()
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
      namespaceId_ = "";

      serviceName_ = "";

      applicationVersion_ = "";

      data_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tencent.tsf.femas.config.grpc.paas.LongPollingServer.internal_static_grpc_ServiceApiRequest_descriptor;
    }

    @java.lang.Override
    public com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest getDefaultInstanceForType() {
      return com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest build() {
      com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest buildPartial() {
      com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest result = new com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest(this);
      result.namespaceId_ = namespaceId_;
      result.serviceName_ = serviceName_;
      result.applicationVersion_ = applicationVersion_;
      result.data_ = data_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest) {
        return mergeFrom((com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest other) {
      if (other == com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest.getDefaultInstance()) return this;
      if (!other.getNamespaceId().isEmpty()) {
        namespaceId_ = other.namespaceId_;
        onChanged();
      }
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        onChanged();
      }
      if (!other.getApplicationVersion().isEmpty()) {
        applicationVersion_ = other.applicationVersion_;
        onChanged();
      }
      if (!other.getData().isEmpty()) {
        data_ = other.data_;
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
      com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object namespaceId_ = "";
    /**
     * <code>string namespaceId = 1;</code>
     * @return The namespaceId.
     */
    public java.lang.String getNamespaceId() {
      java.lang.Object ref = namespaceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespaceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string namespaceId = 1;</code>
     * @return The bytes for namespaceId.
     */
    @Override
    public com.google.protobuf.ByteString
        getNamespaceIdBytes() {
      java.lang.Object ref = namespaceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namespaceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string namespaceId = 1;</code>
     * @param value The namespaceId to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      namespaceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string namespaceId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNamespaceId() {
      
      namespaceId_ = getDefaultInstance().getNamespaceId();
      onChanged();
      return this;
    }
    /**
     * <code>string namespaceId = 1;</code>
     * @param value The bytes for namespaceId to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      namespaceId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object serviceName_ = "";
    /**
     * <code>string serviceName = 2;</code>
     * @return The serviceName.
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string serviceName = 2;</code>
     * @return The bytes for serviceName.
     */
    @Override
    public com.google.protobuf.ByteString
        getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string serviceName = 2;</code>
     * @param value The serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string serviceName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceName() {
      
      serviceName_ = getDefaultInstance().getServiceName();
      onChanged();
      return this;
    }
    /**
     * <code>string serviceName = 2;</code>
     * @param value The bytes for serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object applicationVersion_ = "";
    /**
     * <code>string applicationVersion = 3;</code>
     * @return The applicationVersion.
     */
    @Override
    public java.lang.String getApplicationVersion() {
      java.lang.Object ref = applicationVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        applicationVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string applicationVersion = 3;</code>
     * @return The bytes for applicationVersion.
     */
    @Override
    public com.google.protobuf.ByteString
        getApplicationVersionBytes() {
      java.lang.Object ref = applicationVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        applicationVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string applicationVersion = 3;</code>
     * @param value The applicationVersion to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      applicationVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string applicationVersion = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationVersion() {
      
      applicationVersion_ = getDefaultInstance().getApplicationVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string applicationVersion = 3;</code>
     * @param value The bytes for applicationVersion to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      applicationVersion_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object data_ = "";
    /**
     * <code>string data = 4;</code>
     * @return The data.
     */
    @Override
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        data_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string data = 4;</code>
     * @return The bytes for data.
     */
    @Override
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string data = 4;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string data = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }
    /**
     * <code>string data = 4;</code>
     * @param value The bytes for data to set.
     * @return This builder for chaining.
     */
    public Builder setDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      data_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.ServiceApiRequest)
  }

  // @@protoc_insertion_point(class_scope:grpc.ServiceApiRequest)
  private static final com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest();
  }

  public static com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceApiRequest>
      PARSER = new com.google.protobuf.AbstractParser<ServiceApiRequest>() {
    @java.lang.Override
    public ServiceApiRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServiceApiRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServiceApiRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceApiRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tencent.tsf.femas.config.grpc.paas.ServiceApiRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
