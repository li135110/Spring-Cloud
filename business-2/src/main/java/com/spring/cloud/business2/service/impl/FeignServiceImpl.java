package com.spring.cloud.business2.service.impl;

import com.spring.cloud.business2.service.FeignService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class FeignServiceImpl implements FeignService {

    @Override
    public String hiFeign(String name) {
        return "sorry feign error"+name;
    }
}