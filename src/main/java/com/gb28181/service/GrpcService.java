package com.gb28181.service;

import GrpcDeviceCatalog.DeviceCatalogOuterClass;
import com.gb28181.grpcApi.grpcJava.DeviceCatalogGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @program: GB28181-web
 * @description: 调用GB28181信命服务器接口
 * @author: fhan
 * @create: 2018-12-29 10:50
 **/
@Component
public class GrpcService {

    private static DeviceCatalogGrpc.DeviceCatalogBlockingStub stub;

    @Value("${grpc.service_ip}")
    private String serviceIp;

    @Value("${grpc.service_port}")
    private Integer servicePort;

    public DeviceCatalogGrpc.DeviceCatalogBlockingStub buildStub(){
        if(Objects.isNull(stub)){
            ManagedChannel channel = NettyChannelBuilder.forAddress(serviceIp, servicePort).usePlaintext(true).build();
            //同步调用(异步调用的话，就是：SendMailServiceGrpc.newFutureStub(channel))
            stub = DeviceCatalogGrpc.newBlockingStub(channel);
        }
        return stub;
    }

    /**
     * 获取设备信息列表
     * @param deviceId
     * @return
     */
    public String getDeviceCatalog(String deviceId) {
        //设置请求参数
        DeviceCatalogOuterClass.DeviceCatalogQueryRequest request = DeviceCatalogOuterClass.DeviceCatalogQueryRequest.newBuilder().setDeviceid(deviceId).build();
        DeviceCatalogOuterClass.DeviceCatalogQueryReply reply = buildStub().deviceCatalogQuery(request);
        DeviceCatalogOuterClass.Instance catalog = reply.getCatalog();
        return catalog.toString();
    }
}
