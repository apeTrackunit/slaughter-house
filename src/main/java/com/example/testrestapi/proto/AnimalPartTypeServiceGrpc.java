package com.example.testrestapi.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SlaughterHouse.proto")
public final class AnimalPartTypeServiceGrpc {

  private AnimalPartTypeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.testrestapi.proto.AnimalPartTypeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetAnimalPartTypeRequest,
      com.example.testrestapi.proto.GetAnimalPartTypeResponse> getGetAnimalPartTypeServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalPartTypeService",
      requestType = com.example.testrestapi.proto.GetAnimalPartTypeRequest.class,
      responseType = com.example.testrestapi.proto.GetAnimalPartTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetAnimalPartTypeRequest,
      com.example.testrestapi.proto.GetAnimalPartTypeResponse> getGetAnimalPartTypeServiceMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetAnimalPartTypeRequest, com.example.testrestapi.proto.GetAnimalPartTypeResponse> getGetAnimalPartTypeServiceMethod;
    if ((getGetAnimalPartTypeServiceMethod = AnimalPartTypeServiceGrpc.getGetAnimalPartTypeServiceMethod) == null) {
      synchronized (AnimalPartTypeServiceGrpc.class) {
        if ((getGetAnimalPartTypeServiceMethod = AnimalPartTypeServiceGrpc.getGetAnimalPartTypeServiceMethod) == null) {
          AnimalPartTypeServiceGrpc.getGetAnimalPartTypeServiceMethod = getGetAnimalPartTypeServiceMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.GetAnimalPartTypeRequest, com.example.testrestapi.proto.GetAnimalPartTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalPartTypeService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetAnimalPartTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetAnimalPartTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartTypeServiceMethodDescriptorSupplier("getAnimalPartTypeService"))
              .build();
        }
      }
    }
    return getGetAnimalPartTypeServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateAnimalPartTypeRequest,
      com.example.testrestapi.proto.CreateAnimalPartTypeResponse> getCreateAnimalPartTypeServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAnimalPartTypeService",
      requestType = com.example.testrestapi.proto.CreateAnimalPartTypeRequest.class,
      responseType = com.example.testrestapi.proto.CreateAnimalPartTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateAnimalPartTypeRequest,
      com.example.testrestapi.proto.CreateAnimalPartTypeResponse> getCreateAnimalPartTypeServiceMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateAnimalPartTypeRequest, com.example.testrestapi.proto.CreateAnimalPartTypeResponse> getCreateAnimalPartTypeServiceMethod;
    if ((getCreateAnimalPartTypeServiceMethod = AnimalPartTypeServiceGrpc.getCreateAnimalPartTypeServiceMethod) == null) {
      synchronized (AnimalPartTypeServiceGrpc.class) {
        if ((getCreateAnimalPartTypeServiceMethod = AnimalPartTypeServiceGrpc.getCreateAnimalPartTypeServiceMethod) == null) {
          AnimalPartTypeServiceGrpc.getCreateAnimalPartTypeServiceMethod = getCreateAnimalPartTypeServiceMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.CreateAnimalPartTypeRequest, com.example.testrestapi.proto.CreateAnimalPartTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAnimalPartTypeService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.CreateAnimalPartTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.CreateAnimalPartTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartTypeServiceMethodDescriptorSupplier("createAnimalPartTypeService"))
              .build();
        }
      }
    }
    return getCreateAnimalPartTypeServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalPartTypeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartTypeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartTypeServiceStub>() {
        @java.lang.Override
        public AnimalPartTypeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartTypeServiceStub(channel, callOptions);
        }
      };
    return AnimalPartTypeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalPartTypeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartTypeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartTypeServiceBlockingStub>() {
        @java.lang.Override
        public AnimalPartTypeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartTypeServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalPartTypeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalPartTypeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartTypeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartTypeServiceFutureStub>() {
        @java.lang.Override
        public AnimalPartTypeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartTypeServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalPartTypeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnimalPartTypeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAnimalPartTypeService(com.example.testrestapi.proto.GetAnimalPartTypeRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetAnimalPartTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalPartTypeServiceMethod(), responseObserver);
    }

    /**
     */
    public void createAnimalPartTypeService(com.example.testrestapi.proto.CreateAnimalPartTypeRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateAnimalPartTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalPartTypeServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAnimalPartTypeServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.GetAnimalPartTypeRequest,
                com.example.testrestapi.proto.GetAnimalPartTypeResponse>(
                  this, METHODID_GET_ANIMAL_PART_TYPE_SERVICE)))
          .addMethod(
            getCreateAnimalPartTypeServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.CreateAnimalPartTypeRequest,
                com.example.testrestapi.proto.CreateAnimalPartTypeResponse>(
                  this, METHODID_CREATE_ANIMAL_PART_TYPE_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalPartTypeServiceStub extends io.grpc.stub.AbstractAsyncStub<AnimalPartTypeServiceStub> {
    private AnimalPartTypeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartTypeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartTypeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAnimalPartTypeService(com.example.testrestapi.proto.GetAnimalPartTypeRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetAnimalPartTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalPartTypeServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAnimalPartTypeService(com.example.testrestapi.proto.CreateAnimalPartTypeRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateAnimalPartTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalPartTypeServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalPartTypeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalPartTypeServiceBlockingStub> {
    private AnimalPartTypeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartTypeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartTypeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.testrestapi.proto.GetAnimalPartTypeResponse getAnimalPartTypeService(com.example.testrestapi.proto.GetAnimalPartTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalPartTypeServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.testrestapi.proto.CreateAnimalPartTypeResponse createAnimalPartTypeService(com.example.testrestapi.proto.CreateAnimalPartTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalPartTypeServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalPartTypeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalPartTypeServiceFutureStub> {
    private AnimalPartTypeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartTypeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartTypeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.GetAnimalPartTypeResponse> getAnimalPartTypeService(
        com.example.testrestapi.proto.GetAnimalPartTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalPartTypeServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.CreateAnimalPartTypeResponse> createAnimalPartTypeService(
        com.example.testrestapi.proto.CreateAnimalPartTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalPartTypeServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANIMAL_PART_TYPE_SERVICE = 0;
  private static final int METHODID_CREATE_ANIMAL_PART_TYPE_SERVICE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalPartTypeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalPartTypeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ANIMAL_PART_TYPE_SERVICE:
          serviceImpl.getAnimalPartTypeService((com.example.testrestapi.proto.GetAnimalPartTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetAnimalPartTypeResponse>) responseObserver);
          break;
        case METHODID_CREATE_ANIMAL_PART_TYPE_SERVICE:
          serviceImpl.createAnimalPartTypeService((com.example.testrestapi.proto.CreateAnimalPartTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateAnimalPartTypeResponse>) responseObserver);
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

  private static abstract class AnimalPartTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalPartTypeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.testrestapi.proto.SlaughterHouse.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalPartTypeService");
    }
  }

  private static final class AnimalPartTypeServiceFileDescriptorSupplier
      extends AnimalPartTypeServiceBaseDescriptorSupplier {
    AnimalPartTypeServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalPartTypeServiceMethodDescriptorSupplier
      extends AnimalPartTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalPartTypeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnimalPartTypeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalPartTypeServiceFileDescriptorSupplier())
              .addMethod(getGetAnimalPartTypeServiceMethod())
              .addMethod(getCreateAnimalPartTypeServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
