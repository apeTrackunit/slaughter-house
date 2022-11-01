package com.example.testrestapi.service;

import com.example.testrestapi.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class ProductImpl extends ProductsServiceGrpc.ProductsServiceImplBase {

    @Override
    public void getProductIds(GetProductIdsRequest request, StreamObserver<GetProductIdsResponse> responseObserver)
    {
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);
        System.out.println(ids);


        GetProductIdsResponse.Builder builder= GetProductIdsResponse.newBuilder();

        for(int i=0;i<ids.size();i++)
        {
            builder.addProductIds(ids.get(i));
        }

        GetProductIdsResponse responseText=builder.build();
        responseObserver.onNext(responseText);
        responseObserver.onCompleted();
    }
}
