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
    comments = "Source: device_feature.proto")
public final class DeviceFeatureGrpc {

  private DeviceFeatureGrpc() {}

  public static final String SERVICE_NAME = "GrpcDeviceFeature.DeviceFeature";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getDeviceStateQueryMethod()} instead.
  public static final io.grpc.MethodDescriptor<GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest,
      GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply> METHOD_DEVICE_STATE_QUERY = getDeviceStateQueryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest,
      GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply> getDeviceStateQueryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest,
      GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply> getDeviceStateQueryMethod() {
    return getDeviceStateQueryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest,
      GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply> getDeviceStateQueryMethodHelper() {
    io.grpc.MethodDescriptor<GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest, GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply> getDeviceStateQueryMethod;
    if ((getDeviceStateQueryMethod = DeviceFeatureGrpc.getDeviceStateQueryMethod) == null) {
      synchronized (DeviceFeatureGrpc.class) {
        if ((getDeviceStateQueryMethod = DeviceFeatureGrpc.getDeviceStateQueryMethod) == null) {
          DeviceFeatureGrpc.getDeviceStateQueryMethod = getDeviceStateQueryMethod =
              io.grpc.MethodDescriptor.<GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest, GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GrpcDeviceFeature.DeviceFeature", "DeviceStateQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceFeatureMethodDescriptorSupplier("DeviceStateQuery"))
                  .build();
          }
        }
     }
     return getDeviceStateQueryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceFeatureStub newStub(io.grpc.Channel channel) {
    return new DeviceFeatureStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceFeatureBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeviceFeatureBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceFeatureFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeviceFeatureFutureStub(channel);
  }

  /**
   */
  public static abstract class DeviceFeatureImplBase implements io.grpc.BindableService {

    /**
     */
    public void deviceStateQuery(GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest request,
        io.grpc.stub.StreamObserver<GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply> responseObserver) {
      asyncUnimplementedUnaryCall(getDeviceStateQueryMethodHelper(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeviceStateQueryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest,
                GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply>(
                  this, METHODID_DEVICE_STATE_QUERY)))
          .build();
    }
  }

  /**
   */
  public static final class DeviceFeatureStub extends io.grpc.stub.AbstractStub<DeviceFeatureStub> {
    private DeviceFeatureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceFeatureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DeviceFeatureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceFeatureStub(channel, callOptions);
    }

    /**
     */
    public void deviceStateQuery(GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest request,
        io.grpc.stub.StreamObserver<GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeviceStateQueryMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeviceFeatureBlockingStub extends io.grpc.stub.AbstractStub<DeviceFeatureBlockingStub> {
    private DeviceFeatureBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceFeatureBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DeviceFeatureBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceFeatureBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply deviceStateQuery(GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeviceStateQueryMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeviceFeatureFutureStub extends io.grpc.stub.AbstractStub<DeviceFeatureFutureStub> {
    private DeviceFeatureFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceFeatureFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DeviceFeatureFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceFeatureFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply> deviceStateQuery(
        GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeviceStateQueryMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEVICE_STATE_QUERY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceFeatureImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceFeatureImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEVICE_STATE_QUERY:
          serviceImpl.deviceStateQuery((GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryRequest) request,
              (io.grpc.stub.StreamObserver<GrpcDeviceFeature.DeviceFeatureOuterClass.DeviceStateQueryReply>) responseObserver);
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

  private static abstract class DeviceFeatureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeviceFeatureBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcDeviceFeature.DeviceFeatureOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeviceFeature");
    }
  }

  private static final class DeviceFeatureFileDescriptorSupplier
      extends DeviceFeatureBaseDescriptorSupplier {
    DeviceFeatureFileDescriptorSupplier() {}
  }

  private static final class DeviceFeatureMethodDescriptorSupplier
      extends DeviceFeatureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeviceFeatureMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeviceFeatureGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceFeatureFileDescriptorSupplier())
              .addMethod(getDeviceStateQueryMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
