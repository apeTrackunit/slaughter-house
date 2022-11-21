// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlaughterHouse.proto

package com.example.testrestapi;

public interface CreateAnimalPartTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.testrestapi.CreateAnimalPartTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated int64 trayIds = 3;</code>
   * @return A list containing the trayIds.
   */
  java.util.List<java.lang.Long> getTrayIdsList();
  /**
   * <code>repeated int64 trayIds = 3;</code>
   * @return The count of trayIds.
   */
  int getTrayIdsCount();
  /**
   * <code>repeated int64 trayIds = 3;</code>
   * @param index The index of the element to return.
   * @return The trayIds at the given index.
   */
  long getTrayIds(int index);

  /**
   * <code>repeated int64 animalParts = 4;</code>
   * @return A list containing the animalParts.
   */
  java.util.List<java.lang.Long> getAnimalPartsList();
  /**
   * <code>repeated int64 animalParts = 4;</code>
   * @return The count of animalParts.
   */
  int getAnimalPartsCount();
  /**
   * <code>repeated int64 animalParts = 4;</code>
   * @param index The index of the element to return.
   * @return The animalParts at the given index.
   */
  long getAnimalParts(int index);
}