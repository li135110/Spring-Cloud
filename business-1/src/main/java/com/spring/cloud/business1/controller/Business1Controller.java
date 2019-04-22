package com.spring.cloud.business1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Business1Controller {
    @Value("${server.port}")
    private String servicePort;
    @Value("${spring.application.name}")
    private String serviceName;

    @GetMapping("/hi-bsns1")
    public String bsns1(String name) {
        return "hi " + serviceName + ":" + servicePort + ",i'm " + name;
    }


}
