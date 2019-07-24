// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1beta1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1beta1;

public interface CreateAssessmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1beta1.CreateAssessmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project in which the assessment will be created,
   * in the format "projects/{project_number}".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the project in which the assessment will be created,
   * in the format "projects/{project_number}".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The asessment details.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.Assessment assessment = 2;</code>
   */
  boolean hasAssessment();
  /**
   *
   *
   * <pre>
   * The asessment details.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.Assessment assessment = 2;</code>
   */
  com.google.recaptchaenterprise.v1beta1.Assessment getAssessment();
  /**
   *
   *
   * <pre>
   * The asessment details.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.Assessment assessment = 2;</code>
   */
  com.google.recaptchaenterprise.v1beta1.AssessmentOrBuilder getAssessmentOrBuilder();
}