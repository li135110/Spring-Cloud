package com.spring.cloud.business2.controller;

import com.spring.cloud.business2.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Value("${server.port}")
    private String servicePort;
    @Value("${spring.application.name}")
    private String serviceName;

    @Autowired
    private FeignService feignService;

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @GetMapping(value = "/hiFeign")
    public String hi2() {
        return feignService.hiFeign(serviceName + ":" + servicePort);
    }

}
