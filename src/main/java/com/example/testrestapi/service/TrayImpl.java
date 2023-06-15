package com.example.testrestapi.service;

import com.example.testrestapi.proto.*;
import com.example.testrestapi.dbConnection.DBTray;
import com.example.testrestapi.entity.Tray;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class TrayImpl extends TrayServiceGrpc.TrayServiceImplBase {
    @Override
    public void getTrayService(GetTrayRequest request, StreamObserver<GetTrayResponse> responseObserver) {

        try
        {
            Tray tray= DBTray.getTrayById(request.getId());
            GetTrayResponse.Builder builder=GetTrayResponse.newBuilder();
            builder.setMaxWeight(tray.getMaxWeight());
            builder.setDescription(tray.getDescription());

            GetTrayResponse response=builder.build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createTrayService(CreateTrayRequest request, StreamObserver<CreateTrayResponse> responseObserver) {

        try {
            String response=DBTray.createTray(request.getMaxWeight(),
                    request.getDescription(),1);

            CreateTrayResponse.Builder builder=CreateTrayResponse.newBuilder();
            builder.setConfirmation(response);

            CreateTrayResponse responseText=builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
