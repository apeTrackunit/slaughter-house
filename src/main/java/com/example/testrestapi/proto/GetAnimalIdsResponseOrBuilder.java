// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlaughterHouse.proto

package com.example.testrestapi.proto;

public interface GetAnimalIdsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.testrestapi.proto.GetAnimalIdsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int64 animalIds = 1 [packed = true];</code>
   * @return A list containing the animalIds.
   */
  java.util.List<java.lang.Long> getAnimalIdsList();
  /**
   * <code>repeated int64 animalIds = 1 [packed = true];</code>
   * @return The count of animalIds.
   */
  int getAnimalIdsCount();
  /**
   * <code>repeated int64 animalIds = 1 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The animalIds at the given index.
   */
  long getAnimalIds(int index);
}
