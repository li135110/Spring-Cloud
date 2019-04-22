package com.spring.cloud.business2.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.cloud.business2.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonServiceImpl implements RibbonService {


    @Value("${server.port}")
    private String servicePort;
    @Value("${spring.application.name}")
    private String serviceName;
    @Autowired
    RestTemplate restTemplate;

//    @Override
//    public String hiRibbon() {
//        return restTemplate.getForObject(
//                "http://BUSINESS-1/hi-bsns1?name=" + serviceName + ":" + servicePort,
//                String.class);
//    }

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiRibbon() {
        return restTemplate.getForObject(
                "http://BUSINESS-1/hi-bsns1?name=" + serviceName + ":" + servicePort,
                String.class);
    }

    public String hiError() {
        return "hi, so sorry,error!";
    }
}
