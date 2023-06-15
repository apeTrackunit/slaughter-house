package com.example.testrestapi.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SlaughterHouse.proto")
public final class FarmServiceGrpc {

  private FarmServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.testrestapi.proto.FarmService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetFarmRequest,
      com.example.testrestapi.proto.GetFarmResponse> getGetFarmServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFarmService",
      requestType = com.example.testrestapi.proto.GetFarmRequest.class,
      responseType = com.example.testrestapi.proto.GetFarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetFarmRequest,
      com.example.testrestapi.proto.GetFarmResponse> getGetFarmServiceMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetFarmRequest, com.example.testrestapi.proto.GetFarmResponse> getGetFarmServiceMethod;
    if ((getGetFarmServiceMethod = FarmServiceGrpc.getGetFarmServiceMethod) == null) {
      synchronized (FarmServiceGrpc.class) {
        if ((getGetFarmServiceMethod = FarmServiceGrpc.getGetFarmServiceMethod) == null) {
          FarmServiceGrpc.getGetFarmServiceMethod = getGetFarmServiceMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.GetFarmRequest, com.example.testrestapi.proto.GetFarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFarmService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetFarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetFarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FarmServiceMethodDescriptorSupplier("getFarmService"))
              .build();
        }
      }
    }
    return getGetFarmServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateFarmRequest,
      com.example.testrestapi.proto.CreateFarmResponse> getCreateFarmServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createFarmService",
      requestType = com.example.testrestapi.proto.CreateFarmRequest.class,
      responseType = com.example.testrestapi.proto.CreateFarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateFarmRequest,
      com.example.testrestapi.proto.CreateFarmResponse> getCreateFarmServiceMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateFarmRequest, com.example.testrestapi.proto.CreateFarmResponse> getCreateFarmServiceMethod;
    if ((getCreateFarmServiceMethod = FarmServiceGrpc.getCreateFarmServiceMethod) == null) {
      synchronized (FarmServiceGrpc.class) {
        if ((getCreateFarmServiceMethod = FarmServiceGrpc.getCreateFarmServiceMethod) == null) {
          FarmServiceGrpc.getCreateFarmServiceMethod = getCreateFarmServiceMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.CreateFarmRequest, com.example.testrestapi.proto.CreateFarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createFarmService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.CreateFarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.CreateFarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FarmServiceMethodDescriptorSupplier("createFarmService"))
              .build();
        }
      }
    }
    return getCreateFarmServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FarmServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FarmServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FarmServiceStub>() {
        @java.lang.Override
        public FarmServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FarmServiceStub(channel, callOptions);
        }
      };
    return FarmServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FarmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FarmServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FarmServiceBlockingStub>() {
        @java.lang.Override
        public FarmServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FarmServiceBlockingStub(channel, callOptions);
        }
      };
    return FarmServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FarmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FarmServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FarmServiceFutureStub>() {
        @java.lang.Override
        public FarmServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FarmServiceFutureStub(channel, callOptions);
        }
      };
    return FarmServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FarmServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFarmService(com.example.testrestapi.proto.GetFarmRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetFarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFarmServiceMethod(), responseObserver);
    }

    /**
     */
    public void createFarmService(com.example.testrestapi.proto.CreateFarmRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateFarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFarmServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFarmServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.GetFarmRequest,
                com.example.testrestapi.proto.GetFarmResponse>(
                  this, METHODID_GET_FARM_SERVICE)))
          .addMethod(
            getCreateFarmServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.CreateFarmRequest,
                com.example.testrestapi.proto.CreateFarmResponse>(
                  this, METHODID_CREATE_FARM_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class FarmServiceStub extends io.grpc.stub.AbstractAsyncStub<FarmServiceStub> {
    private FarmServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FarmServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FarmServiceStub(channel, callOptions);
    }

    /**
     */
    public void getFarmService(com.example.testrestapi.proto.GetFarmRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetFarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFarmServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFarmService(com.example.testrestapi.proto.CreateFarmRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateFarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFarmServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FarmServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FarmServiceBlockingStub> {
    private FarmServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FarmServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FarmServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.testrestapi.proto.GetFarmResponse getFarmService(com.example.testrestapi.proto.GetFarmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFarmServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.testrestapi.proto.CreateFarmResponse createFarmService(com.example.testrestapi.proto.CreateFarmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFarmServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FarmServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FarmServiceFutureStub> {
    private FarmServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FarmServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FarmServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.GetFarmResponse> getFarmService(
        com.example.testrestapi.proto.GetFarmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFarmServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.CreateFarmResponse> createFarmService(
        com.example.testrestapi.proto.CreateFarmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFarmServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FARM_SERVICE = 0;
  private static final int METHODID_CREATE_FARM_SERVICE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FarmServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FarmServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FARM_SERVICE:
          serviceImpl.getFarmService((com.example.testrestapi.proto.GetFarmRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetFarmResponse>) responseObserver);
          break;
        case METHODID_CREATE_FARM_SERVICE:
          serviceImpl.createFarmService((com.example.testrestapi.proto.CreateFarmRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateFarmResponse>) responseObserver);
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

  private static abstract class FarmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FarmServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.testrestapi.proto.SlaughterHouse.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FarmService");
    }
  }

  private static final class FarmServiceFileDescriptorSupplier
      extends FarmServiceBaseDescriptorSupplier {
    FarmServiceFileDescriptorSupplier() {}
  }

  private static final class FarmServiceMethodDescriptorSupplier
      extends FarmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FarmServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FarmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FarmServiceFileDescriptorSupplier())
              .addMethod(getGetFarmServiceMethod())
              .addMethod(getCreateFarmServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
