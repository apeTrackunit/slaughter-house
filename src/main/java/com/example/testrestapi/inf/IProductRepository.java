package com.example.testrestapi.inf;

import com.example.testrestapi.entity.Product;

import java.util.List;

public interface IProductRepository {
    List<Long> getProducts(long animalId);
}
