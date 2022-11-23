package com.example.testrestapi.grpcclient;

import com.example.testrestapi.entity.Product;

import java.util.List;

public interface IProductClient {
    List<Long> getProducts(long animalId);
    String createProduct(String name, String description);
}
