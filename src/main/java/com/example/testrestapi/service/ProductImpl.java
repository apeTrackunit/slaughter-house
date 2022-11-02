package com.example.testrestapi.service;

import com.example.testrestapi.*;
import com.example.testrestapi.dbConnection.DBProduct;
import com.example.testrestapi.entity.Product;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class ProductImpl extends ProductsServiceGrpc.ProductsServiceImplBase {

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
