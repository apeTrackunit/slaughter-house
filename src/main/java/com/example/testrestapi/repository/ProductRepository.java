package com.example.testrestapi.repository;

import com.example.testrestapi.entity.Product;
import com.example.testrestapi.grpcclient.IProductClient;
import com.example.testrestapi.grpcclient.ProductClient;
import com.example.testrestapi.inf.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    IProductClient productClient = new ProductClient();

    @Override
    public List<Long> getProducts(long animalId) {
        return productClient.getProducts(animalId);
    }
}
