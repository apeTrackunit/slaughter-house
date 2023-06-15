package com.example.testrestapi.service;

import com.example.testrestapi.proto.*;
import com.example.testrestapi.dbConnection.DBProduct;
import com.example.testrestapi.entity.Product;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service
public class ProductImpl extends ProductsServiceGrpc.ProductsServiceImplBase {

    /**
     * Unnecessary
     * @param request
     * @param responseObserver
     */
    @Override
    public void getProductService(GetProductRequest request, StreamObserver<GetProductResponse> responseObserver) {
        try {
            Product product = DBProduct.getProductById(request.getId());
            GetProductResponse.Builder builder=GetProductResponse.newBuilder();
            builder.setName(product.getName());
            builder.setDescription(product.getDescription());


            GetProductResponse responseText=builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void createProductService(CreateProductRequest request, StreamObserver<CreateProductResponse> responseObserver) {
        try {
            long response=DBProduct.createProduct(
                    request.getName(), request.getDescription(), 1
            );

            CreateProductResponse.Builder builder=CreateProductResponse.newBuilder();
            builder.setId(response);

            CreateProductResponse responseText=builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void getProductIds(GetProductIdsRequest request, StreamObserver<GetProductIdsResponse> responseObserver)
    {
        try{
            List<Product> products = DBProduct.getProductsByAnimalId(request.getAnimalId());

            GetProductIdsResponse.Builder builder = GetProductIdsResponse.newBuilder();
            builder.addAllProductIds(products.stream().map(x -> x.getId()).toList());

            GetProductIdsResponse responseText = builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();
        }catch(Exception ex){
            System.out.println(ex.getStackTrace());
        }
    }
}
