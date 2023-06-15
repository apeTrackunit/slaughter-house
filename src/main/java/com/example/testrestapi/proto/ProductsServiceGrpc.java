package com.example.testrestapi.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SlaughterHouse.proto")
public final class ProductsServiceGrpc {

  private ProductsServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.testrestapi.proto.ProductsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetProductIdsRequest,
      com.example.testrestapi.proto.GetProductIdsResponse> getGetProductIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProductIds",
      requestType = com.example.testrestapi.proto.GetProductIdsRequest.class,
      responseType = com.example.testrestapi.proto.GetProductIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetProductIdsRequest,
      com.example.testrestapi.proto.GetProductIdsResponse> getGetProductIdsMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetProductIdsRequest, com.example.testrestapi.proto.GetProductIdsResponse> getGetProductIdsMethod;
    if ((getGetProductIdsMethod = ProductsServiceGrpc.getGetProductIdsMethod) == null) {
      synchronized (ProductsServiceGrpc.class) {
        if ((getGetProductIdsMethod = ProductsServiceGrpc.getGetProductIdsMethod) == null) {
          ProductsServiceGrpc.getGetProductIdsMethod = getGetProductIdsMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.GetProductIdsRequest, com.example.testrestapi.proto.GetProductIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProductIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetProductIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetProductIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsServiceMethodDescriptorSupplier("getProductIds"))
              .build();
        }
      }
    }
    return getGetProductIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetProductRequest,
      com.example.testrestapi.proto.GetProductResponse> getGetProductServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProductService",
      requestType = com.example.testrestapi.proto.GetProductRequest.class,
      responseType = com.example.testrestapi.proto.GetProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetProductRequest,
      com.example.testrestapi.proto.GetProductResponse> getGetProductServiceMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.GetProductRequest, com.example.testrestapi.proto.GetProductResponse> getGetProductServiceMethod;
    if ((getGetProductServiceMethod = ProductsServiceGrpc.getGetProductServiceMethod) == null) {
      synchronized (ProductsServiceGrpc.class) {
        if ((getGetProductServiceMethod = ProductsServiceGrpc.getGetProductServiceMethod) == null) {
          ProductsServiceGrpc.getGetProductServiceMethod = getGetProductServiceMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.GetProductRequest, com.example.testrestapi.proto.GetProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProductService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.GetProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsServiceMethodDescriptorSupplier("getProductService"))
              .build();
        }
      }
    }
    return getGetProductServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateProductRequest,
      com.example.testrestapi.proto.CreateProductResponse> getCreateProductServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createProductService",
      requestType = com.example.testrestapi.proto.CreateProductRequest.class,
      responseType = com.example.testrestapi.proto.CreateProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateProductRequest,
      com.example.testrestapi.proto.CreateProductResponse> getCreateProductServiceMethod() {
    io.grpc.MethodDescriptor<com.example.testrestapi.proto.CreateProductRequest, com.example.testrestapi.proto.CreateProductResponse> getCreateProductServiceMethod;
    if ((getCreateProductServiceMethod = ProductsServiceGrpc.getCreateProductServiceMethod) == null) {
      synchronized (ProductsServiceGrpc.class) {
        if ((getCreateProductServiceMethod = ProductsServiceGrpc.getCreateProductServiceMethod) == null) {
          ProductsServiceGrpc.getCreateProductServiceMethod = getCreateProductServiceMethod =
              io.grpc.MethodDescriptor.<com.example.testrestapi.proto.CreateProductRequest, com.example.testrestapi.proto.CreateProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createProductService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.CreateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.testrestapi.proto.CreateProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsServiceMethodDescriptorSupplier("createProductService"))
              .build();
        }
      }
    }
    return getCreateProductServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductsServiceStub>() {
        @java.lang.Override
        public ProductsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductsServiceStub(channel, callOptions);
        }
      };
    return ProductsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductsServiceBlockingStub>() {
        @java.lang.Override
        public ProductsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductsServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductsServiceFutureStub>() {
        @java.lang.Override
        public ProductsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductsServiceFutureStub(channel, callOptions);
        }
      };
    return ProductsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProductIds(com.example.testrestapi.proto.GetProductIdsRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetProductIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductIdsMethod(), responseObserver);
    }

    /**
     */
    public void getProductService(com.example.testrestapi.proto.GetProductRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductServiceMethod(), responseObserver);
    }

    /**
     */
    public void createProductService(com.example.testrestapi.proto.CreateProductRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProductServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.GetProductIdsRequest,
                com.example.testrestapi.proto.GetProductIdsResponse>(
                  this, METHODID_GET_PRODUCT_IDS)))
          .addMethod(
            getGetProductServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.GetProductRequest,
                com.example.testrestapi.proto.GetProductResponse>(
                  this, METHODID_GET_PRODUCT_SERVICE)))
          .addMethod(
            getCreateProductServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.testrestapi.proto.CreateProductRequest,
                com.example.testrestapi.proto.CreateProductResponse>(
                  this, METHODID_CREATE_PRODUCT_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class ProductsServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductsServiceStub> {
    private ProductsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProductIds(com.example.testrestapi.proto.GetProductIdsRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetProductIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductService(com.example.testrestapi.proto.GetProductRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProductService(com.example.testrestapi.proto.CreateProductRequest request,
        io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProductServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductsServiceBlockingStub> {
    private ProductsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.testrestapi.proto.GetProductIdsResponse getProductIds(com.example.testrestapi.proto.GetProductIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductIdsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.testrestapi.proto.GetProductResponse getProductService(com.example.testrestapi.proto.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.testrestapi.proto.CreateProductResponse createProductService(com.example.testrestapi.proto.CreateProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProductServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductsServiceFutureStub> {
    private ProductsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.GetProductIdsResponse> getProductIds(
        com.example.testrestapi.proto.GetProductIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductIdsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.GetProductResponse> getProductService(
        com.example.testrestapi.proto.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.testrestapi.proto.CreateProductResponse> createProductService(
        com.example.testrestapi.proto.CreateProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProductServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT_IDS = 0;
  private static final int METHODID_GET_PRODUCT_SERVICE = 1;
  private static final int METHODID_CREATE_PRODUCT_SERVICE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT_IDS:
          serviceImpl.getProductIds((com.example.testrestapi.proto.GetProductIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetProductIdsResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_SERVICE:
          serviceImpl.getProductService((com.example.testrestapi.proto.GetProductRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.GetProductResponse>) responseObserver);
          break;
        case METHODID_CREATE_PRODUCT_SERVICE:
          serviceImpl.createProductService((com.example.testrestapi.proto.CreateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.example.testrestapi.proto.CreateProductResponse>) responseObserver);
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

  private static abstract class ProductsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.testrestapi.proto.SlaughterHouse.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductsService");
    }
  }

  private static final class ProductsServiceFileDescriptorSupplier
      extends ProductsServiceBaseDescriptorSupplier {
    ProductsServiceFileDescriptorSupplier() {}
  }

  private static final class ProductsServiceMethodDescriptorSupplier
      extends ProductsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductsServiceFileDescriptorSupplier())
              .addMethod(getGetProductIdsMethod())
              .addMethod(getGetProductServiceMethod())
              .addMethod(getCreateProductServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
