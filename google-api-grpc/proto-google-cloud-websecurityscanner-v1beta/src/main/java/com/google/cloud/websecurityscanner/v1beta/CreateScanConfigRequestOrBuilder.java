// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1beta;

public interface CreateScanConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * The parent resource name where the scan is created, which should be a
   * project resource name in the format 'projects/{projectId}'.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required.
   * The parent resource name where the scan is created, which should be a
   * project resource name in the format 'projects/{projectId}'.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required.
   * The ScanConfig to be created.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanConfig scan_config = 2;</code>
   */
  boolean hasScanConfig();
  /**
   *
   *
   * <pre>
   * Required.
   * The ScanConfig to be created.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanConfig scan_config = 2;</code>
   */
  com.google.cloud.websecurityscanner.v1beta.ScanConfig getScanConfig();
  /**
   *
   *
   * <pre>
   * Required.
   * The ScanConfig to be created.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanConfig scan_config = 2;</code>
   */
  com.google.cloud.websecurityscanner.v1beta.ScanConfigOrBuilder getScanConfigOrBuilder();
}