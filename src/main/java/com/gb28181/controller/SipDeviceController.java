package com.gb28181.controller;

import com.gb28181.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: GB28181-web
 * @description: 查询设备信息Contrller
 * @author: fhan
 * @create: 2018-12-29 11:26
 **/
@RestController
@RequestMapping("/sip/device")
public class SipDeviceController {

    @Autowired
    private GrpcService grpcService;

    @RequestMapping("/catalog/{deviceId}")
    public String getDeviceCatalog(@PathVariable("deviceId") String deviceId){
        return grpcService.getDeviceCatalog(deviceId);
    }

}
