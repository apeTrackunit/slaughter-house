package com.example.testrestapi.grpcclient;

import com.example.testrestapi.entity.Product;

import java.util.List;

public interface IProductClient {
    List<Long> getProducts(long animalId);
    Long createProduct(String name, String description);
}
