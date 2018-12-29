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
    comments = "Source: ptz_control.proto")
public final class PtzControlGrpc {

  private PtzControlGrpc() {}

  public static final String SERVICE_NAME = "GrpcPtzControl.PtzControl";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getPtzDirectMethod()} instead.
  public static final io.grpc.MethodDescriptor<GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest,
      GrpcPtzControl.PtzControlOuterClass.PtzDirectReply> METHOD_PTZ_DIRECT = getPtzDirectMethodHelper();

  private static volatile io.grpc.MethodDescriptor<GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest,
      GrpcPtzControl.PtzControlOuterClass.PtzDirectReply> getPtzDirectMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest,
      GrpcPtzControl.PtzControlOuterClass.PtzDirectReply> getPtzDirectMethod() {
    return getPtzDirectMethodHelper();
  }

  private static io.grpc.MethodDescriptor<GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest,
      GrpcPtzControl.PtzControlOuterClass.PtzDirectReply> getPtzDirectMethodHelper() {
    io.grpc.MethodDescriptor<GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest, GrpcPtzControl.PtzControlOuterClass.PtzDirectReply> getPtzDirectMethod;
    if ((getPtzDirectMethod = PtzControlGrpc.getPtzDirectMethod) == null) {
      synchronized (PtzControlGrpc.class) {
        if ((getPtzDirectMethod = PtzControlGrpc.getPtzDirectMethod) == null) {
          PtzControlGrpc.getPtzDirectMethod = getPtzDirectMethod =
              io.grpc.MethodDescriptor.<GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest, GrpcPtzControl.PtzControlOuterClass.PtzDirectReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GrpcPtzControl.PtzControl", "PtzDirect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcPtzControl.PtzControlOuterClass.PtzDirectReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PtzControlMethodDescriptorSupplier("PtzDirect"))
                  .build();
          }
        }
     }
     return getPtzDirectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PtzControlStub newStub(io.grpc.Channel channel) {
    return new PtzControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PtzControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PtzControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PtzControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PtzControlFutureStub(channel);
  }

  /**
   */
  public static abstract class PtzControlImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void ptzDirect(GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest request,
        io.grpc.stub.StreamObserver<GrpcPtzControl.PtzControlOuterClass.PtzDirectReply> responseObserver) {
      asyncUnimplementedUnaryCall(getPtzDirectMethodHelper(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPtzDirectMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest,
                GrpcPtzControl.PtzControlOuterClass.PtzDirectReply>(
                  this, METHODID_PTZ_DIRECT)))
          .build();
    }
  }

  /**
   */
  public static final class PtzControlStub extends io.grpc.stub.AbstractStub<PtzControlStub> {
    private PtzControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PtzControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PtzControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PtzControlStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void ptzDirect(GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest request,
        io.grpc.stub.StreamObserver<GrpcPtzControl.PtzControlOuterClass.PtzDirectReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPtzDirectMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PtzControlBlockingStub extends io.grpc.stub.AbstractStub<PtzControlBlockingStub> {
    private PtzControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PtzControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PtzControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PtzControlBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public GrpcPtzControl.PtzControlOuterClass.PtzDirectReply ptzDirect(GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest request) {
      return blockingUnaryCall(
          getChannel(), getPtzDirectMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PtzControlFutureStub extends io.grpc.stub.AbstractStub<PtzControlFutureStub> {
    private PtzControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PtzControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PtzControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PtzControlFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcPtzControl.PtzControlOuterClass.PtzDirectReply> ptzDirect(
        GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPtzDirectMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PTZ_DIRECT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PtzControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PtzControlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PTZ_DIRECT:
          serviceImpl.ptzDirect((GrpcPtzControl.PtzControlOuterClass.PtzDirectRequest) request,
              (io.grpc.stub.StreamObserver<GrpcPtzControl.PtzControlOuterClass.PtzDirectReply>) responseObserver);
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

  private static abstract class PtzControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PtzControlBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcPtzControl.PtzControlOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PtzControl");
    }
  }

  private static final class PtzControlFileDescriptorSupplier
      extends PtzControlBaseDescriptorSupplier {
    PtzControlFileDescriptorSupplier() {}
  }

  private static final class PtzControlMethodDescriptorSupplier
      extends PtzControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PtzControlMethodDescriptorSupplier(String methodName) {
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
      synchronized (PtzControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PtzControlFileDescriptorSupplier())
              .addMethod(getPtzDirectMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
