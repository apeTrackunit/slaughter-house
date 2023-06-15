package com.example.testrestapi.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SlaughterHouse.proto")
public final class AnimalsServiceGrpc {

  private AnimalsServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.testrestapi.proto.AnimalsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetAnimalIdsRequest,
      com.example.testrestapi.proto.GetAnimalIdsResponse> getGetAnimalIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalIds",
      requestType = com.example.testrestapi.proto.GetAnimalIdsRequest.class,
      responseType = com.example.testrestapi.proto.GetAnimalIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetAnimalIdsRequest,
      com.example.testrestapi.proto.GetAnimalIdsResponse> getGetAnimalIdsMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetAnimalIdsRequest, com.example.testrestapi.proto.GetAnimalIdsResponse> getGetAnimalIdsMethod;
    if ((getGetAnimalIdsMethod = AnimalsServiceGrpc.getGetAnimalIdsMethod) == null) {
      synchronized (AnimalsServiceGrpc.class) {
        if ((getGetAnimalIdsMethod = AnimalsServiceGrpc.getGetAnimalIdsMethod) == null) {
          AnimalsServiceGrpc.getGetAnimalIdsMethod = getGetAnimalIdsMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.GetAnimalIdsRequest, com.example.testrestapi.proto.GetAnimalIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetAnimalIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetAnimalIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalsServiceMethodDescriptorSupplier("getAnimalIds"))
              .build();
        }
      }
    }
    return getGetAnimalIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetAnimalRequest,
      com.example.testrestapi.proto.GetAnimalResponse> getGetAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimal",
      requestType = com.example.testrestapi.proto.GetAnimalRequest.class,
      responseType = com.example.testrestapi.proto.GetAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetAnimalRequest,
      com.example.testrestapi.proto.GetAnimalResponse> getGetAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetAnimalRequest, com.example.testrestapi.proto.GetAnimalResponse> getGetAnimalMethod;
    if ((getGetAnimalMethod = AnimalsServiceGrpc.getGetAnimalMethod) == null) {
      synchronized (AnimalsServiceGrpc.class) {
        if ((getGetAnimalMethod = AnimalsServiceGrpc.getGetAnimalMethod) == null) {
          AnimalsServiceGrpc.getGetAnimalMethod = getGetAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.GetAnimalRequest, com.example.testrestapi.proto.GetAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalsServiceMethodDescriptorSupplier("getAnimal"))
              .build();
        }
      }
    }
    return getGetAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateAnimalRequest,
      com.example.testrestapi.proto.CreateAnimalResponse> getCreateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAnimal",
      requestType = com.example.testrestapi.proto.CreateAnimalRequest.class,
      responseType = com.example.testrestapi.proto.CreateAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateAnimalRequest,
      com.example.testrestapi.proto.CreateAnimalResponse> getCreateAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateAnimalRequest, com.example.testrestapi.proto.CreateAnimalResponse> getCreateAnimalMethod;
    if ((getCreateAnimalMethod = AnimalsServiceGrpc.getCreateAnimalMethod) == null) {
      synchronized (AnimalsServiceGrpc.class) {
        if ((getCreateAnimalMethod = AnimalsServiceGrpc.getCreateAnimalMethod) == null) {
          AnimalsServiceGrpc.getCreateAnimalMethod = getCreateAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.CreateAnimalRequest, com.example.testrestapi.proto.CreateAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.CreateAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.CreateAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalsServiceMethodDescriptorSupplier("createAnimal"))
              .build();
        }
      }
    }
    return getCreateAnimalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalsServiceStub>() {
        @java.lang.Override
        public AnimalsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalsServiceStub(channel, callOptions);
        }
      };
    return AnimalsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalsServiceBlockingStub>() {
        @java.lang.Override
        public AnimalsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalsServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalsServiceFutureStub>() {
        @java.lang.Override
        public AnimalsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalsServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnimalsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAnimalIds(com.example.testrestapi.proto.GetAnimalIdsRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetAnimalIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalIdsMethod(), responseObserver);
    }

    /**
     */
    public void getAnimal(com.example.testrestapi.proto.GetAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalMethod(), responseObserver);
    }

    /**
     */
    public void createAnimal(com.example.testrestapi.proto.CreateAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAnimalIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.GetAnimalIdsRequest,
                com.example.testrestapi.proto.GetAnimalIdsResponse>(
                  this, METHODID_GET_ANIMAL_IDS)))
          .addMethod(
            getGetAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.GetAnimalRequest,
                com.example.testrestapi.proto.GetAnimalResponse>(
                  this, METHODID_GET_ANIMAL)))
          .addMethod(
            getCreateAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.CreateAnimalRequest,
                com.example.testrestapi.proto.CreateAnimalResponse>(
                  this, METHODID_CREATE_ANIMAL)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalsServiceStub extends io.grpc.stub.AbstractAsyncStub<AnimalsServiceStub> {
    private AnimalsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAnimalIds(com.example.testrestapi.proto.GetAnimalIdsRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetAnimalIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimal(com.example.testrestapi.proto.GetAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAnimal(com.example.testrestapi.proto.CreateAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalsServiceBlockingStub> {
    private AnimalsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.testrestapi.proto.GetAnimalIdsResponse getAnimalIds(com.example.testrestapi.proto.GetAnimalIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalIdsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.testrestapi.proto.GetAnimalResponse getAnimal(com.example.testrestapi.proto.GetAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.testrestapi.proto.CreateAnimalResponse createAnimal(com.example.testrestapi.proto.CreateAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalsServiceFutureStub> {
    private AnimalsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.GetAnimalIdsResponse> getAnimalIds(
        com.example.testrestapi.proto.GetAnimalIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalIdsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.GetAnimalResponse> getAnimal(
        com.example.testrestapi.proto.GetAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.CreateAnimalResponse> createAnimal(
        com.example.testrestapi.proto.CreateAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANIMAL_IDS = 0;
  private static final int METHODID_GET_ANIMAL = 1;
  private static final int METHODID_CREATE_ANIMAL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ANIMAL_IDS:
          serviceImpl.getAnimalIds((com.example.testrestapi.proto.GetAnimalIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetAnimalIdsResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMAL:
          serviceImpl.getAnimal((com.example.testrestapi.proto.GetAnimalRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetAnimalResponse>) responseObserver);
          break;
        case METHODID_CREATE_ANIMAL:
          serviceImpl.createAnimal((com.example.testrestapi.proto.CreateAnimalRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateAnimalResponse>) responseObserver);
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

  private static abstract class AnimalsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.testrestapi.proto.SlaughterHouse.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalsService");
    }
  }

  private static final class AnimalsServiceFileDescriptorSupplier
      extends AnimalsServiceBaseDescriptorSupplier {
    AnimalsServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalsServiceMethodDescriptorSupplier
      extends AnimalsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnimalsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalsServiceFileDescriptorSupplier())
              .addMethod(getGetAnimalIdsMethod())
              .addMethod(getGetAnimalMethod())
              .addMethod(getCreateAnimalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
