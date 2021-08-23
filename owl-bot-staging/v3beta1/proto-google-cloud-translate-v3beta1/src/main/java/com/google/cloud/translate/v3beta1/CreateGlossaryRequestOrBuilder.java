// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

public interface CreateGlossaryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.CreateGlossaryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The glossary to create.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the glossary field is set.
   */
  boolean hasGlossary();
  /**
   * <pre>
   * Required. The glossary to create.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The glossary.
   */
  com.google.cloud.translate.v3beta1.Glossary getGlossary();
  /**
   * <pre>
   * Required. The glossary to create.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.translate.v3beta1.GlossaryOrBuilder getGlossaryOrBuilder();
}
