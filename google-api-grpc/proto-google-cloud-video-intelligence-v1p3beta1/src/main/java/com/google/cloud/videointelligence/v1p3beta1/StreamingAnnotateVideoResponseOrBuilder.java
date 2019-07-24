// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

public interface StreamingAnnotateVideoResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If set, returns a [google.rpc.Status][google.rpc.Status] message that
   * specifies the error for the operation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1;</code>
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * If set, returns a [google.rpc.Status][google.rpc.Status] message that
   * specifies the error for the operation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1;</code>
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * If set, returns a [google.rpc.Status][google.rpc.Status] message that
   * specifies the error for the operation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Streaming annotation results.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingVideoAnnotationResults annotation_results = 2;
   * </code>
   */
  boolean hasAnnotationResults();
  /**
   *
   *
   * <pre>
   * Streaming annotation results.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingVideoAnnotationResults annotation_results = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingVideoAnnotationResults
      getAnnotationResults();
  /**
   *
   *
   * <pre>
   * Streaming annotation results.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingVideoAnnotationResults annotation_results = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingVideoAnnotationResultsOrBuilder
      getAnnotationResultsOrBuilder();

  /**
   *
   *
   * <pre>
   * GCS URI that stores annotation results of one streaming session.
   * It is a directory that can hold multiple files in JSON format.
   * Example uri format:
   * gs://bucket_id/object_id/cloud_project_name-session_id
   * </pre>
   *
   * <code>string annotation_results_uri = 3;</code>
   */
  java.lang.String getAnnotationResultsUri();
  /**
   *
   *
   * <pre>
   * GCS URI that stores annotation results of one streaming session.
   * It is a directory that can hold multiple files in JSON format.
   * Example uri format:
   * gs://bucket_id/object_id/cloud_project_name-session_id
   * </pre>
   *
   * <code>string annotation_results_uri = 3;</code>
   */
  com.google.protobuf.ByteString getAnnotationResultsUriBytes();
}