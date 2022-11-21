// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlaughterHouse.proto

package com.example.testrestapi;

/**
 * Protobuf type {@code com.example.testrestapi.GetAnimalPartTypeResponse}
 */
public final class GetAnimalPartTypeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.testrestapi.GetAnimalPartTypeResponse)
    GetAnimalPartTypeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAnimalPartTypeResponse.newBuilder() to construct.
  private GetAnimalPartTypeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAnimalPartTypeResponse() {
    name_ = "";
    description_ = "";
    trayIds_ = emptyLongList();
    animalParts_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAnimalPartTypeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAnimalPartTypeResponse(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              trayIds_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            trayIds_.addLong(input.readInt64());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              trayIds_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              trayIds_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              animalParts_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            animalParts_.addLong(input.readInt64());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              animalParts_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              animalParts_.addLong(input.readInt64());
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
        trayIds_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        animalParts_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.testrestapi.SlaughterHouse.internal_static_com_example_testrestapi_GetAnimalPartTypeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.testrestapi.SlaughterHouse.internal_static_com_example_testrestapi_GetAnimalPartTypeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.testrestapi.GetAnimalPartTypeResponse.class, com.example.testrestapi.GetAnimalPartTypeResponse.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 2;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRAYIDS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.LongList trayIds_;
  /**
   * <code>repeated int64 trayIds = 3;</code>
   * @return A list containing the trayIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getTrayIdsList() {
    return trayIds_;
  }
  /**
   * <code>repeated int64 trayIds = 3;</code>
   * @return The count of trayIds.
   */
  public int getTrayIdsCount() {
    return trayIds_.size();
  }
  /**
   * <code>repeated int64 trayIds = 3;</code>
   * @param index The index of the element to return.
   * @return The trayIds at the given index.
   */
  public long getTrayIds(int index) {
    return trayIds_.getLong(index);
  }
  private int trayIdsMemoizedSerializedSize = -1;

  public static final int ANIMALPARTS_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.LongList animalParts_;
  /**
   * <code>repeated int64 animalParts = 4;</code>
   * @return A list containing the animalParts.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getAnimalPartsList() {
    return animalParts_;
  }
  /**
   * <code>repeated int64 animalParts = 4;</code>
   * @return The count of animalParts.
   */
  public int getAnimalPartsCount() {
    return animalParts_.size();
  }
  /**
   * <code>repeated int64 animalParts = 4;</code>
   * @param index The index of the element to return.
   * @return The animalParts at the given index.
   */
  public long getAnimalParts(int index) {
    return animalParts_.getLong(index);
  }
  private int animalPartsMemoizedSerializedSize = -1;

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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (getTrayIdsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(trayIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < trayIds_.size(); i++) {
      output.writeInt64NoTag(trayIds_.getLong(i));
    }
    if (getAnimalPartsList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(animalPartsMemoizedSerializedSize);
    }
    for (int i = 0; i < animalParts_.size(); i++) {
      output.writeInt64NoTag(animalParts_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < trayIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(trayIds_.getLong(i));
      }
      size += dataSize;
      if (!getTrayIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      trayIdsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < animalParts_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(animalParts_.getLong(i));
      }
      size += dataSize;
      if (!getAnimalPartsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      animalPartsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.example.testrestapi.GetAnimalPartTypeResponse)) {
      return super.equals(obj);
    }
    com.example.testrestapi.GetAnimalPartTypeResponse other = (com.example.testrestapi.GetAnimalPartTypeResponse) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getTrayIdsList()
        .equals(other.getTrayIdsList())) return false;
    if (!getAnimalPartsList()
        .equals(other.getAnimalPartsList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (getTrayIdsCount() > 0) {
      hash = (37 * hash) + TRAYIDS_FIELD_NUMBER;
      hash = (53 * hash) + getTrayIdsList().hashCode();
    }
    if (getAnimalPartsCount() > 0) {
      hash = (37 * hash) + ANIMALPARTS_FIELD_NUMBER;
      hash = (53 * hash) + getAnimalPartsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.testrestapi.GetAnimalPartTypeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.testrestapi.GetAnimalPartTypeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.testrestapi.GetAnimalPartTypeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.testrestapi.GetAnimalPartTypeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.testrestapi.GetAnimalPartTypeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.testrestapi.GetAnimalPartTypeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.testrestapi.GetAnimalPartTypeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.testrestapi.GetAnimalPartTypeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.testrestapi.GetAnimalPartTypeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.testrestapi.GetAnimalPartTypeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.testrestapi.GetAnimalPartTypeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.testrestapi.GetAnimalPartTypeResponse parseFrom(
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
  public static Builder newBuilder(com.example.testrestapi.GetAnimalPartTypeResponse prototype) {
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
   * Protobuf type {@code com.example.testrestapi.GetAnimalPartTypeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.testrestapi.GetAnimalPartTypeResponse)
      com.example.testrestapi.GetAnimalPartTypeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.testrestapi.SlaughterHouse.internal_static_com_example_testrestapi_GetAnimalPartTypeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.testrestapi.SlaughterHouse.internal_static_com_example_testrestapi_GetAnimalPartTypeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.testrestapi.GetAnimalPartTypeResponse.class, com.example.testrestapi.GetAnimalPartTypeResponse.Builder.class);
    }

    // Construct using com.example.testrestapi.GetAnimalPartTypeResponse.newBuilder()
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
      name_ = "";

      description_ = "";

      trayIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      animalParts_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.testrestapi.SlaughterHouse.internal_static_com_example_testrestapi_GetAnimalPartTypeResponse_descriptor;
    }

    @java.lang.Override
    public com.example.testrestapi.GetAnimalPartTypeResponse getDefaultInstanceForType() {
      return com.example.testrestapi.GetAnimalPartTypeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.testrestapi.GetAnimalPartTypeResponse build() {
      com.example.testrestapi.GetAnimalPartTypeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.testrestapi.GetAnimalPartTypeResponse buildPartial() {
      com.example.testrestapi.GetAnimalPartTypeResponse result = new com.example.testrestapi.GetAnimalPartTypeResponse(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.description_ = description_;
      if (((bitField0_ & 0x00000001) != 0)) {
        trayIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.trayIds_ = trayIds_;
      if (((bitField0_ & 0x00000002) != 0)) {
        animalParts_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.animalParts_ = animalParts_;
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
      if (other instanceof com.example.testrestapi.GetAnimalPartTypeResponse) {
        return mergeFrom((com.example.testrestapi.GetAnimalPartTypeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.testrestapi.GetAnimalPartTypeResponse other) {
      if (other == com.example.testrestapi.GetAnimalPartTypeResponse.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.trayIds_.isEmpty()) {
        if (trayIds_.isEmpty()) {
          trayIds_ = other.trayIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTrayIdsIsMutable();
          trayIds_.addAll(other.trayIds_);
        }
        onChanged();
      }
      if (!other.animalParts_.isEmpty()) {
        if (animalParts_.isEmpty()) {
          animalParts_ = other.animalParts_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureAnimalPartsIsMutable();
          animalParts_.addAll(other.animalParts_);
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
      com.example.testrestapi.GetAnimalPartTypeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.testrestapi.GetAnimalPartTypeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 2;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 2;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 2;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList trayIds_ = emptyLongList();
    private void ensureTrayIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        trayIds_ = mutableCopy(trayIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 trayIds = 3;</code>
     * @return A list containing the trayIds.
     */
    public java.util.List<java.lang.Long>
        getTrayIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(trayIds_) : trayIds_;
    }
    /**
     * <code>repeated int64 trayIds = 3;</code>
     * @return The count of trayIds.
     */
    public int getTrayIdsCount() {
      return trayIds_.size();
    }
    /**
     * <code>repeated int64 trayIds = 3;</code>
     * @param index The index of the element to return.
     * @return The trayIds at the given index.
     */
    public long getTrayIds(int index) {
      return trayIds_.getLong(index);
    }
    /**
     * <code>repeated int64 trayIds = 3;</code>
     * @param index The index to set the value at.
     * @param value The trayIds to set.
     * @return This builder for chaining.
     */
    public Builder setTrayIds(
        int index, long value) {
      ensureTrayIdsIsMutable();
      trayIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 trayIds = 3;</code>
     * @param value The trayIds to add.
     * @return This builder for chaining.
     */
    public Builder addTrayIds(long value) {
      ensureTrayIdsIsMutable();
      trayIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 trayIds = 3;</code>
     * @param values The trayIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllTrayIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureTrayIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, trayIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 trayIds = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrayIds() {
      trayIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList animalParts_ = emptyLongList();
    private void ensureAnimalPartsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        animalParts_ = mutableCopy(animalParts_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int64 animalParts = 4;</code>
     * @return A list containing the animalParts.
     */
    public java.util.List<java.lang.Long>
        getAnimalPartsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(animalParts_) : animalParts_;
    }
    /**
     * <code>repeated int64 animalParts = 4;</code>
     * @return The count of animalParts.
     */
    public int getAnimalPartsCount() {
      return animalParts_.size();
    }
    /**
     * <code>repeated int64 animalParts = 4;</code>
     * @param index The index of the element to return.
     * @return The animalParts at the given index.
     */
    public long getAnimalParts(int index) {
      return animalParts_.getLong(index);
    }
    /**
     * <code>repeated int64 animalParts = 4;</code>
     * @param index The index to set the value at.
     * @param value The animalParts to set.
     * @return This builder for chaining.
     */
    public Builder setAnimalParts(
        int index, long value) {
      ensureAnimalPartsIsMutable();
      animalParts_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 animalParts = 4;</code>
     * @param value The animalParts to add.
     * @return This builder for chaining.
     */
    public Builder addAnimalParts(long value) {
      ensureAnimalPartsIsMutable();
      animalParts_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 animalParts = 4;</code>
     * @param values The animalParts to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnimalParts(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureAnimalPartsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, animalParts_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 animalParts = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimalParts() {
      animalParts_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:com.example.testrestapi.GetAnimalPartTypeResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.testrestapi.GetAnimalPartTypeResponse)
  private static final com.example.testrestapi.GetAnimalPartTypeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.testrestapi.GetAnimalPartTypeResponse();
  }

  public static com.example.testrestapi.GetAnimalPartTypeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAnimalPartTypeResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAnimalPartTypeResponse>() {
    @java.lang.Override
    public GetAnimalPartTypeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAnimalPartTypeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAnimalPartTypeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAnimalPartTypeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.testrestapi.GetAnimalPartTypeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

