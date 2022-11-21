package com.example.testrestapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SlaughterHouse.proto")
public final class AnimalTypeServiceGrpc {

  private AnimalTypeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.testrestapi.AnimalTypeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.GetAnimalTypeRequest,
      com.example.testrestapi.GetAnimalTypeResponse> getGetAnimalTypeServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalTypeService",
      requestType = com.example.testrestapi.GetAnimalTypeRequest.class,
      responseType = com.example.testrestapi.GetAnimalTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.GetAnimalTypeRequest,
      com.example.testrestapi.GetAnimalTypeResponse> getGetAnimalTypeServiceMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.GetAnimalTypeRequest, com.example.testrestapi.GetAnimalTypeResponse> getGetAnimalTypeServiceMethod;
    if ((getGetAnimalTypeServiceMethod = AnimalTypeServiceGrpc.getGetAnimalTypeServiceMethod) == null) {
      synchronized (AnimalTypeServiceGrpc.class) {
        if ((getGetAnimalTypeServiceMethod = AnimalTypeServiceGrpc.getGetAnimalTypeServiceMethod) == null) {
          AnimalTypeServiceGrpc.getGetAnimalTypeServiceMethod = getGetAnimalTypeServiceMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.GetAnimalTypeRequest, com.example.testrestapi.GetAnimalTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalTypeService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.GetAnimalTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.GetAnimalTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalTypeServiceMethodDescriptorSupplier("getAnimalTypeService"))
              .build();
        }
      }
    }
    return getGetAnimalTypeServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.CreateAnimalTypeRequest,
      com.example.testrestapi.CreateAnimalTypeResponse> getCreateAnimalTypeServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAnimalTypeService",
      requestType = com.example.testrestapi.CreateAnimalTypeRequest.class,
      responseType = com.example.testrestapi.CreateAnimalTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.CreateAnimalTypeRequest,
      com.example.testrestapi.CreateAnimalTypeResponse> getCreateAnimalTypeServiceMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.CreateAnimalTypeRequest, com.example.testrestapi.CreateAnimalTypeResponse> getCreateAnimalTypeServiceMethod;
    if ((getCreateAnimalTypeServiceMethod = AnimalTypeServiceGrpc.getCreateAnimalTypeServiceMethod) == null) {
      synchronized (AnimalTypeServiceGrpc.class) {
        if ((getCreateAnimalTypeServiceMethod = AnimalTypeServiceGrpc.getCreateAnimalTypeServiceMethod) == null) {
          AnimalTypeServiceGrpc.getCreateAnimalTypeServiceMethod = getCreateAnimalTypeServiceMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.CreateAnimalTypeRequest, com.example.testrestapi.CreateAnimalTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAnimalTypeService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.CreateAnimalTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.CreateAnimalTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalTypeServiceMethodDescriptorSupplier("createAnimalTypeService"))
              .build();
        }
      }
    }
    return getCreateAnimalTypeServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalTypeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalTypeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalTypeServiceStub>() {
        @java.lang.Override
        public AnimalTypeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalTypeServiceStub(channel, callOptions);
        }
      };
    return AnimalTypeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalTypeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalTypeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalTypeServiceBlockingStub>() {
        @java.lang.Override
        public AnimalTypeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalTypeServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalTypeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalTypeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalTypeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalTypeServiceFutureStub>() {
        @java.lang.Override
        public AnimalTypeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalTypeServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalTypeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnimalTypeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAnimalTypeService(com.example.testrestapi.GetAnimalTypeRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.GetAnimalTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalTypeServiceMethod(), responseObserver);
    }

    /**
     */
    public void createAnimalTypeService(com.example.testrestapi.CreateAnimalTypeRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.CreateAnimalTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalTypeServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAnimalTypeServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.GetAnimalTypeRequest,
                com.example.testrestapi.GetAnimalTypeResponse>(
                  this, METHODID_GET_ANIMAL_TYPE_SERVICE)))
          .addMethod(
            getCreateAnimalTypeServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.CreateAnimalTypeRequest,
                com.example.testrestapi.CreateAnimalTypeResponse>(
                  this, METHODID_CREATE_ANIMAL_TYPE_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalTypeServiceStub extends io.grpc.stub.AbstractAsyncStub<AnimalTypeServiceStub> {
    private AnimalTypeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalTypeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalTypeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAnimalTypeService(com.example.testrestapi.GetAnimalTypeRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.GetAnimalTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalTypeServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAnimalTypeService(com.example.testrestapi.CreateAnimalTypeRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.CreateAnimalTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalTypeServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalTypeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalTypeServiceBlockingStub> {
    private AnimalTypeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalTypeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalTypeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.testrestapi.GetAnimalTypeResponse getAnimalTypeService(com.example.testrestapi.GetAnimalTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalTypeServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.testrestapi.CreateAnimalTypeResponse createAnimalTypeService(com.example.testrestapi.CreateAnimalTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalTypeServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalTypeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalTypeServiceFutureStub> {
    private AnimalTypeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalTypeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalTypeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.GetAnimalTypeResponse> getAnimalTypeService(
        com.example.testrestapi.GetAnimalTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalTypeServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.CreateAnimalTypeResponse> createAnimalTypeService(
        com.example.testrestapi.CreateAnimalTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalTypeServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANIMAL_TYPE_SERVICE = 0;
  private static final int METHODID_CREATE_ANIMAL_TYPE_SERVICE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalTypeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalTypeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ANIMAL_TYPE_SERVICE:
          serviceImpl.getAnimalTypeService((com.example.testrestapi.GetAnimalTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.GetAnimalTypeResponse>) responseObserver);
          break;
        case METHODID_CREATE_ANIMAL_TYPE_SERVICE:
          serviceImpl.createAnimalTypeService((com.example.testrestapi.CreateAnimalTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.CreateAnimalTypeResponse>) responseObserver);
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

  private static abstract class AnimalTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalTypeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.testrestapi.SlaughterHouse.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalTypeService");
    }
  }

  private static final class AnimalTypeServiceFileDescriptorSupplier
      extends AnimalTypeServiceBaseDescriptorSupplier {
    AnimalTypeServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalTypeServiceMethodDescriptorSupplier
      extends AnimalTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalTypeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnimalTypeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalTypeServiceFileDescriptorSupplier())
              .addMethod(getGetAnimalTypeServiceMethod())
              .addMethod(getCreateAnimalTypeServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
