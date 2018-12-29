package com.gb28181.grpcApi.grpcJava;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *service and action definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: device_manage.proto")
public final class ManageGrpc {

  private ManageGrpc() {}

  public static final String SERVICE_NAME = "manage.Manage";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getAddDeviceMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.AddDeviceRequest,
      manage.DeviceManage.AddDeviceResponse> METHOD_ADD_DEVICE = getAddDeviceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.AddDeviceRequest,
      manage.DeviceManage.AddDeviceResponse> getAddDeviceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.AddDeviceRequest,
      manage.DeviceManage.AddDeviceResponse> getAddDeviceMethod() {
    return getAddDeviceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.AddDeviceRequest,
      manage.DeviceManage.AddDeviceResponse> getAddDeviceMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.AddDeviceRequest, manage.DeviceManage.AddDeviceResponse> getAddDeviceMethod;
    if ((getAddDeviceMethod = ManageGrpc.getAddDeviceMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getAddDeviceMethod = ManageGrpc.getAddDeviceMethod) == null) {
          ManageGrpc.getAddDeviceMethod = getAddDeviceMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.AddDeviceRequest, manage.DeviceManage.AddDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "AddDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.AddDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.AddDeviceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("AddDevice"))
                  .build();
          }
        }
     }
     return getAddDeviceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getDeleteDeviceMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.DeleteDeviceRequest,
      manage.DeviceManage.DeleteDeviceResponse> METHOD_DELETE_DEVICE = getDeleteDeviceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.DeleteDeviceRequest,
      manage.DeviceManage.DeleteDeviceResponse> getDeleteDeviceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.DeleteDeviceRequest,
      manage.DeviceManage.DeleteDeviceResponse> getDeleteDeviceMethod() {
    return getDeleteDeviceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.DeleteDeviceRequest,
      manage.DeviceManage.DeleteDeviceResponse> getDeleteDeviceMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.DeleteDeviceRequest, manage.DeviceManage.DeleteDeviceResponse> getDeleteDeviceMethod;
    if ((getDeleteDeviceMethod = ManageGrpc.getDeleteDeviceMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getDeleteDeviceMethod = ManageGrpc.getDeleteDeviceMethod) == null) {
          ManageGrpc.getDeleteDeviceMethod = getDeleteDeviceMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.DeleteDeviceRequest, manage.DeviceManage.DeleteDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "DeleteDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.DeleteDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.DeleteDeviceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("DeleteDevice"))
                  .build();
          }
        }
     }
     return getDeleteDeviceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getUpdateDeviceMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.UpdateDeviceRequest,
      manage.DeviceManage.UpdateDeviceResponse> METHOD_UPDATE_DEVICE = getUpdateDeviceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.UpdateDeviceRequest,
      manage.DeviceManage.UpdateDeviceResponse> getUpdateDeviceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.UpdateDeviceRequest,
      manage.DeviceManage.UpdateDeviceResponse> getUpdateDeviceMethod() {
    return getUpdateDeviceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.UpdateDeviceRequest,
      manage.DeviceManage.UpdateDeviceResponse> getUpdateDeviceMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.UpdateDeviceRequest, manage.DeviceManage.UpdateDeviceResponse> getUpdateDeviceMethod;
    if ((getUpdateDeviceMethod = ManageGrpc.getUpdateDeviceMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getUpdateDeviceMethod = ManageGrpc.getUpdateDeviceMethod) == null) {
          ManageGrpc.getUpdateDeviceMethod = getUpdateDeviceMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.UpdateDeviceRequest, manage.DeviceManage.UpdateDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "UpdateDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.UpdateDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.UpdateDeviceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("UpdateDevice"))
                  .build();
          }
        }
     }
     return getUpdateDeviceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getQueryDeviceMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.QueryRequest,
      manage.DeviceManage.QueryDeviceResponse> METHOD_QUERY_DEVICE = getQueryDeviceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.QueryRequest,
      manage.DeviceManage.QueryDeviceResponse> getQueryDeviceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.QueryRequest,
      manage.DeviceManage.QueryDeviceResponse> getQueryDeviceMethod() {
    return getQueryDeviceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.QueryRequest,
      manage.DeviceManage.QueryDeviceResponse> getQueryDeviceMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.QueryRequest, manage.DeviceManage.QueryDeviceResponse> getQueryDeviceMethod;
    if ((getQueryDeviceMethod = ManageGrpc.getQueryDeviceMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getQueryDeviceMethod = ManageGrpc.getQueryDeviceMethod) == null) {
          ManageGrpc.getQueryDeviceMethod = getQueryDeviceMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.QueryRequest, manage.DeviceManage.QueryDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "QueryDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QueryDeviceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("QueryDevice"))
                  .build();
          }
        }
     }
     return getQueryDeviceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getQueryDeviceByIdMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.QueryDeviceRequest,
      manage.DeviceManage.QueryDeviceResponse> METHOD_QUERY_DEVICE_BY_ID = getQueryDeviceByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.QueryDeviceRequest,
      manage.DeviceManage.QueryDeviceResponse> getQueryDeviceByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.QueryDeviceRequest,
      manage.DeviceManage.QueryDeviceResponse> getQueryDeviceByIdMethod() {
    return getQueryDeviceByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.QueryDeviceRequest,
      manage.DeviceManage.QueryDeviceResponse> getQueryDeviceByIdMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.QueryDeviceRequest, manage.DeviceManage.QueryDeviceResponse> getQueryDeviceByIdMethod;
    if ((getQueryDeviceByIdMethod = ManageGrpc.getQueryDeviceByIdMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getQueryDeviceByIdMethod = ManageGrpc.getQueryDeviceByIdMethod) == null) {
          ManageGrpc.getQueryDeviceByIdMethod = getQueryDeviceByIdMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.QueryDeviceRequest, manage.DeviceManage.QueryDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "QueryDeviceById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QueryDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QueryDeviceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("QueryDeviceById"))
                  .build();
          }
        }
     }
     return getQueryDeviceByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getCheckDuplMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.CheckDupRequest,
      manage.DeviceManage.CheckDupResponse> METHOD_CHECK_DUPL = getCheckDuplMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.CheckDupRequest,
      manage.DeviceManage.CheckDupResponse> getCheckDuplMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.CheckDupRequest,
      manage.DeviceManage.CheckDupResponse> getCheckDuplMethod() {
    return getCheckDuplMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.CheckDupRequest,
      manage.DeviceManage.CheckDupResponse> getCheckDuplMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.CheckDupRequest, manage.DeviceManage.CheckDupResponse> getCheckDuplMethod;
    if ((getCheckDuplMethod = ManageGrpc.getCheckDuplMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getCheckDuplMethod = ManageGrpc.getCheckDuplMethod) == null) {
          ManageGrpc.getCheckDuplMethod = getCheckDuplMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.CheckDupRequest, manage.DeviceManage.CheckDupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "CheckDupl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.CheckDupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.CheckDupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("CheckDupl"))
                  .build();
          }
        }
     }
     return getCheckDuplMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getAddViewMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.AddViewRequest,
      manage.DeviceManage.AddViewResponse> METHOD_ADD_VIEW = getAddViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.AddViewRequest,
      manage.DeviceManage.AddViewResponse> getAddViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.AddViewRequest,
      manage.DeviceManage.AddViewResponse> getAddViewMethod() {
    return getAddViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.AddViewRequest,
      manage.DeviceManage.AddViewResponse> getAddViewMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.AddViewRequest, manage.DeviceManage.AddViewResponse> getAddViewMethod;
    if ((getAddViewMethod = ManageGrpc.getAddViewMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getAddViewMethod = ManageGrpc.getAddViewMethod) == null) {
          ManageGrpc.getAddViewMethod = getAddViewMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.AddViewRequest, manage.DeviceManage.AddViewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "AddView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.AddViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.AddViewResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("AddView"))
                  .build();
          }
        }
     }
     return getAddViewMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getDeleteViewMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.DeleteViewRequest,
      manage.DeviceManage.DeleteViewResponse> METHOD_DELETE_VIEW = getDeleteViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.DeleteViewRequest,
      manage.DeviceManage.DeleteViewResponse> getDeleteViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.DeleteViewRequest,
      manage.DeviceManage.DeleteViewResponse> getDeleteViewMethod() {
    return getDeleteViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.DeleteViewRequest,
      manage.DeviceManage.DeleteViewResponse> getDeleteViewMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.DeleteViewRequest, manage.DeviceManage.DeleteViewResponse> getDeleteViewMethod;
    if ((getDeleteViewMethod = ManageGrpc.getDeleteViewMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getDeleteViewMethod = ManageGrpc.getDeleteViewMethod) == null) {
          ManageGrpc.getDeleteViewMethod = getDeleteViewMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.DeleteViewRequest, manage.DeviceManage.DeleteViewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "DeleteView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.DeleteViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.DeleteViewResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("DeleteView"))
                  .build();
          }
        }
     }
     return getDeleteViewMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getUpdateViewMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.UpdateViewRequest,
      manage.DeviceManage.UpdateViewResponse> METHOD_UPDATE_VIEW = getUpdateViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.UpdateViewRequest,
      manage.DeviceManage.UpdateViewResponse> getUpdateViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.UpdateViewRequest,
      manage.DeviceManage.UpdateViewResponse> getUpdateViewMethod() {
    return getUpdateViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.UpdateViewRequest,
      manage.DeviceManage.UpdateViewResponse> getUpdateViewMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.UpdateViewRequest, manage.DeviceManage.UpdateViewResponse> getUpdateViewMethod;
    if ((getUpdateViewMethod = ManageGrpc.getUpdateViewMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getUpdateViewMethod = ManageGrpc.getUpdateViewMethod) == null) {
          ManageGrpc.getUpdateViewMethod = getUpdateViewMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.UpdateViewRequest, manage.DeviceManage.UpdateViewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "UpdateView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.UpdateViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.UpdateViewResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("UpdateView"))
                  .build();
          }
        }
     }
     return getUpdateViewMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getQuerySimpleViewMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.QuerySimpleRequest,
      manage.DeviceManage.QuerySimpleViewResponse> METHOD_QUERY_SIMPLE_VIEW = getQuerySimpleViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.QuerySimpleRequest,
      manage.DeviceManage.QuerySimpleViewResponse> getQuerySimpleViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.QuerySimpleRequest,
      manage.DeviceManage.QuerySimpleViewResponse> getQuerySimpleViewMethod() {
    return getQuerySimpleViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.QuerySimpleRequest,
      manage.DeviceManage.QuerySimpleViewResponse> getQuerySimpleViewMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.QuerySimpleRequest, manage.DeviceManage.QuerySimpleViewResponse> getQuerySimpleViewMethod;
    if ((getQuerySimpleViewMethod = ManageGrpc.getQuerySimpleViewMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getQuerySimpleViewMethod = ManageGrpc.getQuerySimpleViewMethod) == null) {
          ManageGrpc.getQuerySimpleViewMethod = getQuerySimpleViewMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.QuerySimpleRequest, manage.DeviceManage.QuerySimpleViewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "QuerySimpleView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QuerySimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QuerySimpleViewResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("QuerySimpleView"))
                  .build();
          }
        }
     }
     return getQuerySimpleViewMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getQuerySimpleDeviceByIdsMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.QuerySimpleDevicesRequest,
      manage.DeviceManage.QuerySimpleDevicesResponse> METHOD_QUERY_SIMPLE_DEVICE_BY_IDS = getQuerySimpleDeviceByIdsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.QuerySimpleDevicesRequest,
      manage.DeviceManage.QuerySimpleDevicesResponse> getQuerySimpleDeviceByIdsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.QuerySimpleDevicesRequest,
      manage.DeviceManage.QuerySimpleDevicesResponse> getQuerySimpleDeviceByIdsMethod() {
    return getQuerySimpleDeviceByIdsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.QuerySimpleDevicesRequest,
      manage.DeviceManage.QuerySimpleDevicesResponse> getQuerySimpleDeviceByIdsMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.QuerySimpleDevicesRequest, manage.DeviceManage.QuerySimpleDevicesResponse> getQuerySimpleDeviceByIdsMethod;
    if ((getQuerySimpleDeviceByIdsMethod = ManageGrpc.getQuerySimpleDeviceByIdsMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getQuerySimpleDeviceByIdsMethod = ManageGrpc.getQuerySimpleDeviceByIdsMethod) == null) {
          ManageGrpc.getQuerySimpleDeviceByIdsMethod = getQuerySimpleDeviceByIdsMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.QuerySimpleDevicesRequest, manage.DeviceManage.QuerySimpleDevicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "QuerySimpleDeviceByIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QuerySimpleDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QuerySimpleDevicesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("QuerySimpleDeviceByIds"))
                  .build();
          }
        }
     }
     return getQuerySimpleDeviceByIdsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getFuzzyQueryDeviceByNameMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.FuzzyQueryDeviceRequest,
      manage.DeviceManage.FuzzyQueryDeviceResponse> METHOD_FUZZY_QUERY_DEVICE_BY_NAME = getFuzzyQueryDeviceByNameMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.FuzzyQueryDeviceRequest,
      manage.DeviceManage.FuzzyQueryDeviceResponse> getFuzzyQueryDeviceByNameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.FuzzyQueryDeviceRequest,
      manage.DeviceManage.FuzzyQueryDeviceResponse> getFuzzyQueryDeviceByNameMethod() {
    return getFuzzyQueryDeviceByNameMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.FuzzyQueryDeviceRequest,
      manage.DeviceManage.FuzzyQueryDeviceResponse> getFuzzyQueryDeviceByNameMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.FuzzyQueryDeviceRequest, manage.DeviceManage.FuzzyQueryDeviceResponse> getFuzzyQueryDeviceByNameMethod;
    if ((getFuzzyQueryDeviceByNameMethod = ManageGrpc.getFuzzyQueryDeviceByNameMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getFuzzyQueryDeviceByNameMethod = ManageGrpc.getFuzzyQueryDeviceByNameMethod) == null) {
          ManageGrpc.getFuzzyQueryDeviceByNameMethod = getFuzzyQueryDeviceByNameMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.FuzzyQueryDeviceRequest, manage.DeviceManage.FuzzyQueryDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "FuzzyQueryDeviceByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.FuzzyQueryDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.FuzzyQueryDeviceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("FuzzyQueryDeviceByName"))
                  .build();
          }
        }
     }
     return getFuzzyQueryDeviceByNameMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getQueryChannelDevicesMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.QueryChannelRequest,
      manage.DeviceManage.QueryChannelResponse> METHOD_QUERY_CHANNEL_DEVICES = getQueryChannelDevicesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.QueryChannelRequest,
      manage.DeviceManage.QueryChannelResponse> getQueryChannelDevicesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.QueryChannelRequest,
      manage.DeviceManage.QueryChannelResponse> getQueryChannelDevicesMethod() {
    return getQueryChannelDevicesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.QueryChannelRequest,
      manage.DeviceManage.QueryChannelResponse> getQueryChannelDevicesMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.QueryChannelRequest, manage.DeviceManage.QueryChannelResponse> getQueryChannelDevicesMethod;
    if ((getQueryChannelDevicesMethod = ManageGrpc.getQueryChannelDevicesMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getQueryChannelDevicesMethod = ManageGrpc.getQueryChannelDevicesMethod) == null) {
          ManageGrpc.getQueryChannelDevicesMethod = getQueryChannelDevicesMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.QueryChannelRequest, manage.DeviceManage.QueryChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "QueryChannelDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QueryChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QueryChannelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("QueryChannelDevices"))
                  .build();
          }
        }
     }
     return getQueryChannelDevicesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getQueryParentDeviceByChildIDMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.QueryParentDeviceRequest,
      manage.DeviceManage.QueryParentDeviceResponse> METHOD_QUERY_PARENT_DEVICE_BY_CHILD_ID = getQueryParentDeviceByChildIDMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.QueryParentDeviceRequest,
      manage.DeviceManage.QueryParentDeviceResponse> getQueryParentDeviceByChildIDMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.QueryParentDeviceRequest,
      manage.DeviceManage.QueryParentDeviceResponse> getQueryParentDeviceByChildIDMethod() {
    return getQueryParentDeviceByChildIDMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.QueryParentDeviceRequest,
      manage.DeviceManage.QueryParentDeviceResponse> getQueryParentDeviceByChildIDMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.QueryParentDeviceRequest, manage.DeviceManage.QueryParentDeviceResponse> getQueryParentDeviceByChildIDMethod;
    if ((getQueryParentDeviceByChildIDMethod = ManageGrpc.getQueryParentDeviceByChildIDMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getQueryParentDeviceByChildIDMethod = ManageGrpc.getQueryParentDeviceByChildIDMethod) == null) {
          ManageGrpc.getQueryParentDeviceByChildIDMethod = getQueryParentDeviceByChildIDMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.QueryParentDeviceRequest, manage.DeviceManage.QueryParentDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "QueryParentDeviceByChildID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QueryParentDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QueryParentDeviceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("QueryParentDeviceByChildID"))
                  .build();
          }
        }
     }
     return getQueryParentDeviceByChildIDMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getUpdateViewNameMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.UpdateViewNameRequest,
      manage.DeviceManage.UpdateViewResponse> METHOD_UPDATE_VIEW_NAME = getUpdateViewNameMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.UpdateViewNameRequest,
      manage.DeviceManage.UpdateViewResponse> getUpdateViewNameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.UpdateViewNameRequest,
      manage.DeviceManage.UpdateViewResponse> getUpdateViewNameMethod() {
    return getUpdateViewNameMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.UpdateViewNameRequest,
      manage.DeviceManage.UpdateViewResponse> getUpdateViewNameMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.UpdateViewNameRequest, manage.DeviceManage.UpdateViewResponse> getUpdateViewNameMethod;
    if ((getUpdateViewNameMethod = ManageGrpc.getUpdateViewNameMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getUpdateViewNameMethod = ManageGrpc.getUpdateViewNameMethod) == null) {
          ManageGrpc.getUpdateViewNameMethod = getUpdateViewNameMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.UpdateViewNameRequest, manage.DeviceManage.UpdateViewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "UpdateViewName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.UpdateViewNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.UpdateViewResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("UpdateViewName"))
                  .build();
          }
        }
     }
     return getUpdateViewNameMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getQueryDevicesByProtoTypesMethod()} instead.
  public static final io.grpc.MethodDescriptor<manage.DeviceManage.QueryByProtoTypesRequest,
      manage.DeviceManage.QueryByProtoTypesResponse> METHOD_QUERY_DEVICES_BY_PROTO_TYPES = getQueryDevicesByProtoTypesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<manage.DeviceManage.QueryByProtoTypesRequest,
      manage.DeviceManage.QueryByProtoTypesResponse> getQueryDevicesByProtoTypesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<manage.DeviceManage.QueryByProtoTypesRequest,
      manage.DeviceManage.QueryByProtoTypesResponse> getQueryDevicesByProtoTypesMethod() {
    return getQueryDevicesByProtoTypesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<manage.DeviceManage.QueryByProtoTypesRequest,
      manage.DeviceManage.QueryByProtoTypesResponse> getQueryDevicesByProtoTypesMethodHelper() {
    io.grpc.MethodDescriptor<manage.DeviceManage.QueryByProtoTypesRequest, manage.DeviceManage.QueryByProtoTypesResponse> getQueryDevicesByProtoTypesMethod;
    if ((getQueryDevicesByProtoTypesMethod = ManageGrpc.getQueryDevicesByProtoTypesMethod) == null) {
      synchronized (ManageGrpc.class) {
        if ((getQueryDevicesByProtoTypesMethod = ManageGrpc.getQueryDevicesByProtoTypesMethod) == null) {
          ManageGrpc.getQueryDevicesByProtoTypesMethod = getQueryDevicesByProtoTypesMethod =
              io.grpc.MethodDescriptor.<manage.DeviceManage.QueryByProtoTypesRequest, manage.DeviceManage.QueryByProtoTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "manage.Manage", "QueryDevicesByProtoTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QueryByProtoTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  manage.DeviceManage.QueryByProtoTypesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ManageMethodDescriptorSupplier("QueryDevicesByProtoTypes"))
                  .build();
          }
        }
     }
     return getQueryDevicesByProtoTypesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManageStub newStub(io.grpc.Channel channel) {
    return new ManageStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ManageBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ManageFutureStub(channel);
  }

  /**
   * <pre>
   *service and action definition
   * </pre>
   */
  public static abstract class ManageImplBase implements io.grpc.BindableService {

    /**
     */
    public void addDevice(manage.DeviceManage.AddDeviceRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.AddDeviceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddDeviceMethodHelper(), responseObserver);
    }

    /**
     */
    public void deleteDevice(manage.DeviceManage.DeleteDeviceRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.DeleteDeviceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDeviceMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateDevice(manage.DeviceManage.UpdateDeviceRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.UpdateDeviceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDeviceMethodHelper(), responseObserver);
    }

    /**
     */
    public void queryDevice(manage.DeviceManage.QueryRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QueryDeviceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryDeviceMethodHelper(), responseObserver);
    }

    /**
     */
    public void queryDeviceById(manage.DeviceManage.QueryDeviceRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QueryDeviceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryDeviceByIdMethodHelper(), responseObserver);
    }

    /**
     */
    public void checkDupl(manage.DeviceManage.CheckDupRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.CheckDupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckDuplMethodHelper(), responseObserver);
    }

    /**
     */
    public void addView(manage.DeviceManage.AddViewRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.AddViewResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddViewMethodHelper(), responseObserver);
    }

    /**
     */
    public void deleteView(manage.DeviceManage.DeleteViewRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.DeleteViewResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteViewMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateView(manage.DeviceManage.UpdateViewRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.UpdateViewResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateViewMethodHelper(), responseObserver);
    }

    /**
     */
    public void querySimpleView(manage.DeviceManage.QuerySimpleRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QuerySimpleViewResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQuerySimpleViewMethodHelper(), responseObserver);
    }

    /**
     */
    public void querySimpleDeviceByIds(manage.DeviceManage.QuerySimpleDevicesRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QuerySimpleDevicesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQuerySimpleDeviceByIdsMethodHelper(), responseObserver);
    }

    /**
     */
    public void fuzzyQueryDeviceByName(manage.DeviceManage.FuzzyQueryDeviceRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.FuzzyQueryDeviceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFuzzyQueryDeviceByNameMethodHelper(), responseObserver);
    }

    /**
     */
    public void queryChannelDevices(manage.DeviceManage.QueryChannelRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QueryChannelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryChannelDevicesMethodHelper(), responseObserver);
    }

    /**
     */
    public void queryParentDeviceByChildID(manage.DeviceManage.QueryParentDeviceRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QueryParentDeviceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryParentDeviceByChildIDMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateViewName(manage.DeviceManage.UpdateViewNameRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.UpdateViewResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateViewNameMethodHelper(), responseObserver);
    }

    /**
     */
    public void queryDevicesByProtoTypes(manage.DeviceManage.QueryByProtoTypesRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QueryByProtoTypesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryDevicesByProtoTypesMethodHelper(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddDeviceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.AddDeviceRequest,
                manage.DeviceManage.AddDeviceResponse>(
                  this, METHODID_ADD_DEVICE)))
          .addMethod(
            getDeleteDeviceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.DeleteDeviceRequest,
                manage.DeviceManage.DeleteDeviceResponse>(
                  this, METHODID_DELETE_DEVICE)))
          .addMethod(
            getUpdateDeviceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.UpdateDeviceRequest,
                manage.DeviceManage.UpdateDeviceResponse>(
                  this, METHODID_UPDATE_DEVICE)))
          .addMethod(
            getQueryDeviceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.QueryRequest,
                manage.DeviceManage.QueryDeviceResponse>(
                  this, METHODID_QUERY_DEVICE)))
          .addMethod(
            getQueryDeviceByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.QueryDeviceRequest,
                manage.DeviceManage.QueryDeviceResponse>(
                  this, METHODID_QUERY_DEVICE_BY_ID)))
          .addMethod(
            getCheckDuplMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.CheckDupRequest,
                manage.DeviceManage.CheckDupResponse>(
                  this, METHODID_CHECK_DUPL)))
          .addMethod(
            getAddViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.AddViewRequest,
                manage.DeviceManage.AddViewResponse>(
                  this, METHODID_ADD_VIEW)))
          .addMethod(
            getDeleteViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.DeleteViewRequest,
                manage.DeviceManage.DeleteViewResponse>(
                  this, METHODID_DELETE_VIEW)))
          .addMethod(
            getUpdateViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.UpdateViewRequest,
                manage.DeviceManage.UpdateViewResponse>(
                  this, METHODID_UPDATE_VIEW)))
          .addMethod(
            getQuerySimpleViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.QuerySimpleRequest,
                manage.DeviceManage.QuerySimpleViewResponse>(
                  this, METHODID_QUERY_SIMPLE_VIEW)))
          .addMethod(
            getQuerySimpleDeviceByIdsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.QuerySimpleDevicesRequest,
                manage.DeviceManage.QuerySimpleDevicesResponse>(
                  this, METHODID_QUERY_SIMPLE_DEVICE_BY_IDS)))
          .addMethod(
            getFuzzyQueryDeviceByNameMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.FuzzyQueryDeviceRequest,
                manage.DeviceManage.FuzzyQueryDeviceResponse>(
                  this, METHODID_FUZZY_QUERY_DEVICE_BY_NAME)))
          .addMethod(
            getQueryChannelDevicesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.QueryChannelRequest,
                manage.DeviceManage.QueryChannelResponse>(
                  this, METHODID_QUERY_CHANNEL_DEVICES)))
          .addMethod(
            getQueryParentDeviceByChildIDMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.QueryParentDeviceRequest,
                manage.DeviceManage.QueryParentDeviceResponse>(
                  this, METHODID_QUERY_PARENT_DEVICE_BY_CHILD_ID)))
          .addMethod(
            getUpdateViewNameMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.UpdateViewNameRequest,
                manage.DeviceManage.UpdateViewResponse>(
                  this, METHODID_UPDATE_VIEW_NAME)))
          .addMethod(
            getQueryDevicesByProtoTypesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                manage.DeviceManage.QueryByProtoTypesRequest,
                manage.DeviceManage.QueryByProtoTypesResponse>(
                  this, METHODID_QUERY_DEVICES_BY_PROTO_TYPES)))
          .build();
    }
  }

  /**
   * <pre>
   *service and action definition
   * </pre>
   */
  public static final class ManageStub extends io.grpc.stub.AbstractStub<ManageStub> {
    private ManageStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManageStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ManageStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManageStub(channel, callOptions);
    }

    /**
     */
    public void addDevice(manage.DeviceManage.AddDeviceRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.AddDeviceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddDeviceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDevice(manage.DeviceManage.DeleteDeviceRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.DeleteDeviceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDeviceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDevice(manage.DeviceManage.UpdateDeviceRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.UpdateDeviceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDeviceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDevice(manage.DeviceManage.QueryRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QueryDeviceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryDeviceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDeviceById(manage.DeviceManage.QueryDeviceRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QueryDeviceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryDeviceByIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkDupl(manage.DeviceManage.CheckDupRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.CheckDupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckDuplMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addView(manage.DeviceManage.AddViewRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.AddViewResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddViewMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteView(manage.DeviceManage.DeleteViewRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.DeleteViewResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteViewMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateView(manage.DeviceManage.UpdateViewRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.UpdateViewResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateViewMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySimpleView(manage.DeviceManage.QuerySimpleRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QuerySimpleViewResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuerySimpleViewMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySimpleDeviceByIds(manage.DeviceManage.QuerySimpleDevicesRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QuerySimpleDevicesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuerySimpleDeviceByIdsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fuzzyQueryDeviceByName(manage.DeviceManage.FuzzyQueryDeviceRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.FuzzyQueryDeviceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFuzzyQueryDeviceByNameMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryChannelDevices(manage.DeviceManage.QueryChannelRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QueryChannelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryChannelDevicesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryParentDeviceByChildID(manage.DeviceManage.QueryParentDeviceRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QueryParentDeviceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryParentDeviceByChildIDMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateViewName(manage.DeviceManage.UpdateViewNameRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.UpdateViewResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateViewNameMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDevicesByProtoTypes(manage.DeviceManage.QueryByProtoTypesRequest request,
        io.grpc.stub.StreamObserver<manage.DeviceManage.QueryByProtoTypesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryDevicesByProtoTypesMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *service and action definition
   * </pre>
   */
  public static final class ManageBlockingStub extends io.grpc.stub.AbstractStub<ManageBlockingStub> {
    private ManageBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManageBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ManageBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManageBlockingStub(channel, callOptions);
    }

    /**
     */
    public manage.DeviceManage.AddDeviceResponse addDevice(manage.DeviceManage.AddDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddDeviceMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.DeleteDeviceResponse deleteDevice(manage.DeviceManage.DeleteDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDeviceMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.UpdateDeviceResponse updateDevice(manage.DeviceManage.UpdateDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDeviceMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.QueryDeviceResponse queryDevice(manage.DeviceManage.QueryRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryDeviceMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.QueryDeviceResponse queryDeviceById(manage.DeviceManage.QueryDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryDeviceByIdMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.CheckDupResponse checkDupl(manage.DeviceManage.CheckDupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckDuplMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.AddViewResponse addView(manage.DeviceManage.AddViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddViewMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.DeleteViewResponse deleteView(manage.DeviceManage.DeleteViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteViewMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.UpdateViewResponse updateView(manage.DeviceManage.UpdateViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateViewMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.QuerySimpleViewResponse querySimpleView(manage.DeviceManage.QuerySimpleRequest request) {
      return blockingUnaryCall(
          getChannel(), getQuerySimpleViewMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.QuerySimpleDevicesResponse querySimpleDeviceByIds(manage.DeviceManage.QuerySimpleDevicesRequest request) {
      return blockingUnaryCall(
          getChannel(), getQuerySimpleDeviceByIdsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.FuzzyQueryDeviceResponse fuzzyQueryDeviceByName(manage.DeviceManage.FuzzyQueryDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getFuzzyQueryDeviceByNameMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.QueryChannelResponse queryChannelDevices(manage.DeviceManage.QueryChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryChannelDevicesMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.QueryParentDeviceResponse queryParentDeviceByChildID(manage.DeviceManage.QueryParentDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryParentDeviceByChildIDMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.UpdateViewResponse updateViewName(manage.DeviceManage.UpdateViewNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateViewNameMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public manage.DeviceManage.QueryByProtoTypesResponse queryDevicesByProtoTypes(manage.DeviceManage.QueryByProtoTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryDevicesByProtoTypesMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *service and action definition
   * </pre>
   */
  public static final class ManageFutureStub extends io.grpc.stub.AbstractStub<ManageFutureStub> {
    private ManageFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManageFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ManageFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.AddDeviceResponse> addDevice(
        manage.DeviceManage.AddDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddDeviceMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.DeleteDeviceResponse> deleteDevice(
        manage.DeviceManage.DeleteDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDeviceMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.UpdateDeviceResponse> updateDevice(
        manage.DeviceManage.UpdateDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDeviceMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.QueryDeviceResponse> queryDevice(
        manage.DeviceManage.QueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryDeviceMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.QueryDeviceResponse> queryDeviceById(
        manage.DeviceManage.QueryDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryDeviceByIdMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.CheckDupResponse> checkDupl(
        manage.DeviceManage.CheckDupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckDuplMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.AddViewResponse> addView(
        manage.DeviceManage.AddViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddViewMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.DeleteViewResponse> deleteView(
        manage.DeviceManage.DeleteViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteViewMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.UpdateViewResponse> updateView(
        manage.DeviceManage.UpdateViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateViewMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.QuerySimpleViewResponse> querySimpleView(
        manage.DeviceManage.QuerySimpleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQuerySimpleViewMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.QuerySimpleDevicesResponse> querySimpleDeviceByIds(
        manage.DeviceManage.QuerySimpleDevicesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQuerySimpleDeviceByIdsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.FuzzyQueryDeviceResponse> fuzzyQueryDeviceByName(
        manage.DeviceManage.FuzzyQueryDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFuzzyQueryDeviceByNameMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.QueryChannelResponse> queryChannelDevices(
        manage.DeviceManage.QueryChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryChannelDevicesMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.QueryParentDeviceResponse> queryParentDeviceByChildID(
        manage.DeviceManage.QueryParentDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryParentDeviceByChildIDMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.UpdateViewResponse> updateViewName(
        manage.DeviceManage.UpdateViewNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateViewNameMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<manage.DeviceManage.QueryByProtoTypesResponse> queryDevicesByProtoTypes(
        manage.DeviceManage.QueryByProtoTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryDevicesByProtoTypesMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_DEVICE = 0;
  private static final int METHODID_DELETE_DEVICE = 1;
  private static final int METHODID_UPDATE_DEVICE = 2;
  private static final int METHODID_QUERY_DEVICE = 3;
  private static final int METHODID_QUERY_DEVICE_BY_ID = 4;
  private static final int METHODID_CHECK_DUPL = 5;
  private static final int METHODID_ADD_VIEW = 6;
  private static final int METHODID_DELETE_VIEW = 7;
  private static final int METHODID_UPDATE_VIEW = 8;
  private static final int METHODID_QUERY_SIMPLE_VIEW = 9;
  private static final int METHODID_QUERY_SIMPLE_DEVICE_BY_IDS = 10;
  private static final int METHODID_FUZZY_QUERY_DEVICE_BY_NAME = 11;
  private static final int METHODID_QUERY_CHANNEL_DEVICES = 12;
  private static final int METHODID_QUERY_PARENT_DEVICE_BY_CHILD_ID = 13;
  private static final int METHODID_UPDATE_VIEW_NAME = 14;
  private static final int METHODID_QUERY_DEVICES_BY_PROTO_TYPES = 15;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_DEVICE:
          serviceImpl.addDevice((manage.DeviceManage.AddDeviceRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.AddDeviceResponse>) responseObserver);
          break;
        case METHODID_DELETE_DEVICE:
          serviceImpl.deleteDevice((manage.DeviceManage.DeleteDeviceRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.DeleteDeviceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEVICE:
          serviceImpl.updateDevice((manage.DeviceManage.UpdateDeviceRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.UpdateDeviceResponse>) responseObserver);
          break;
        case METHODID_QUERY_DEVICE:
          serviceImpl.queryDevice((manage.DeviceManage.QueryRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.QueryDeviceResponse>) responseObserver);
          break;
        case METHODID_QUERY_DEVICE_BY_ID:
          serviceImpl.queryDeviceById((manage.DeviceManage.QueryDeviceRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.QueryDeviceResponse>) responseObserver);
          break;
        case METHODID_CHECK_DUPL:
          serviceImpl.checkDupl((manage.DeviceManage.CheckDupRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.CheckDupResponse>) responseObserver);
          break;
        case METHODID_ADD_VIEW:
          serviceImpl.addView((manage.DeviceManage.AddViewRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.AddViewResponse>) responseObserver);
          break;
        case METHODID_DELETE_VIEW:
          serviceImpl.deleteView((manage.DeviceManage.DeleteViewRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.DeleteViewResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VIEW:
          serviceImpl.updateView((manage.DeviceManage.UpdateViewRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.UpdateViewResponse>) responseObserver);
          break;
        case METHODID_QUERY_SIMPLE_VIEW:
          serviceImpl.querySimpleView((manage.DeviceManage.QuerySimpleRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.QuerySimpleViewResponse>) responseObserver);
          break;
        case METHODID_QUERY_SIMPLE_DEVICE_BY_IDS:
          serviceImpl.querySimpleDeviceByIds((manage.DeviceManage.QuerySimpleDevicesRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.QuerySimpleDevicesResponse>) responseObserver);
          break;
        case METHODID_FUZZY_QUERY_DEVICE_BY_NAME:
          serviceImpl.fuzzyQueryDeviceByName((manage.DeviceManage.FuzzyQueryDeviceRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.FuzzyQueryDeviceResponse>) responseObserver);
          break;
        case METHODID_QUERY_CHANNEL_DEVICES:
          serviceImpl.queryChannelDevices((manage.DeviceManage.QueryChannelRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.QueryChannelResponse>) responseObserver);
          break;
        case METHODID_QUERY_PARENT_DEVICE_BY_CHILD_ID:
          serviceImpl.queryParentDeviceByChildID((manage.DeviceManage.QueryParentDeviceRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.QueryParentDeviceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VIEW_NAME:
          serviceImpl.updateViewName((manage.DeviceManage.UpdateViewNameRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.UpdateViewResponse>) responseObserver);
          break;
        case METHODID_QUERY_DEVICES_BY_PROTO_TYPES:
          serviceImpl.queryDevicesByProtoTypes((manage.DeviceManage.QueryByProtoTypesRequest) request,
              (io.grpc.stub.StreamObserver<manage.DeviceManage.QueryByProtoTypesResponse>) responseObserver);
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

  private static abstract class ManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManageBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return manage.DeviceManage.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Manage");
    }
  }

  private static final class ManageFileDescriptorSupplier
      extends ManageBaseDescriptorSupplier {
    ManageFileDescriptorSupplier() {}
  }

  private static final class ManageMethodDescriptorSupplier
      extends ManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (ManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManageFileDescriptorSupplier())
              .addMethod(getAddDeviceMethodHelper())
              .addMethod(getDeleteDeviceMethodHelper())
              .addMethod(getUpdateDeviceMethodHelper())
              .addMethod(getQueryDeviceMethodHelper())
              .addMethod(getQueryDeviceByIdMethodHelper())
              .addMethod(getCheckDuplMethodHelper())
              .addMethod(getAddViewMethodHelper())
              .addMethod(getDeleteViewMethodHelper())
              .addMethod(getUpdateViewMethodHelper())
              .addMethod(getQuerySimpleViewMethodHelper())
              .addMethod(getQuerySimpleDeviceByIdsMethodHelper())
              .addMethod(getFuzzyQueryDeviceByNameMethodHelper())
              .addMethod(getQueryChannelDevicesMethodHelper())
              .addMethod(getQueryParentDeviceByChildIDMethodHelper())
              .addMethod(getUpdateViewNameMethodHelper())
              .addMethod(getQueryDevicesByProtoTypesMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
