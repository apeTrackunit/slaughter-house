package com.example.testrestapi.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SlaughterHouse.proto")
public final class TrayServiceGrpc {

  private TrayServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.testrestapi.proto.TrayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetTrayRequest,
      com.example.testrestapi.proto.GetTrayResponse> getGetTrayServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTrayService",
      requestType = com.example.testrestapi.proto.GetTrayRequest.class,
      responseType = com.example.testrestapi.proto.GetTrayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetTrayRequest,
      com.example.testrestapi.proto.GetTrayResponse> getGetTrayServiceMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetTrayRequest, com.example.testrestapi.proto.GetTrayResponse> getGetTrayServiceMethod;
    if ((getGetTrayServiceMethod = TrayServiceGrpc.getGetTrayServiceMethod) == null) {
      synchronized (TrayServiceGrpc.class) {
        if ((getGetTrayServiceMethod = TrayServiceGrpc.getGetTrayServiceMethod) == null) {
          TrayServiceGrpc.getGetTrayServiceMethod = getGetTrayServiceMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.GetTrayRequest, com.example.testrestapi.proto.GetTrayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTrayService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetTrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetTrayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayServiceMethodDescriptorSupplier("getTrayService"))
              .build();
        }
      }
    }
    return getGetTrayServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateTrayRequest,
      com.example.testrestapi.proto.CreateTrayResponse> getCreateTrayServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTrayService",
      requestType = com.example.testrestapi.proto.CreateTrayRequest.class,
      responseType = com.example.testrestapi.proto.CreateTrayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateTrayRequest,
      com.example.testrestapi.proto.CreateTrayResponse> getCreateTrayServiceMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateTrayRequest, com.example.testrestapi.proto.CreateTrayResponse> getCreateTrayServiceMethod;
    if ((getCreateTrayServiceMethod = TrayServiceGrpc.getCreateTrayServiceMethod) == null) {
      synchronized (TrayServiceGrpc.class) {
        if ((getCreateTrayServiceMethod = TrayServiceGrpc.getCreateTrayServiceMethod) == null) {
          TrayServiceGrpc.getCreateTrayServiceMethod = getCreateTrayServiceMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.CreateTrayRequest, com.example.testrestapi.proto.CreateTrayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTrayService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.CreateTrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.CreateTrayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayServiceMethodDescriptorSupplier("createTrayService"))
              .build();
        }
      }
    }
    return getCreateTrayServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrayServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrayServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrayServiceStub>() {
        @java.lang.Override
        public TrayServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrayServiceStub(channel, callOptions);
        }
      };
    return TrayServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrayServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrayServiceBlockingStub>() {
        @java.lang.Override
        public TrayServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrayServiceBlockingStub(channel, callOptions);
        }
      };
    return TrayServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrayServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrayServiceFutureStub>() {
        @java.lang.Override
        public TrayServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrayServiceFutureStub(channel, callOptions);
        }
      };
    return TrayServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TrayServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTrayService(com.example.testrestapi.proto.GetTrayRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetTrayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTrayServiceMethod(), responseObserver);
    }

    /**
     */
    public void createTrayService(com.example.testrestapi.proto.CreateTrayRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateTrayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTrayServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTrayServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.GetTrayRequest,
                com.example.testrestapi.proto.GetTrayResponse>(
                  this, METHODID_GET_TRAY_SERVICE)))
          .addMethod(
            getCreateTrayServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.CreateTrayRequest,
                com.example.testrestapi.proto.CreateTrayResponse>(
                  this, METHODID_CREATE_TRAY_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class TrayServiceStub extends io.grpc.stub.AbstractAsyncStub<TrayServiceStub> {
    private TrayServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrayServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrayServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTrayService(com.example.testrestapi.proto.GetTrayRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetTrayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTrayServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTrayService(com.example.testrestapi.proto.CreateTrayRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateTrayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTrayServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrayServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrayServiceBlockingStub> {
    private TrayServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrayServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrayServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.testrestapi.proto.GetTrayResponse getTrayService(com.example.testrestapi.proto.GetTrayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTrayServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.testrestapi.proto.CreateTrayResponse createTrayService(com.example.testrestapi.proto.CreateTrayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTrayServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrayServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TrayServiceFutureStub> {
    private TrayServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrayServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrayServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.GetTrayResponse> getTrayService(
        com.example.testrestapi.proto.GetTrayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTrayServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.CreateTrayResponse> createTrayService(
        com.example.testrestapi.proto.CreateTrayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTrayServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRAY_SERVICE = 0;
  private static final int METHODID_CREATE_TRAY_SERVICE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrayServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrayServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TRAY_SERVICE:
          serviceImpl.getTrayService((com.example.testrestapi.proto.GetTrayRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetTrayResponse>) responseObserver);
          break;
        case METHODID_CREATE_TRAY_SERVICE:
          serviceImpl.createTrayService((com.example.testrestapi.proto.CreateTrayRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateTrayResponse>) responseObserver);
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

  private static abstract class TrayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.testrestapi.proto.SlaughterHouse.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrayService");
    }
  }

  private static final class TrayServiceFileDescriptorSupplier
      extends TrayServiceBaseDescriptorSupplier {
    TrayServiceFileDescriptorSupplier() {}
  }

  private static final class TrayServiceMethodDescriptorSupplier
      extends TrayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrayServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrayServiceFileDescriptorSupplier())
              .addMethod(getGetTrayServiceMethod())
              .addMethod(getCreateTrayServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
