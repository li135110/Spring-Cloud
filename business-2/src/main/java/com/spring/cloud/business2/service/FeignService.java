package com.spring.cloud.business2.service;

import com.spring.cloud.business2.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "business-1",fallback= FeignServiceImpl.class)
public interface FeignService {

//    @RequestMapping(value = "/hi-bsns1",method = RequestMethod.GET)
//    String hiFeign(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hi-bsns1",method = RequestMethod.GET)
    String hiFeign(@RequestParam(value = "name") String name);
}
