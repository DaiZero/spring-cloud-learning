package com.dzero.cloud.nacosclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope    // 通过 Spring Cloud 原生注解 @RefreshScope 实现配置自动更新
@RequestMapping("/config")
public class ConfigController {

    @Value("${server.port}")
    private String port;

    @Value("${config.info}")
    private String info;

    @GetMapping("/info")
    public String getInfo() {
        return "nacosClient 端口号："+port+"，配置信息：" + info;
    }
}
