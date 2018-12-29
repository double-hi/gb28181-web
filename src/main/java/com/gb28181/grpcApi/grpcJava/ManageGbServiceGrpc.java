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
    comments = "Source: gb28181_config.proto")
public final class ManageGbServiceGrpc {

  private ManageGbServiceGrpc() {}

  public static final String SERVICE_NAME = "manage.ManageGbService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getGetGb28181ServiceConfigMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.Gb28181Config.QueryGb28181ConfigRequest,
      manage.Gb28181Config.QueryGb28181ConfigReply> METHOD_GET_GB28181SERVICE_CONFIG = getGetGb28181ServiceConfigMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.Gb28181Config.QueryGb28181ConfigRequest,
      manage.Gb28181Config.QueryGb28181ConfigReply> getGetGb28181ServiceConfigMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.Gb28181Config.QueryGb28181ConfigRequest,
      manage.Gb28181Config.QueryGb28181ConfigReply> getGetGb28181ServiceConfigMethod() {
    return getGetGb28181ServiceConfigMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.Gb28181Config.QueryGb28181ConfigRequest,
      manage.Gb28181Config.QueryGb28181ConfigReply> getGetGb28181ServiceConfigMethodHelper() {
    io.grpc.MethodDescriptor<manage.Gb28181Config.QueryGb28181ConfigRequest, manage.Gb28181Config.QueryGb28181ConfigReply> getGetGb28181ServiceConfigMethod;
    if ((getGetGb28181ServiceConfigMethod = ManageGbServiceGrpc.getGetGb28181ServiceConfigMethod) == null) {
      synchronized (ManageGbServiceGrpc.class) {
        if ((getGetGb28181ServiceConfigMethod = ManageGbServiceGrpc.getGetGb28181ServiceConfigMethod) == null) {
          ManageGbServiceGrpc.getGetGb28181ServiceConfigMethod = getGetGb28181ServiceConfigMethod =
              io.grpc.MethodDescriptor.<manage.Gb28181Config.QueryGb28181ConfigRequest, manage.Gb28181Config.QueryGb28181ConfigReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.ManageGbService", "GetGb28181ServiceConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.Gb28181Config.QueryGb28181ConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.Gb28181Config.QueryGb28181ConfigReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageGbServiceMethodDescriptorSupplier("GetGb28181ServiceConfig"))
                  .build();
          }
        }
     }
     return getGetGb28181ServiceConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManageGbServiceStub newStub(io.grpc.Channel channel) {
    return new ManageGbServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManageGbServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ManageGbServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManageGbServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ManageGbServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ManageGbServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getGb28181ServiceConfig(manage.Gb28181Config.QueryGb28181ConfigRequest request,
        io.grpc.stub.StreamObserver<manage.Gb28181Config.QueryGb28181ConfigReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGb28181ServiceConfigMethodHelper(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGb28181ServiceConfigMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.Gb28181Config.QueryGb28181ConfigRequest,
                manage.Gb28181Config.QueryGb28181ConfigReply>(
                  this, METHODID_GET_GB28181SERVICE_CONFIG)))
          .build();
    }
  }

  /**
   */
  public static final class ManageGbServiceStub extends io.grpc.stub.AbstractStub<ManageGbServiceStub> {
    private ManageGbServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManageGbServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ManageGbServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManageGbServiceStub(channel, callOptions);
    }

    /**
     */
    public void getGb28181ServiceConfig(manage.Gb28181Config.QueryGb28181ConfigRequest request,
        io.grpc.stub.StreamObserver<manage.Gb28181Config.QueryGb28181ConfigReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGb28181ServiceConfigMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ManageGbServiceBlockingStub extends io.grpc.stub.AbstractStub<ManageGbServiceBlockingStub> {
    private ManageGbServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManageGbServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ManageGbServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManageGbServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public manage.Gb28181Config.QueryGb28181ConfigReply getGb28181ServiceConfig(manage.Gb28181Config.QueryGb28181ConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGb28181ServiceConfigMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ManageGbServiceFutureStub extends io.grpc.stub.AbstractStub<ManageGbServiceFutureStub> {
    private ManageGbServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManageGbServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ManageGbServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManageGbServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.Gb28181Config.QueryGb28181ConfigReply> getGb28181ServiceConfig(
        manage.Gb28181Config.QueryGb28181ConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGb28181ServiceConfigMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GB28181SERVICE_CONFIG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ManageGbServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ManageGbServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GB28181SERVICE_CONFIG:
          serviceImpl.getGb28181ServiceConfig((manage.Gb28181Config.QueryGb28181ConfigRequest) request,
              (io.grpc.stub.StreamObserver<manage.Gb28181Config.QueryGb28181ConfigReply>) responseObserver);
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

  private static abstract class ManageGbServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManageGbServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return manage.Gb28181Config.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ManageGbService");
    }
  }

  private static final class ManageGbServiceFileDescriptorSupplier
      extends ManageGbServiceBaseDescriptorSupplier {
    ManageGbServiceFileDescriptorSupplier() {}
  }

  private static final class ManageGbServiceMethodDescriptorSupplier
      extends ManageGbServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ManageGbServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ManageGbServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManageGbServiceFileDescriptorSupplier())
              .addMethod(getGetGb28181ServiceConfigMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
