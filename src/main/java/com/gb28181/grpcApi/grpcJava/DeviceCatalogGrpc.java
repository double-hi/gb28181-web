package com.gb28181.grpcApi.grpcJava;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: device_catalog.proto")
public final class DeviceCatalogGrpc {

  private DeviceCatalogGrpc() {}

  public static final String SERVICE_NAME = "GrpcDeviceCatalog.DeviceCatalog";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getDeviceCatalogQueryMethod()} instead.
  public static final io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest,
      GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply> METHOD_DEVICE_CATALOG_QUERY = getDeviceCatalogQueryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest,
      GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply> getDeviceCatalogQueryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest,
      GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply> getDeviceCatalogQueryMethod() {
    return getDeviceCatalogQueryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest,
      GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply> getDeviceCatalogQueryMethodHelper() {
    io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest, GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply> getDeviceCatalogQueryMethod;
    if ((getDeviceCatalogQueryMethod = DeviceCatalogGrpc.getDeviceCatalogQueryMethod) == null) {
      synchronized (DeviceCatalogGrpc.class) {
        if ((getDeviceCatalogQueryMethod = DeviceCatalogGrpc.getDeviceCatalogQueryMethod) == null) {
          DeviceCatalogGrpc.getDeviceCatalogQueryMethod = getDeviceCatalogQueryMethod =
              io.grpc.MethodDescriptor.<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest, GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GrpcDeviceCatalog.DeviceCatalog", "DeviceCatalogQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceCatalogMethodDescriptorSupplier("DeviceCatalogQuery"))
                  .build();
          }
        }
     }
     return getDeviceCatalogQueryMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getDeviceCatalogSubscribeMethod()} instead.
  public static final io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest,
      GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply> METHOD_DEVICE_CATALOG_SUBSCRIBE = getDeviceCatalogSubscribeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest,
      GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply> getDeviceCatalogSubscribeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest,
      GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply> getDeviceCatalogSubscribeMethod() {
    return getDeviceCatalogSubscribeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest,
      GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply> getDeviceCatalogSubscribeMethodHelper() {
    io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest, GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply> getDeviceCatalogSubscribeMethod;
    if ((getDeviceCatalogSubscribeMethod = DeviceCatalogGrpc.getDeviceCatalogSubscribeMethod) == null) {
      synchronized (DeviceCatalogGrpc.class) {
        if ((getDeviceCatalogSubscribeMethod = DeviceCatalogGrpc.getDeviceCatalogSubscribeMethod) == null) {
          DeviceCatalogGrpc.getDeviceCatalogSubscribeMethod = getDeviceCatalogSubscribeMethod =
              io.grpc.MethodDescriptor.<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest, GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GrpcDeviceCatalog.DeviceCatalog", "DeviceCatalogSubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceCatalogMethodDescriptorSupplier("DeviceCatalogSubscribe"))
                  .build();
          }
        }
     }
     return getDeviceCatalogSubscribeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getDeviceCatalogNotifyMethod()} instead.
  public static final io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest,
      GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply> METHOD_DEVICE_CATALOG_NOTIFY = getDeviceCatalogNotifyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest,
      GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply> getDeviceCatalogNotifyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest,
      GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply> getDeviceCatalogNotifyMethod() {
    return getDeviceCatalogNotifyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest,
      GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply> getDeviceCatalogNotifyMethodHelper() {
    io.grpc.MethodDescriptor<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest, GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply> getDeviceCatalogNotifyMethod;
    if ((getDeviceCatalogNotifyMethod = DeviceCatalogGrpc.getDeviceCatalogNotifyMethod) == null) {
      synchronized (DeviceCatalogGrpc.class) {
        if ((getDeviceCatalogNotifyMethod = DeviceCatalogGrpc.getDeviceCatalogNotifyMethod) == null) {
          DeviceCatalogGrpc.getDeviceCatalogNotifyMethod = getDeviceCatalogNotifyMethod =
              io.grpc.MethodDescriptor.<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest, GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GrpcDeviceCatalog.DeviceCatalog", "DeviceCatalogNotify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceCatalogMethodDescriptorSupplier("DeviceCatalogNotify"))
                  .build();
          }
        }
     }
     return getDeviceCatalogNotifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceCatalogStub newStub(io.grpc.Channel channel) {
    return new DeviceCatalogStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceCatalogBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeviceCatalogBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceCatalogFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeviceCatalogFutureStub(channel);
  }

  /**
   */
  public static abstract class DeviceCatalogImplBase implements io.grpc.BindableService {

    /**
     */
    public void deviceCatalogQuery(GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest request,
        io.grpc.stub.StreamObserver<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply> responseObserver) {
      asyncUnimplementedUnaryCall(getDeviceCatalogQueryMethodHelper(), responseObserver);
    }

    /**
     */
    public void deviceCatalogSubscribe(GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest request,
        io.grpc.stub.StreamObserver<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply> responseObserver) {
      asyncUnimplementedUnaryCall(getDeviceCatalogSubscribeMethodHelper(), responseObserver);
    }

    /**
     */
    public void deviceCatalogNotify(GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest request,
        io.grpc.stub.StreamObserver<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply> responseObserver) {
      asyncUnimplementedUnaryCall(getDeviceCatalogNotifyMethodHelper(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeviceCatalogQueryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest,
                GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply>(
                  this, METHODID_DEVICE_CATALOG_QUERY)))
          .addMethod(
            getDeviceCatalogSubscribeMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest,
                GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply>(
                  this, METHODID_DEVICE_CATALOG_SUBSCRIBE)))
          .addMethod(
            getDeviceCatalogNotifyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest,
                GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply>(
                  this, METHODID_DEVICE_CATALOG_NOTIFY)))
          .build();
    }
  }

  /**
   */
  public static final class DeviceCatalogStub extends io.grpc.stub.AbstractStub<DeviceCatalogStub> {
    private DeviceCatalogStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceCatalogStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DeviceCatalogStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceCatalogStub(channel, callOptions);
    }

    /**
     */
    public void deviceCatalogQuery(GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest request,
        io.grpc.stub.StreamObserver<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeviceCatalogQueryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deviceCatalogSubscribe(GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest request,
        io.grpc.stub.StreamObserver<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeviceCatalogSubscribeMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deviceCatalogNotify(GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest request,
        io.grpc.stub.StreamObserver<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeviceCatalogNotifyMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeviceCatalogBlockingStub extends io.grpc.stub.AbstractStub<DeviceCatalogBlockingStub> {
    private DeviceCatalogBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceCatalogBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DeviceCatalogBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceCatalogBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply deviceCatalogQuery(GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeviceCatalogQueryMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply deviceCatalogSubscribe(GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeviceCatalogSubscribeMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply deviceCatalogNotify(GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeviceCatalogNotifyMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeviceCatalogFutureStub extends io.grpc.stub.AbstractStub<DeviceCatalogFutureStub> {
    private DeviceCatalogFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceCatalogFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DeviceCatalogFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceCatalogFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply> deviceCatalogQuery(
        GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeviceCatalogQueryMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply> deviceCatalogSubscribe(
        GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeviceCatalogSubscribeMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply> deviceCatalogNotify(
        GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeviceCatalogNotifyMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEVICE_CATALOG_QUERY = 0;
  private static final int METHODID_DEVICE_CATALOG_SUBSCRIBE = 1;
  private static final int METHODID_DEVICE_CATALOG_NOTIFY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceCatalogImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceCatalogImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEVICE_CATALOG_QUERY:
          serviceImpl.deviceCatalogQuery((GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryRequest) request,
              (io.grpc.stub.StreamObserver<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogQueryReply>) responseObserver);
          break;
        case METHODID_DEVICE_CATALOG_SUBSCRIBE:
          serviceImpl.deviceCatalogSubscribe((GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeRequest) request,
              (io.grpc.stub.StreamObserver<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogSubscribeReply>) responseObserver);
          break;
        case METHODID_DEVICE_CATALOG_NOTIFY:
          serviceImpl.deviceCatalogNotify((GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyRequest) request,
              (io.grpc.stub.StreamObserver<GrpcDeviceCatalog.DeviceCatalogOuterClass.DeviceCatalogNotifyReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DeviceCatalogBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeviceCatalogBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcDeviceCatalog.DeviceCatalogOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeviceCatalog");
    }
  }

  private static final class DeviceCatalogFileDescriptorSupplier
      extends DeviceCatalogBaseDescriptorSupplier {
    DeviceCatalogFileDescriptorSupplier() {}
  }

  private static final class DeviceCatalogMethodDescriptorSupplier
      extends DeviceCatalogBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeviceCatalogMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DeviceCatalogGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceCatalogFileDescriptorSupplier())
              .addMethod(getDeviceCatalogQueryMethodHelper())
              .addMethod(getDeviceCatalogSubscribeMethodHelper())
              .addMethod(getDeviceCatalogNotifyMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
