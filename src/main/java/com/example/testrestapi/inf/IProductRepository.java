package com.example.testrestapi.inf;

import com.example.testrestapi.entity.Product;
import com.example.testrestapi.entity.ProductInput;

import java.util.List;

public interface IProductRepository {
    List<Long> getProducts(long animalId);
    String createProduct(ProductInput productInput);
}
