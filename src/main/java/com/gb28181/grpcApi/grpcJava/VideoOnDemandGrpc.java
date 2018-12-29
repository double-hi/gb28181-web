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
    comments = "Source: video_on_demand.proto")
public final class VideoOnDemandGrpc {

  private VideoOnDemandGrpc() {}

  public static final String SERVICE_NAME = "GrpcVideoOnDemand.VideoOnDemand";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getRecordFileQueryMethod()} instead.
  public static final io.grpc.MethodDescriptor<GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest,
      GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply> METHOD_RECORD_FILE_QUERY = getRecordFileQueryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest,
      GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply> getRecordFileQueryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest,
      GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply> getRecordFileQueryMethod() {
    return getRecordFileQueryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest,
      GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply> getRecordFileQueryMethodHelper() {
    io.grpc.MethodDescriptor<GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest, GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply> getRecordFileQueryMethod;
    if ((getRecordFileQueryMethod = VideoOnDemandGrpc.getRecordFileQueryMethod) == null) {
      synchronized (VideoOnDemandGrpc.class) {
        if ((getRecordFileQueryMethod = VideoOnDemandGrpc.getRecordFileQueryMethod) == null) {
          VideoOnDemandGrpc.getRecordFileQueryMethod = getRecordFileQueryMethod =
              io.grpc.MethodDescriptor.<GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest, GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GrpcVideoOnDemand.VideoOnDemand", "RecordFileQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoOnDemandMethodDescriptorSupplier("RecordFileQuery"))
                  .build();
          }
        }
     }
     return getRecordFileQueryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoOnDemandStub newStub(io.grpc.Channel channel) {
    return new VideoOnDemandStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoOnDemandBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VideoOnDemandBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoOnDemandFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VideoOnDemandFutureStub(channel);
  }

  /**
   */
  public static abstract class VideoOnDemandImplBase implements io.grpc.BindableService {

    /**
     */
    public void recordFileQuery(GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest request,
        io.grpc.stub.StreamObserver<GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRecordFileQueryMethodHelper(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecordFileQueryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest,
                GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply>(
                  this, METHODID_RECORD_FILE_QUERY)))
          .build();
    }
  }

  /**
   */
  public static final class VideoOnDemandStub extends io.grpc.stub.AbstractStub<VideoOnDemandStub> {
    private VideoOnDemandStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoOnDemandStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VideoOnDemandStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoOnDemandStub(channel, callOptions);
    }

    /**
     */
    public void recordFileQuery(GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest request,
        io.grpc.stub.StreamObserver<GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecordFileQueryMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VideoOnDemandBlockingStub extends io.grpc.stub.AbstractStub<VideoOnDemandBlockingStub> {
    private VideoOnDemandBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoOnDemandBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VideoOnDemandBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoOnDemandBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply recordFileQuery(GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest request) {
      return blockingUnaryCall(
          getChannel(), getRecordFileQueryMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VideoOnDemandFutureStub extends io.grpc.stub.AbstractStub<VideoOnDemandFutureStub> {
    private VideoOnDemandFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoOnDemandFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VideoOnDemandFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoOnDemandFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply> recordFileQuery(
        GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRecordFileQueryMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECORD_FILE_QUERY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VideoOnDemandImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VideoOnDemandImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECORD_FILE_QUERY:
          serviceImpl.recordFileQuery((GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryRequest) request,
              (io.grpc.stub.StreamObserver<GrpcVideoOnDemand.VideoOnDemandOuterClass.RecordFileQueryReply>) responseObserver);
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

  private static abstract class VideoOnDemandBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VideoOnDemandBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcVideoOnDemand.VideoOnDemandOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VideoOnDemand");
    }
  }

  private static final class VideoOnDemandFileDescriptorSupplier
      extends VideoOnDemandBaseDescriptorSupplier {
    VideoOnDemandFileDescriptorSupplier() {}
  }

  private static final class VideoOnDemandMethodDescriptorSupplier
      extends VideoOnDemandBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VideoOnDemandMethodDescriptorSupplier(String methodName) {
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
      synchronized (VideoOnDemandGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VideoOnDemandFileDescriptorSupplier())
              .addMethod(getRecordFileQueryMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
