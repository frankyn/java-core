// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

/**
 * <pre>
 * Specifies (some of) the contents of a single row/column/timestamp of a table.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.Cell}
 */
public  final class Cell extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.Cell)
    CellOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Cell.newBuilder() to construct.
  private Cell(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Cell() {
    timestampMicros_ = 0L;
    value_ = com.google.protobuf.ByteString.EMPTY;
    labels_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Cell(
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

            timestampMicros_ = input.readInt64();
            break;
          }
          case 18: {

            value_ = input.readBytes();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              labels_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            labels_.add(s);
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        labels_ = labels_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Cell_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Cell_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.Cell.class, com.google.bigtable.v2.Cell.Builder.class);
  }

  private int bitField0_;
  public static final int TIMESTAMP_MICROS_FIELD_NUMBER = 1;
  private long timestampMicros_;
  /**
   * <pre>
   * The cell's stored timestamp, which also uniquely identifies it within
   * its column.
   * Values are always expressed in microseconds, but individual tables may set
   * a coarser granularity to further restrict the allowed values. For
   * example, a table which specifies millisecond granularity will only allow
   * values of `timestamp_micros` which are multiples of 1000.
   * </pre>
   *
   * <code>int64 timestamp_micros = 1;</code>
   */
  public long getTimestampMicros() {
    return timestampMicros_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString value_;
  /**
   * <pre>
   * The value stored in the cell.
   * May contain any byte string, including the empty string, up to 100MiB in
   * length.
   * </pre>
   *
   * <code>bytes value = 2;</code>
   */
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  public static final int LABELS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList labels_;
  /**
   * <pre>
   * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
   * </pre>
   *
   * <code>repeated string labels = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getLabelsList() {
    return labels_;
  }
  /**
   * <pre>
   * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
   * </pre>
   *
   * <code>repeated string labels = 3;</code>
   */
  public int getLabelsCount() {
    return labels_.size();
  }
  /**
   * <pre>
   * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
   * </pre>
   *
   * <code>repeated string labels = 3;</code>
   */
  public java.lang.String getLabels(int index) {
    return labels_.get(index);
  }
  /**
   * <pre>
   * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
   * </pre>
   *
   * <code>repeated string labels = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLabelsBytes(int index) {
    return labels_.getByteString(index);
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
    if (timestampMicros_ != 0L) {
      output.writeInt64(1, timestampMicros_);
    }
    if (!value_.isEmpty()) {
      output.writeBytes(2, value_);
    }
    for (int i = 0; i < labels_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, labels_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestampMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, timestampMicros_);
    }
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, value_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < labels_.size(); i++) {
        dataSize += computeStringSizeNoTag(labels_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLabelsList().size();
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
    if (!(obj instanceof com.google.bigtable.v2.Cell)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.Cell other = (com.google.bigtable.v2.Cell) obj;

    boolean result = true;
    result = result && (getTimestampMicros()
        == other.getTimestampMicros());
    result = result && getValue()
        .equals(other.getValue());
    result = result && getLabelsList()
        .equals(other.getLabelsList());
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
    hash = (37 * hash) + TIMESTAMP_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestampMicros());
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    if (getLabelsCount() > 0) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + getLabelsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.Cell parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.Cell parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.Cell parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.Cell parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.Cell parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.Cell parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.Cell parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.Cell parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.v2.Cell parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.Cell parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.v2.Cell parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.Cell parseFrom(
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
  public static Builder newBuilder(com.google.bigtable.v2.Cell prototype) {
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
   * Specifies (some of) the contents of a single row/column/timestamp of a table.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.Cell}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.Cell)
      com.google.bigtable.v2.CellOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Cell_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Cell_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.Cell.class, com.google.bigtable.v2.Cell.Builder.class);
    }

    // Construct using com.google.bigtable.v2.Cell.newBuilder()
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
      timestampMicros_ = 0L;

      value_ = com.google.protobuf.ByteString.EMPTY;

      labels_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Cell_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.v2.Cell getDefaultInstanceForType() {
      return com.google.bigtable.v2.Cell.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.v2.Cell build() {
      com.google.bigtable.v2.Cell result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.v2.Cell buildPartial() {
      com.google.bigtable.v2.Cell result = new com.google.bigtable.v2.Cell(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.timestampMicros_ = timestampMicros_;
      result.value_ = value_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        labels_ = labels_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.labels_ = labels_;
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
      if (other instanceof com.google.bigtable.v2.Cell) {
        return mergeFrom((com.google.bigtable.v2.Cell)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.Cell other) {
      if (other == com.google.bigtable.v2.Cell.getDefaultInstance()) return this;
      if (other.getTimestampMicros() != 0L) {
        setTimestampMicros(other.getTimestampMicros());
      }
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      if (!other.labels_.isEmpty()) {
        if (labels_.isEmpty()) {
          labels_ = other.labels_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureLabelsIsMutable();
          labels_.addAll(other.labels_);
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
      com.google.bigtable.v2.Cell parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.v2.Cell) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long timestampMicros_ ;
    /**
     * <pre>
     * The cell's stored timestamp, which also uniquely identifies it within
     * its column.
     * Values are always expressed in microseconds, but individual tables may set
     * a coarser granularity to further restrict the allowed values. For
     * example, a table which specifies millisecond granularity will only allow
     * values of `timestamp_micros` which are multiples of 1000.
     * </pre>
     *
     * <code>int64 timestamp_micros = 1;</code>
     */
    public long getTimestampMicros() {
      return timestampMicros_;
    }
    /**
     * <pre>
     * The cell's stored timestamp, which also uniquely identifies it within
     * its column.
     * Values are always expressed in microseconds, but individual tables may set
     * a coarser granularity to further restrict the allowed values. For
     * example, a table which specifies millisecond granularity will only allow
     * values of `timestamp_micros` which are multiples of 1000.
     * </pre>
     *
     * <code>int64 timestamp_micros = 1;</code>
     */
    public Builder setTimestampMicros(long value) {
      
      timestampMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The cell's stored timestamp, which also uniquely identifies it within
     * its column.
     * Values are always expressed in microseconds, but individual tables may set
     * a coarser granularity to further restrict the allowed values. For
     * example, a table which specifies millisecond granularity will only allow
     * values of `timestamp_micros` which are multiples of 1000.
     * </pre>
     *
     * <code>int64 timestamp_micros = 1;</code>
     */
    public Builder clearTimestampMicros() {
      
      timestampMicros_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The value stored in the cell.
     * May contain any byte string, including the empty string, up to 100MiB in
     * length.
     * </pre>
     *
     * <code>bytes value = 2;</code>
     */
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <pre>
     * The value stored in the cell.
     * May contain any byte string, including the empty string, up to 100MiB in
     * length.
     * </pre>
     *
     * <code>bytes value = 2;</code>
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value stored in the cell.
     * May contain any byte string, including the empty string, up to 100MiB in
     * length.
     * </pre>
     *
     * <code>bytes value = 2;</code>
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList labels_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureLabelsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        labels_ = new com.google.protobuf.LazyStringArrayList(labels_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
     * </pre>
     *
     * <code>repeated string labels = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getLabelsList() {
      return labels_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
     * </pre>
     *
     * <code>repeated string labels = 3;</code>
     */
    public int getLabelsCount() {
      return labels_.size();
    }
    /**
     * <pre>
     * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
     * </pre>
     *
     * <code>repeated string labels = 3;</code>
     */
    public java.lang.String getLabels(int index) {
      return labels_.get(index);
    }
    /**
     * <pre>
     * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
     * </pre>
     *
     * <code>repeated string labels = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLabelsBytes(int index) {
      return labels_.getByteString(index);
    }
    /**
     * <pre>
     * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
     * </pre>
     *
     * <code>repeated string labels = 3;</code>
     */
    public Builder setLabels(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLabelsIsMutable();
      labels_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
     * </pre>
     *
     * <code>repeated string labels = 3;</code>
     */
    public Builder addLabels(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLabelsIsMutable();
      labels_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
     * </pre>
     *
     * <code>repeated string labels = 3;</code>
     */
    public Builder addAllLabels(
        java.lang.Iterable<java.lang.String> values) {
      ensureLabelsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, labels_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
     * </pre>
     *
     * <code>repeated string labels = 3;</code>
     */
    public Builder clearLabels() {
      labels_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
     * </pre>
     *
     * <code>repeated string labels = 3;</code>
     */
    public Builder addLabelsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureLabelsIsMutable();
      labels_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.Cell)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.Cell)
  private static final com.google.bigtable.v2.Cell DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.Cell();
  }

  public static com.google.bigtable.v2.Cell getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Cell>
      PARSER = new com.google.protobuf.AbstractParser<Cell>() {
    @java.lang.Override
    public Cell parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Cell(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Cell> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Cell> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.v2.Cell getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
