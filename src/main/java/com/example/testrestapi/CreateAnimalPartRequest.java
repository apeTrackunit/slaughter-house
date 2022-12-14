// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlaughterHouse.proto

package com.example.testrestapi;

/**
 * Protobuf type {@code com.example.testrestapi.CreateAnimalPartRequest}
 */
public final class CreateAnimalPartRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.testrestapi.CreateAnimalPartRequest)
    CreateAnimalPartRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAnimalPartRequest.newBuilder() to construct.
  private CreateAnimalPartRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAnimalPartRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAnimalPartRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateAnimalPartRequest(
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
          case 8: {

            weight_ = input.readInt64();
            break;
          }
          case 16: {

            animalId_ = input.readInt64();
            break;
          }
          case 24: {

            trayId_ = input.readInt64();
            break;
          }
          case 32: {

            animalPartType_ = input.readInt64();
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
    return com.example.testrestapi.SlaughterHouse.internal_static_com_example_testrestapi_CreateAnimalPartRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.testrestapi.SlaughterHouse.internal_static_com_example_testrestapi_CreateAnimalPartRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.testrestapi.CreateAnimalPartRequest.class, com.example.testrestapi.CreateAnimalPartRequest.Builder.class);
  }

  public static final int WEIGHT_FIELD_NUMBER = 1;
  private long weight_;
  /**
   * <code>int64 weight = 1;</code>
   * @return The weight.
   */
  @java.lang.Override
  public long getWeight() {
    return weight_;
  }

  public static final int ANIMALID_FIELD_NUMBER = 2;
  private long animalId_;
  /**
   * <code>int64 animalId = 2;</code>
   * @return The animalId.
   */
  @java.lang.Override
  public long getAnimalId() {
    return animalId_;
  }

  public static final int TRAYID_FIELD_NUMBER = 3;
  private long trayId_;
  /**
   * <code>int64 trayId = 3;</code>
   * @return The trayId.
   */
  @java.lang.Override
  public long getTrayId() {
    return trayId_;
  }

  public static final int ANIMALPARTTYPE_FIELD_NUMBER = 4;
  private long animalPartType_;
  /**
   * <code>int64 animalPartType = 4;</code>
   * @return The animalPartType.
   */
  @java.lang.Override
  public long getAnimalPartType() {
    return animalPartType_;
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
    if (weight_ != 0L) {
      output.writeInt64(1, weight_);
    }
    if (animalId_ != 0L) {
      output.writeInt64(2, animalId_);
    }
    if (trayId_ != 0L) {
      output.writeInt64(3, trayId_);
    }
    if (animalPartType_ != 0L) {
      output.writeInt64(4, animalPartType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (weight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, weight_);
    }
    if (animalId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, animalId_);
    }
    if (trayId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, trayId_);
    }
    if (animalPartType_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, animalPartType_);
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
    if (!(obj instanceof com.example.testrestapi.CreateAnimalPartRequest)) {
      return super.equals(obj);
    }
    com.example.testrestapi.CreateAnimalPartRequest other = (com.example.testrestapi.CreateAnimalPartRequest) obj;

    if (getWeight()
        != other.getWeight()) return false;
    if (getAnimalId()
        != other.getAnimalId()) return false;
    if (getTrayId()
        != other.getTrayId()) return false;
    if (getAnimalPartType()
        != other.getAnimalPartType()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWeight());
    hash = (37 * hash) + ANIMALID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAnimalId());
    hash = (37 * hash) + TRAYID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTrayId());
    hash = (37 * hash) + ANIMALPARTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAnimalPartType());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.testrestapi.CreateAnimalPartRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.testrestapi.CreateAnimalPartRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.testrestapi.CreateAnimalPartRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.testrestapi.CreateAnimalPartRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.testrestapi.CreateAnimalPartRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.testrestapi.CreateAnimalPartRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.testrestapi.CreateAnimalPartRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.testrestapi.CreateAnimalPartRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.testrestapi.CreateAnimalPartRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.testrestapi.CreateAnimalPartRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.testrestapi.CreateAnimalPartRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.testrestapi.CreateAnimalPartRequest parseFrom(
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
  public static Builder newBuilder(com.example.testrestapi.CreateAnimalPartRequest prototype) {
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
   * Protobuf type {@code com.example.testrestapi.CreateAnimalPartRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.testrestapi.CreateAnimalPartRequest)
      com.example.testrestapi.CreateAnimalPartRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.testrestapi.SlaughterHouse.internal_static_com_example_testrestapi_CreateAnimalPartRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.testrestapi.SlaughterHouse.internal_static_com_example_testrestapi_CreateAnimalPartRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.testrestapi.CreateAnimalPartRequest.class, com.example.testrestapi.CreateAnimalPartRequest.Builder.class);
    }

    // Construct using com.example.testrestapi.CreateAnimalPartRequest.newBuilder()
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
      weight_ = 0L;

      animalId_ = 0L;

      trayId_ = 0L;

      animalPartType_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.testrestapi.SlaughterHouse.internal_static_com_example_testrestapi_CreateAnimalPartRequest_descriptor;
    }

    @java.lang.Override
    public com.example.testrestapi.CreateAnimalPartRequest getDefaultInstanceForType() {
      return com.example.testrestapi.CreateAnimalPartRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.testrestapi.CreateAnimalPartRequest build() {
      com.example.testrestapi.CreateAnimalPartRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.testrestapi.CreateAnimalPartRequest buildPartial() {
      com.example.testrestapi.CreateAnimalPartRequest result = new com.example.testrestapi.CreateAnimalPartRequest(this);
      result.weight_ = weight_;
      result.animalId_ = animalId_;
      result.trayId_ = trayId_;
      result.animalPartType_ = animalPartType_;
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
      if (other instanceof com.example.testrestapi.CreateAnimalPartRequest) {
        return mergeFrom((com.example.testrestapi.CreateAnimalPartRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.testrestapi.CreateAnimalPartRequest other) {
      if (other == com.example.testrestapi.CreateAnimalPartRequest.getDefaultInstance()) return this;
      if (other.getWeight() != 0L) {
        setWeight(other.getWeight());
      }
      if (other.getAnimalId() != 0L) {
        setAnimalId(other.getAnimalId());
      }
      if (other.getTrayId() != 0L) {
        setTrayId(other.getTrayId());
      }
      if (other.getAnimalPartType() != 0L) {
        setAnimalPartType(other.getAnimalPartType());
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
      com.example.testrestapi.CreateAnimalPartRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.testrestapi.CreateAnimalPartRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long weight_ ;
    /**
     * <code>int64 weight = 1;</code>
     * @return The weight.
     */
    @java.lang.Override
    public long getWeight() {
      return weight_;
    }
    /**
     * <code>int64 weight = 1;</code>
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(long value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 weight = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      
      weight_ = 0L;
      onChanged();
      return this;
    }

    private long animalId_ ;
    /**
     * <code>int64 animalId = 2;</code>
     * @return The animalId.
     */
    @java.lang.Override
    public long getAnimalId() {
      return animalId_;
    }
    /**
     * <code>int64 animalId = 2;</code>
     * @param value The animalId to set.
     * @return This builder for chaining.
     */
    public Builder setAnimalId(long value) {
      
      animalId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 animalId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimalId() {
      
      animalId_ = 0L;
      onChanged();
      return this;
    }

    private long trayId_ ;
    /**
     * <code>int64 trayId = 3;</code>
     * @return The trayId.
     */
    @java.lang.Override
    public long getTrayId() {
      return trayId_;
    }
    /**
     * <code>int64 trayId = 3;</code>
     * @param value The trayId to set.
     * @return This builder for chaining.
     */
    public Builder setTrayId(long value) {
      
      trayId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 trayId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrayId() {
      
      trayId_ = 0L;
      onChanged();
      return this;
    }

    private long animalPartType_ ;
    /**
     * <code>int64 animalPartType = 4;</code>
     * @return The animalPartType.
     */
    @java.lang.Override
    public long getAnimalPartType() {
      return animalPartType_;
    }
    /**
     * <code>int64 animalPartType = 4;</code>
     * @param value The animalPartType to set.
     * @return This builder for chaining.
     */
    public Builder setAnimalPartType(long value) {
      
      animalPartType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 animalPartType = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimalPartType() {
      
      animalPartType_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:com.example.testrestapi.CreateAnimalPartRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.testrestapi.CreateAnimalPartRequest)
  private static final com.example.testrestapi.CreateAnimalPartRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.testrestapi.CreateAnimalPartRequest();
  }

  public static com.example.testrestapi.CreateAnimalPartRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAnimalPartRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAnimalPartRequest>() {
    @java.lang.Override
    public CreateAnimalPartRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateAnimalPartRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateAnimalPartRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAnimalPartRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.testrestapi.CreateAnimalPartRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

