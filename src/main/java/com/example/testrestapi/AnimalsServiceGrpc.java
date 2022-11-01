package com.example.testrestapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SlaughterHouse.proto")
public final class AnimalsServiceGrpc {

  private AnimalsServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.testrestapi.AnimalsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.GetAnimalIdsRequest,
      com.example.testrestapi.GetAnimalIdsResponse> getGetAnimalIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalIds",
      requestType = com.example.testrestapi.GetAnimalIdsRequest.class,
      responseType = com.example.testrestapi.GetAnimalIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.GetAnimalIdsRequest,
      com.example.testrestapi.GetAnimalIdsResponse> getGetAnimalIdsMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.GetAnimalIdsRequest, com.example.testrestapi.GetAnimalIdsResponse> getGetAnimalIdsMethod;
    if ((getGetAnimalIdsMethod = AnimalsServiceGrpc.getGetAnimalIdsMethod) == null) {
      synchronized (AnimalsServiceGrpc.class) {
        if ((getGetAnimalIdsMethod = AnimalsServiceGrpc.getGetAnimalIdsMethod) == null) {
          AnimalsServiceGrpc.getGetAnimalIdsMethod = getGetAnimalIdsMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.GetAnimalIdsRequest, com.example.testrestapi.GetAnimalIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.GetAnimalIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.GetAnimalIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalsServiceMethodDescriptorSupplier("getAnimalIds"))
              .build();
        }
      }
    }
    return getGetAnimalIdsMethod;
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
    public void getAnimalIds(com.example.testrestapi.GetAnimalIdsRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.GetAnimalIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalIdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAnimalIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.GetAnimalIdsRequest,
                com.example.testrestapi.GetAnimalIdsResponse>(
                  this, METHODID_GET_ANIMAL_IDS)))
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
    public void getAnimalIds(com.example.testrestapi.GetAnimalIdsRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.GetAnimalIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalIdsMethod(), getCallOptions()), request, responseObserver);
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
    public com.example.testrestapi.GetAnimalIdsResponse getAnimalIds(com.example.testrestapi.GetAnimalIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalIdsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.GetAnimalIdsResponse> getAnimalIds(
        com.example.testrestapi.GetAnimalIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalIdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANIMAL_IDS = 0;

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
          serviceImpl.getAnimalIds((com.example.testrestapi.GetAnimalIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.GetAnimalIdsResponse>) responseObserver);
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
      return com.example.testrestapi.SlaughterHouse.getDescriptor();
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
              .build();
        }
      }
    }
    return result;
  }
}
