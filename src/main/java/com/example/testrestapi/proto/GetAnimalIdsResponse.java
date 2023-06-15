// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlaughterHouse.proto

package com.example.testrestapi.proto;

/**
 * Protobuf type {@code com.example.testrestapi.proto.GetAnimalIdsResponse}
 */
public final class GetAnimalIdsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.testrestapi.proto.GetAnimalIdsResponse)
    GetAnimalIdsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAnimalIdsResponse.newBuilder() to construct.
  private GetAnimalIdsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAnimalIdsResponse() {
    animalIds_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAnimalIdsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAnimalIdsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              animalIds_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            animalIds_.addLong(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              animalIds_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              animalIds_.addLong(input.readInt64());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        animalIds_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.testrestapi.proto.SlaughterHouse.internal_static_com_example_testrestapi_proto_GetAnimalIdsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.testrestapi.proto.SlaughterHouse.internal_static_com_example_testrestapi_proto_GetAnimalIdsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.testrestapi.proto.GetAnimalIdsResponse.class, com.example.testrestapi.proto.GetAnimalIdsResponse.Builder.class);
  }

  public static final int ANIMALIDS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList animalIds_;
  /**
   * <code>repeated int64 animalIds = 1 [packed = true];</code>
   * @return A list containing the animalIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getAnimalIdsList() {
    return animalIds_;
  }
  /**
   * <code>repeated int64 animalIds = 1 [packed = true];</code>
   * @return The count of animalIds.
   */
  public int getAnimalIdsCount() {
    return animalIds_.size();
  }
  /**
   * <code>repeated int64 animalIds = 1 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The animalIds at the given index.
   */
  public long getAnimalIds(int index) {
    return animalIds_.getLong(index);
  }
  private int animalIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getAnimalIdsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(animalIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < animalIds_.size(); i++) {
      output.writeInt64NoTag(animalIds_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < animalIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(animalIds_.getLong(i));
      }
      size += dataSize;
      if (!getAnimalIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      animalIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.example.testrestapi.proto.GetAnimalIdsResponse)) {
      return super.equals(obj);
    }
    com.example.testrestapi.proto.GetAnimalIdsResponse other = (com.example.testrestapi.proto.GetAnimalIdsResponse) obj;

    if (!getAnimalIdsList()
        .equals(other.getAnimalIdsList())) return false;
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
    if (getAnimalIdsCount() > 0) {
      hash = (37 * hash) + ANIMALIDS_FIELD_NUMBER;
      hash = (53 * hash) + getAnimalIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.testrestapi.proto.GetAnimalIdsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.testrestapi.proto.GetAnimalIdsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.testrestapi.proto.GetAnimalIdsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.testrestapi.proto.GetAnimalIdsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.testrestapi.proto.GetAnimalIdsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.testrestapi.proto.GetAnimalIdsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.testrestapi.proto.GetAnimalIdsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.testrestapi.proto.GetAnimalIdsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.testrestapi.proto.GetAnimalIdsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.testrestapi.proto.GetAnimalIdsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.testrestapi.proto.GetAnimalIdsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.testrestapi.proto.GetAnimalIdsResponse parseFrom(
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
  public static Builder newBuilder(com.example.testrestapi.proto.GetAnimalIdsResponse prototype) {
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
   * Protobuf type {@code com.example.testrestapi.proto.GetAnimalIdsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.testrestapi.proto.GetAnimalIdsResponse)
      com.example.testrestapi.proto.GetAnimalIdsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.testrestapi.proto.SlaughterHouse.internal_static_com_example_testrestapi_proto_GetAnimalIdsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.testrestapi.proto.SlaughterHouse.internal_static_com_example_testrestapi_proto_GetAnimalIdsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.testrestapi.proto.GetAnimalIdsResponse.class, com.example.testrestapi.proto.GetAnimalIdsResponse.Builder.class);
    }

    // Construct using com.example.testrestapi.proto.GetAnimalIdsResponse.newBuilder()
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
      animalIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.testrestapi.proto.SlaughterHouse.internal_static_com_example_testrestapi_proto_GetAnimalIdsResponse_descriptor;
    }

    @java.lang.Override
    public com.example.testrestapi.proto.GetAnimalIdsResponse getDefaultInstanceForType() {
      return com.example.testrestapi.proto.GetAnimalIdsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.testrestapi.proto.GetAnimalIdsResponse build() {
      com.example.testrestapi.proto.GetAnimalIdsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.testrestapi.proto.GetAnimalIdsResponse buildPartial() {
      com.example.testrestapi.proto.GetAnimalIdsResponse result = new com.example.testrestapi.proto.GetAnimalIdsResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        animalIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.animalIds_ = animalIds_;
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
      if (other instanceof com.example.testrestapi.proto.GetAnimalIdsResponse) {
        return mergeFrom((com.example.testrestapi.proto.GetAnimalIdsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.testrestapi.proto.GetAnimalIdsResponse other) {
      if (other == com.example.testrestapi.proto.GetAnimalIdsResponse.getDefaultInstance()) return this;
      if (!other.animalIds_.isEmpty()) {
        if (animalIds_.isEmpty()) {
          animalIds_ = other.animalIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAnimalIdsIsMutable();
          animalIds_.addAll(other.animalIds_);
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
      com.example.testrestapi.proto.GetAnimalIdsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.testrestapi.proto.GetAnimalIdsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList animalIds_ = emptyLongList();
    private void ensureAnimalIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        animalIds_ = mutableCopy(animalIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 animalIds = 1 [packed = true];</code>
     * @return A list containing the animalIds.
     */
    public java.util.List<java.lang.Long>
        getAnimalIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(animalIds_) : animalIds_;
    }
    /**
     * <code>repeated int64 animalIds = 1 [packed = true];</code>
     * @return The count of animalIds.
     */
    public int getAnimalIdsCount() {
      return animalIds_.size();
    }
    /**
     * <code>repeated int64 animalIds = 1 [packed = true];</code>
     * @param index The index of the element to return.
     * @return The animalIds at the given index.
     */
    public long getAnimalIds(int index) {
      return animalIds_.getLong(index);
    }
    /**
     * <code>repeated int64 animalIds = 1 [packed = true];</code>
     * @param index The index to set the value at.
     * @param value The animalIds to set.
     * @return This builder for chaining.
     */
    public Builder setAnimalIds(
        int index, long value) {
      ensureAnimalIdsIsMutable();
      animalIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 animalIds = 1 [packed = true];</code>
     * @param value The animalIds to add.
     * @return This builder for chaining.
     */
    public Builder addAnimalIds(long value) {
      ensureAnimalIdsIsMutable();
      animalIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 animalIds = 1 [packed = true];</code>
     * @param values The animalIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnimalIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureAnimalIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, animalIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 animalIds = 1 [packed = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimalIds() {
      animalIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:com.example.testrestapi.proto.GetAnimalIdsResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.testrestapi.proto.GetAnimalIdsResponse)
  private static final com.example.testrestapi.proto.GetAnimalIdsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.testrestapi.proto.GetAnimalIdsResponse();
  }

  public static com.example.testrestapi.proto.GetAnimalIdsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAnimalIdsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAnimalIdsResponse>() {
    @java.lang.Override
    public GetAnimalIdsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAnimalIdsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAnimalIdsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAnimalIdsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.testrestapi.proto.GetAnimalIdsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
