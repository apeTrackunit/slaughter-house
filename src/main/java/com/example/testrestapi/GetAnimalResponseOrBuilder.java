// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlaughterHouse.proto

package com.example.testrestapi;

public interface GetAnimalResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.testrestapi.GetAnimalResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 animalId = 1;</code>
   * @return The animalId.
   */
  long getAnimalId();

  /**
   * <code>int64 weight = 2;</code>
   * @return The weight.
   */
  long getWeight();

  /**
   * <code>bool isOk = 3;</code>
   * @return The isOk.
   */
  boolean getIsOk();

  /**
   * <code>int64 farmId = 4;</code>
   * @return The farmId.
   */
  long getFarmId();

  /**
   * <code>int64 animalTypeId = 5;</code>
   * @return The animalTypeId.
   */
  long getAnimalTypeId();

  /**
   * <code>string registrationDate = 6;</code>
   * @return The registrationDate.
   */
  java.lang.String getRegistrationDate();
  /**
   * <code>string registrationDate = 6;</code>
   * @return The bytes for registrationDate.
   */
  com.google.protobuf.ByteString
      getRegistrationDateBytes();
}
