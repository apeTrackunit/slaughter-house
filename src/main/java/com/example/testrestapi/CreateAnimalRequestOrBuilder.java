// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlaughterHouse.proto

package com.example.testrestapi;

public interface CreateAnimalRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.testrestapi.CreateAnimalRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double weight = 1;</code>
   * @return The weight.
   */
  double getWeight();

  /**
   * <code>bool isOk = 2;</code>
   * @return The isOk.
   */
  boolean getIsOk();

  /**
   * <code>int64 farmId = 3;</code>
   * @return The farmId.
   */
  long getFarmId();

  /**
   * <code>int64 animalTypeId = 4;</code>
   * @return The animalTypeId.
   */
  long getAnimalTypeId();

  /**
   * <code>string registrationDate = 5;</code>
   * @return The registrationDate.
   */
  java.lang.String getRegistrationDate();
  /**
   * <code>string registrationDate = 5;</code>
   * @return The bytes for registrationDate.
   */
  com.google.protobuf.ByteString
      getRegistrationDateBytes();
}
