package com.dzero.cloud.feignclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("nacos-config")
public interface ConfigInfoFeign {
    @GetMapping("config/info")
    String configInfo();
}
