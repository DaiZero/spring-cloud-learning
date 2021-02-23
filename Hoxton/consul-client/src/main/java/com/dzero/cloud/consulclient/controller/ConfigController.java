package com.dzero.cloud.consulclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope    // 通过 Spring Cloud 原生注解 @RefreshScope 实现配置自动更新
@RequestMapping("/config")
public class ConfigController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/info")
    public Object getInfo() {
        return "consulClient-获取的配置信息为：" + info;
    }
}
