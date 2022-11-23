package com.example.testrestapi.grpcclient;

import com.example.testrestapi.*;
import com.example.testrestapi.entity.Product;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class ProductClient implements IProductClient{
    private ManagedChannel managedChannel = ManagedChannelBuilder
            .forAddress("localhost", 8080)
            .usePlaintext()
            .build();

    private ProductsServiceGrpc.ProductsServiceBlockingStub blockingStub = ProductsServiceGrpc.newBlockingStub(managedChannel);


    @Override
    public List<Long> getProducts(long animalId) {

        GetProductIdsRequest input = GetProductIdsRequest.newBuilder().setAnimalId(animalId).build();
        GetProductIdsResponse response = blockingStub.getProductIds(input);

        return response.getProductIdsList();
    }

    @Override
    public Long createProduct(String name, String description) {
        CreateProductRequest input = CreateProductRequest.newBuilder().setName(name).setDescription(description).build();
        CreateProductResponse response = blockingStub.createProductService(input);
        return response.getId();
    }
}
