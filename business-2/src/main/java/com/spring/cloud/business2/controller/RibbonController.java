package com.spring.cloud.business2.controller;

import com.spring.cloud.business2.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hiRibbon")
    public String hiRibbon() {
        return ribbonService.hiRibbon();
    }

}
