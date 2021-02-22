package com.dzero.cloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Value("${server.port}")
    private int port;

    @GetMapping("/admin")
    public Map<String, Object> getAdmin() {
        System.out.println("/api/user/admin 接口被调用，服务端口号：" + port);
        Person person = new Person();
        person.setUserId(0);
        person.setUserName("dzero");
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", "200");
        resultMap.put("success", true);
        resultMap.put("data", person);
        return resultMap;
    }

    class Person {
        private Integer userId;
        private String userName;

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }

}
