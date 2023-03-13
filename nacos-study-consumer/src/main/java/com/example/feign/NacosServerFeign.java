package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Component
@FeignClient("nacos-demo-server")
public interface NacosServerFeign {
    @GetMapping("/servers/userInfo/{username}")
    public String getInfoByUsername(@RequestParam String username);
}
