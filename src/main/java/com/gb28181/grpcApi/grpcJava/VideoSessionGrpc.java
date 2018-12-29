package com.gb28181.grpcApi.grpcJava;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The VideoMessage service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: video_session.proto")
public final class VideoSessionGrpc {

  private VideoSessionGrpc() {}

  public static final String SERVICE_NAME = "MediaContract.VideoSession";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getStartLiveMethod()} instead.
  public static final io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartLiveRequest,
      MediaContract.VideoSessionOuterClass.StartLiveReply> METHOD_START_LIVE = getStartLiveMethodHelper();

  private static volatile io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartLiveRequest,
      MediaContract.VideoSessionOuterClass.StartLiveReply> getStartLiveMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartLiveRequest,
      MediaContract.VideoSessionOuterClass.StartLiveReply> getStartLiveMethod() {
    return getStartLiveMethodHelper();
  }

  private static io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartLiveRequest,
      MediaContract.VideoSessionOuterClass.StartLiveReply> getStartLiveMethodHelper() {
    io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartLiveRequest, MediaContract.VideoSessionOuterClass.StartLiveReply> getStartLiveMethod;
    if ((getStartLiveMethod = VideoSessionGrpc.getStartLiveMethod) == null) {
      synchronized (VideoSessionGrpc.class) {
        if ((getStartLiveMethod = VideoSessionGrpc.getStartLiveMethod) == null) {
          VideoSessionGrpc.getStartLiveMethod = getStartLiveMethod =
              io.grpc.MethodDescriptor.<MediaContract.VideoSessionOuterClass.StartLiveRequest, MediaContract.VideoSessionOuterClass.StartLiveReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MediaContract.VideoSession", "StartLive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MediaContract.VideoSessionOuterClass.StartLiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MediaContract.VideoSessionOuterClass.StartLiveReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoSessionMethodDescriptorSupplier("StartLive"))
                  .build();
          }
        }
     }
     return getStartLiveMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getStartHistoryMethod()} instead.
  public static final io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartHistoryRequest,
      MediaContract.VideoSessionOuterClass.StartHistoryReply> METHOD_START_HISTORY = getStartHistoryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartHistoryRequest,
      MediaContract.VideoSessionOuterClass.StartHistoryReply> getStartHistoryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartHistoryRequest,
      MediaContract.VideoSessionOuterClass.StartHistoryReply> getStartHistoryMethod() {
    return getStartHistoryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartHistoryRequest,
      MediaContract.VideoSessionOuterClass.StartHistoryReply> getStartHistoryMethodHelper() {
    io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartHistoryRequest, MediaContract.VideoSessionOuterClass.StartHistoryReply> getStartHistoryMethod;
    if ((getStartHistoryMethod = VideoSessionGrpc.getStartHistoryMethod) == null) {
      synchronized (VideoSessionGrpc.class) {
        if ((getStartHistoryMethod = VideoSessionGrpc.getStartHistoryMethod) == null) {
          VideoSessionGrpc.getStartHistoryMethod = getStartHistoryMethod =
              io.grpc.MethodDescriptor.<MediaContract.VideoSessionOuterClass.StartHistoryRequest, MediaContract.VideoSessionOuterClass.StartHistoryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MediaContract.VideoSession", "StartHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MediaContract.VideoSessionOuterClass.StartHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MediaContract.VideoSessionOuterClass.StartHistoryReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoSessionMethodDescriptorSupplier("StartHistory"))
                  .build();
          }
        }
     }
     return getStartHistoryMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getStartPlaybackMethod()} instead.
  public static final io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartPlaybackRequest,
      MediaContract.VideoSessionOuterClass.StartPlaybackReply> METHOD_START_PLAYBACK = getStartPlaybackMethodHelper();

  private static volatile io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartPlaybackRequest,
      MediaContract.VideoSessionOuterClass.StartPlaybackReply> getStartPlaybackMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartPlaybackRequest,
      MediaContract.VideoSessionOuterClass.StartPlaybackReply> getStartPlaybackMethod() {
    return getStartPlaybackMethodHelper();
  }

  private static io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartPlaybackRequest,
      MediaContract.VideoSessionOuterClass.StartPlaybackReply> getStartPlaybackMethodHelper() {
    io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StartPlaybackRequest, MediaContract.VideoSessionOuterClass.StartPlaybackReply> getStartPlaybackMethod;
    if ((getStartPlaybackMethod = VideoSessionGrpc.getStartPlaybackMethod) == null) {
      synchronized (VideoSessionGrpc.class) {
        if ((getStartPlaybackMethod = VideoSessionGrpc.getStartPlaybackMethod) == null) {
          VideoSessionGrpc.getStartPlaybackMethod = getStartPlaybackMethod =
              io.grpc.MethodDescriptor.<MediaContract.VideoSessionOuterClass.StartPlaybackRequest, MediaContract.VideoSessionOuterClass.StartPlaybackReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MediaContract.VideoSession", "StartPlayback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MediaContract.VideoSessionOuterClass.StartPlaybackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MediaContract.VideoSessionOuterClass.StartPlaybackReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoSessionMethodDescriptorSupplier("StartPlayback"))
                  .build();
          }
        }
     }
     return getStartPlaybackMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getStopMethod()} instead.
  public static final io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StopRequest,
      MediaContract.VideoSessionOuterClass.StopReply> METHOD_STOP = getStopMethodHelper();

  private static volatile io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StopRequest,
      MediaContract.VideoSessionOuterClass.StopReply> getStopMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StopRequest,
      MediaContract.VideoSessionOuterClass.StopReply> getStopMethod() {
    return getStopMethodHelper();
  }

  private static io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StopRequest,
      MediaContract.VideoSessionOuterClass.StopReply> getStopMethodHelper() {
    io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.StopRequest, MediaContract.VideoSessionOuterClass.StopReply> getStopMethod;
    if ((getStopMethod = VideoSessionGrpc.getStopMethod) == null) {
      synchronized (VideoSessionGrpc.class) {
        if ((getStopMethod = VideoSessionGrpc.getStopMethod) == null) {
          VideoSessionGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<MediaContract.VideoSessionOuterClass.StopRequest, MediaContract.VideoSessionOuterClass.StopReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MediaContract.VideoSession", "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MediaContract.VideoSessionOuterClass.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MediaContract.VideoSessionOuterClass.StopReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoSessionMethodDescriptorSupplier("Stop"))
                  .build();
          }
        }
     }
     return getStopMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getKeepAliveMethod()} instead.
  public static final io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.KeepAliveRequest,
      MediaContract.VideoSessionOuterClass.KeepAliveReply> METHOD_KEEP_ALIVE = getKeepAliveMethodHelper();

  private static volatile io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.KeepAliveRequest,
      MediaContract.VideoSessionOuterClass.KeepAliveReply> getKeepAliveMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.KeepAliveRequest,
      MediaContract.VideoSessionOuterClass.KeepAliveReply> getKeepAliveMethod() {
    return getKeepAliveMethodHelper();
  }

  private static io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.KeepAliveRequest,
      MediaContract.VideoSessionOuterClass.KeepAliveReply> getKeepAliveMethodHelper() {
    io.grpc.MethodDescriptor<MediaContract.VideoSessionOuterClass.KeepAliveRequest, MediaContract.VideoSessionOuterClass.KeepAliveReply> getKeepAliveMethod;
    if ((getKeepAliveMethod = VideoSessionGrpc.getKeepAliveMethod) == null) {
      synchronized (VideoSessionGrpc.class) {
        if ((getKeepAliveMethod = VideoSessionGrpc.getKeepAliveMethod) == null) {
          VideoSessionGrpc.getKeepAliveMethod = getKeepAliveMethod =
              io.grpc.MethodDescriptor.<MediaContract.VideoSessionOuterClass.KeepAliveRequest, MediaContract.VideoSessionOuterClass.KeepAliveReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MediaContract.VideoSession", "KeepAlive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MediaContract.VideoSessionOuterClass.KeepAliveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MediaContract.VideoSessionOuterClass.KeepAliveReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoSessionMethodDescriptorSupplier("KeepAlive"))
                  .build();
          }
        }
     }
     return getKeepAliveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoSessionStub newStub(io.grpc.Channel channel) {
    return new VideoSessionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VideoSessionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VideoSessionFutureStub(channel);
  }

  /**
   * <pre>
   * The VideoMessage service definition.
   * </pre>
   */
  public static abstract class VideoSessionImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *LivePlay
     * </pre>
     */
    public void startLive(MediaContract.VideoSessionOuterClass.StartLiveRequest request,
        io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.StartLiveReply> responseObserver) {
      asyncUnimplementedUnaryCall(getStartLiveMethodHelper(), responseObserver);
    }

    /**
     */
    public void startHistory(MediaContract.VideoSessionOuterClass.StartHistoryRequest request,
        io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.StartHistoryReply> responseObserver) {
      asyncUnimplementedUnaryCall(getStartHistoryMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *Start playback or Dowload
     * </pre>
     */
    public void startPlayback(MediaContract.VideoSessionOuterClass.StartPlaybackRequest request,
        io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.StartPlaybackReply> responseObserver) {
      asyncUnimplementedUnaryCall(getStartPlaybackMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *Stop Video
     * </pre>
     */
    public void stop(MediaContract.VideoSessionOuterClass.StopRequest request,
        io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.StopReply> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *keepalive between two point
     * </pre>
     */
    public void keepAlive(MediaContract.VideoSessionOuterClass.KeepAliveRequest request,
        io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.KeepAliveReply> responseObserver) {
      asyncUnimplementedUnaryCall(getKeepAliveMethodHelper(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartLiveMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                MediaContract.VideoSessionOuterClass.StartLiveRequest,
                MediaContract.VideoSessionOuterClass.StartLiveReply>(
                  this, METHODID_START_LIVE)))
          .addMethod(
            getStartHistoryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                MediaContract.VideoSessionOuterClass.StartHistoryRequest,
                MediaContract.VideoSessionOuterClass.StartHistoryReply>(
                  this, METHODID_START_HISTORY)))
          .addMethod(
            getStartPlaybackMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                MediaContract.VideoSessionOuterClass.StartPlaybackRequest,
                MediaContract.VideoSessionOuterClass.StartPlaybackReply>(
                  this, METHODID_START_PLAYBACK)))
          .addMethod(
            getStopMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                MediaContract.VideoSessionOuterClass.StopRequest,
                MediaContract.VideoSessionOuterClass.StopReply>(
                  this, METHODID_STOP)))
          .addMethod(
            getKeepAliveMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                MediaContract.VideoSessionOuterClass.KeepAliveRequest,
                MediaContract.VideoSessionOuterClass.KeepAliveReply>(
                  this, METHODID_KEEP_ALIVE)))
          .build();
    }
  }

  /**
   * <pre>
   * The VideoMessage service definition.
   * </pre>
   */
  public static final class VideoSessionStub extends io.grpc.stub.AbstractStub<VideoSessionStub> {
    private VideoSessionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoSessionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VideoSessionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoSessionStub(channel, callOptions);
    }

    /**
     * <pre>
     *LivePlay
     * </pre>
     */
    public void startLive(MediaContract.VideoSessionOuterClass.StartLiveRequest request,
        io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.StartLiveReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartLiveMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startHistory(MediaContract.VideoSessionOuterClass.StartHistoryRequest request,
        io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.StartHistoryReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartHistoryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Start playback or Dowload
     * </pre>
     */
    public void startPlayback(MediaContract.VideoSessionOuterClass.StartPlaybackRequest request,
        io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.StartPlaybackReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartPlaybackMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Stop Video
     * </pre>
     */
    public void stop(MediaContract.VideoSessionOuterClass.StopRequest request,
        io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.StopReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *keepalive between two point
     * </pre>
     */
    public void keepAlive(MediaContract.VideoSessionOuterClass.KeepAliveRequest request,
        io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.KeepAliveReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKeepAliveMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The VideoMessage service definition.
   * </pre>
   */
  public static final class VideoSessionBlockingStub extends io.grpc.stub.AbstractStub<VideoSessionBlockingStub> {
    private VideoSessionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoSessionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VideoSessionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoSessionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *LivePlay
     * </pre>
     */
    public MediaContract.VideoSessionOuterClass.StartLiveReply startLive(MediaContract.VideoSessionOuterClass.StartLiveRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartLiveMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public MediaContract.VideoSessionOuterClass.StartHistoryReply startHistory(MediaContract.VideoSessionOuterClass.StartHistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartHistoryMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Start playback or Dowload
     * </pre>
     */
    public MediaContract.VideoSessionOuterClass.StartPlaybackReply startPlayback(MediaContract.VideoSessionOuterClass.StartPlaybackRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartPlaybackMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Stop Video
     * </pre>
     */
    public MediaContract.VideoSessionOuterClass.StopReply stop(MediaContract.VideoSessionOuterClass.StopRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *keepalive between two point
     * </pre>
     */
    public MediaContract.VideoSessionOuterClass.KeepAliveReply keepAlive(MediaContract.VideoSessionOuterClass.KeepAliveRequest request) {
      return blockingUnaryCall(
          getChannel(), getKeepAliveMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The VideoMessage service definition.
   * </pre>
   */
  public static final class VideoSessionFutureStub extends io.grpc.stub.AbstractStub<VideoSessionFutureStub> {
    private VideoSessionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoSessionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VideoSessionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoSessionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *LivePlay
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<MediaContract.VideoSessionOuterClass.StartLiveReply> startLive(
        MediaContract.VideoSessionOuterClass.StartLiveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartLiveMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MediaContract.VideoSessionOuterClass.StartHistoryReply> startHistory(
        MediaContract.VideoSessionOuterClass.StartHistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartHistoryMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Start playback or Dowload
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<MediaContract.VideoSessionOuterClass.StartPlaybackReply> startPlayback(
        MediaContract.VideoSessionOuterClass.StartPlaybackRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartPlaybackMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Stop Video
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<MediaContract.VideoSessionOuterClass.StopReply> stop(
        MediaContract.VideoSessionOuterClass.StopRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *keepalive between two point
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<MediaContract.VideoSessionOuterClass.KeepAliveReply> keepAlive(
        MediaContract.VideoSessionOuterClass.KeepAliveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getKeepAliveMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_LIVE = 0;
  private static final int METHODID_START_HISTORY = 1;
  private static final int METHODID_START_PLAYBACK = 2;
  private static final int METHODID_STOP = 3;
  private static final int METHODID_KEEP_ALIVE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VideoSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VideoSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_LIVE:
          serviceImpl.startLive((MediaContract.VideoSessionOuterClass.StartLiveRequest) request,
              (io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.StartLiveReply>) responseObserver);
          break;
        case METHODID_START_HISTORY:
          serviceImpl.startHistory((MediaContract.VideoSessionOuterClass.StartHistoryRequest) request,
              (io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.StartHistoryReply>) responseObserver);
          break;
        case METHODID_START_PLAYBACK:
          serviceImpl.startPlayback((MediaContract.VideoSessionOuterClass.StartPlaybackRequest) request,
              (io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.StartPlaybackReply>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((MediaContract.VideoSessionOuterClass.StopRequest) request,
              (io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.StopReply>) responseObserver);
          break;
        case METHODID_KEEP_ALIVE:
          serviceImpl.keepAlive((MediaContract.VideoSessionOuterClass.KeepAliveRequest) request,
              (io.grpc.stub.StreamObserver<MediaContract.VideoSessionOuterClass.KeepAliveReply>) responseObserver);
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

  private static abstract class VideoSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VideoSessionBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return MediaContract.VideoSessionOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VideoSession");
    }
  }

  private static final class VideoSessionFileDescriptorSupplier
      extends VideoSessionBaseDescriptorSupplier {
    VideoSessionFileDescriptorSupplier() {}
  }

  private static final class VideoSessionMethodDescriptorSupplier
      extends VideoSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VideoSessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (VideoSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VideoSessionFileDescriptorSupplier())
              .addMethod(getStartLiveMethodHelper())
              .addMethod(getStartHistoryMethodHelper())
              .addMethod(getStartPlaybackMethodHelper())
              .addMethod(getStopMethodHelper())
              .addMethod(getKeepAliveMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
