package com.example.testrestapi.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SlaughterHouse.proto")
public final class AnimalPartsServiceGrpc {

  private AnimalPartsServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.testrestapi.proto.AnimalPartsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetAnimalPartRequest,
      com.example.testrestapi.proto.GetAnimalPartResponse> getGetAnimalPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalPart",
      requestType = com.example.testrestapi.proto.GetAnimalPartRequest.class,
      responseType = com.example.testrestapi.proto.GetAnimalPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetAnimalPartRequest,
      com.example.testrestapi.proto.GetAnimalPartResponse> getGetAnimalPartMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetAnimalPartRequest, com.example.testrestapi.proto.GetAnimalPartResponse> getGetAnimalPartMethod;
    if ((getGetAnimalPartMethod = AnimalPartsServiceGrpc.getGetAnimalPartMethod) == null) {
      synchronized (AnimalPartsServiceGrpc.class) {
        if ((getGetAnimalPartMethod = AnimalPartsServiceGrpc.getGetAnimalPartMethod) == null) {
          AnimalPartsServiceGrpc.getGetAnimalPartMethod = getGetAnimalPartMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.GetAnimalPartRequest, com.example.testrestapi.proto.GetAnimalPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetAnimalPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetAnimalPartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartsServiceMethodDescriptorSupplier("getAnimalPart"))
              .build();
        }
      }
    }
    return getGetAnimalPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateAnimalPartRequest,
      com.example.testrestapi.proto.CreateAnimalPartResponse> getCreateAnimalPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAnimalPart",
      requestType = com.example.testrestapi.proto.CreateAnimalPartRequest.class,
      responseType = com.example.testrestapi.proto.CreateAnimalPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateAnimalPartRequest,
      com.example.testrestapi.proto.CreateAnimalPartResponse> getCreateAnimalPartMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateAnimalPartRequest, com.example.testrestapi.proto.CreateAnimalPartResponse> getCreateAnimalPartMethod;
    if ((getCreateAnimalPartMethod = AnimalPartsServiceGrpc.getCreateAnimalPartMethod) == null) {
      synchronized (AnimalPartsServiceGrpc.class) {
        if ((getCreateAnimalPartMethod = AnimalPartsServiceGrpc.getCreateAnimalPartMethod) == null) {
          AnimalPartsServiceGrpc.getCreateAnimalPartMethod = getCreateAnimalPartMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.CreateAnimalPartRequest, com.example.testrestapi.proto.CreateAnimalPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAnimalPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.CreateAnimalPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.CreateAnimalPartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartsServiceMethodDescriptorSupplier("createAnimalPart"))
              .build();
        }
      }
    }
    return getCreateAnimalPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.UpdateAnimalPartProductIdRequest,
      com.example.testrestapi.proto.UpdateAnimalPartProductIdResponse> getUpdateAnimalPartProductIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateAnimalPartProductId",
      requestType = com.example.testrestapi.proto.UpdateAnimalPartProductIdRequest.class,
      responseType = com.example.testrestapi.proto.UpdateAnimalPartProductIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.UpdateAnimalPartProductIdRequest,
      com.example.testrestapi.proto.UpdateAnimalPartProductIdResponse> getUpdateAnimalPartProductIdMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.UpdateAnimalPartProductIdRequest, com.example.testrestapi.proto.UpdateAnimalPartProductIdResponse> getUpdateAnimalPartProductIdMethod;
    if ((getUpdateAnimalPartProductIdMethod = AnimalPartsServiceGrpc.getUpdateAnimalPartProductIdMethod) == null) {
      synchronized (AnimalPartsServiceGrpc.class) {
        if ((getUpdateAnimalPartProductIdMethod = AnimalPartsServiceGrpc.getUpdateAnimalPartProductIdMethod) == null) {
          AnimalPartsServiceGrpc.getUpdateAnimalPartProductIdMethod = getUpdateAnimalPartProductIdMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.UpdateAnimalPartProductIdRequest, com.example.testrestapi.proto.UpdateAnimalPartProductIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateAnimalPartProductId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.UpdateAnimalPartProductIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.UpdateAnimalPartProductIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartsServiceMethodDescriptorSupplier("updateAnimalPartProductId"))
              .build();
        }
      }
    }
    return getUpdateAnimalPartProductIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalPartsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartsServiceStub>() {
        @java.lang.Override
        public AnimalPartsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartsServiceStub(channel, callOptions);
        }
      };
    return AnimalPartsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalPartsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartsServiceBlockingStub>() {
        @java.lang.Override
        public AnimalPartsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartsServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalPartsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalPartsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartsServiceFutureStub>() {
        @java.lang.Override
        public AnimalPartsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartsServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalPartsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnimalPartsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAnimalPart(com.example.testrestapi.proto.GetAnimalPartRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetAnimalPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalPartMethod(), responseObserver);
    }

    /**
     */
    public void createAnimalPart(com.example.testrestapi.proto.CreateAnimalPartRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateAnimalPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalPartMethod(), responseObserver);
    }

    /**
     */
    public void updateAnimalPartProductId(com.example.testrestapi.proto.UpdateAnimalPartProductIdRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.UpdateAnimalPartProductIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAnimalPartProductIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAnimalPartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.GetAnimalPartRequest,
                com.example.testrestapi.proto.GetAnimalPartResponse>(
                  this, METHODID_GET_ANIMAL_PART)))
          .addMethod(
            getCreateAnimalPartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.CreateAnimalPartRequest,
                com.example.testrestapi.proto.CreateAnimalPartResponse>(
                  this, METHODID_CREATE_ANIMAL_PART)))
          .addMethod(
            getUpdateAnimalPartProductIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.UpdateAnimalPartProductIdRequest,
                com.example.testrestapi.proto.UpdateAnimalPartProductIdResponse>(
                  this, METHODID_UPDATE_ANIMAL_PART_PRODUCT_ID)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalPartsServiceStub extends io.grpc.stub.AbstractAsyncStub<AnimalPartsServiceStub> {
    private AnimalPartsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAnimalPart(com.example.testrestapi.proto.GetAnimalPartRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetAnimalPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAnimalPart(com.example.testrestapi.proto.CreateAnimalPartRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateAnimalPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAnimalPartProductId(com.example.testrestapi.proto.UpdateAnimalPartProductIdRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.UpdateAnimalPartProductIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAnimalPartProductIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalPartsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalPartsServiceBlockingStub> {
    private AnimalPartsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.testrestapi.proto.GetAnimalPartResponse getAnimalPart(com.example.testrestapi.proto.GetAnimalPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalPartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.testrestapi.proto.CreateAnimalPartResponse createAnimalPart(com.example.testrestapi.proto.CreateAnimalPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalPartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.testrestapi.proto.UpdateAnimalPartProductIdResponse updateAnimalPartProductId(com.example.testrestapi.proto.UpdateAnimalPartProductIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAnimalPartProductIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalPartsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalPartsServiceFutureStub> {
    private AnimalPartsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.GetAnimalPartResponse> getAnimalPart(
        com.example.testrestapi.proto.GetAnimalPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalPartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.CreateAnimalPartResponse> createAnimalPart(
        com.example.testrestapi.proto.CreateAnimalPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalPartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.UpdateAnimalPartProductIdResponse> updateAnimalPartProductId(
        com.example.testrestapi.proto.UpdateAnimalPartProductIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAnimalPartProductIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANIMAL_PART = 0;
  private static final int METHODID_CREATE_ANIMAL_PART = 1;
  private static final int METHODID_UPDATE_ANIMAL_PART_PRODUCT_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalPartsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalPartsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ANIMAL_PART:
          serviceImpl.getAnimalPart((com.example.testrestapi.proto.GetAnimalPartRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetAnimalPartResponse>) responseObserver);
          break;
        case METHODID_CREATE_ANIMAL_PART:
          serviceImpl.createAnimalPart((com.example.testrestapi.proto.CreateAnimalPartRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateAnimalPartResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ANIMAL_PART_PRODUCT_ID:
          serviceImpl.updateAnimalPartProductId((com.example.testrestapi.proto.UpdateAnimalPartProductIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.UpdateAnimalPartProductIdResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AnimalPartsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalPartsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.testrestapi.proto.SlaughterHouse.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalPartsService");
    }
  }

  private static final class AnimalPartsServiceFileDescriptorSupplier
      extends AnimalPartsServiceBaseDescriptorSupplier {
    AnimalPartsServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalPartsServiceMethodDescriptorSupplier
      extends AnimalPartsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalPartsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AnimalPartsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalPartsServiceFileDescriptorSupplier())
              .addMethod(getGetAnimalPartMethod())
              .addMethod(getCreateAnimalPartMethod())
              .addMethod(getUpdateAnimalPartProductIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
