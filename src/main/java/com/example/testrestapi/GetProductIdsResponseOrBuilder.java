// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlaughterHouse.proto

package com.example.testrestapi;

public interface GetProductIdsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.testrestapi.GetProductIdsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int64 productIds = 1 [packed = true];</code>
   * @return A list containing the productIds.
   */
  java.util.List<java.lang.Long> getProductIdsList();
  /**
   * <code>repeated int64 productIds = 1 [packed = true];</code>
   * @return The count of productIds.
   */
  int getProductIdsCount();
  /**
   * <code>repeated int64 productIds = 1 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The productIds at the given index.
   */
  long getProductIds(int index);
}