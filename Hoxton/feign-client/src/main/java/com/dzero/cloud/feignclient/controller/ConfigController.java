package com.dzero.cloud.feignclient.controller;

import com.dzero.cloud.feignclient.service.ConfigInfoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    private ConfigInfoFeign configInfoFeign;

    @GetMapping("/info/feign")
    public String getInfo() {
        return configInfoFeign.configInfo();
    }
}
