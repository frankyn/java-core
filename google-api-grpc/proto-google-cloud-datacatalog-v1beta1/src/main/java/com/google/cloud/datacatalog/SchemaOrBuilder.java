// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/schema.proto

package com.google.cloud.datacatalog;

public interface SchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.Schema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Schema of columns. A maximum of 10,000 columns and sub-columns
   * can be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.ColumnSchema columns = 2;</code>
   */
  java.util.List<com.google.cloud.datacatalog.ColumnSchema> getColumnsList();
  /**
   *
   *
   * <pre>
   * Required. Schema of columns. A maximum of 10,000 columns and sub-columns
   * can be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.ColumnSchema columns = 2;</code>
   */
  com.google.cloud.datacatalog.ColumnSchema getColumns(int index);
  /**
   *
   *
   * <pre>
   * Required. Schema of columns. A maximum of 10,000 columns and sub-columns
   * can be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.ColumnSchema columns = 2;</code>
   */
  int getColumnsCount();
  /**
   *
   *
   * <pre>
   * Required. Schema of columns. A maximum of 10,000 columns and sub-columns
   * can be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.ColumnSchema columns = 2;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.ColumnSchemaOrBuilder>
      getColumnsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Schema of columns. A maximum of 10,000 columns and sub-columns
   * can be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.ColumnSchema columns = 2;</code>
   */
  com.google.cloud.datacatalog.ColumnSchemaOrBuilder getColumnsOrBuilder(int index);
}