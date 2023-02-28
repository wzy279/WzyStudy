package com.soft.Test1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("nacos-demo-server")
public interface NacosServerFeign {
    @GetMapping("/servers/userInfo/{username}")
    public String getInfoByUsername(@PathVariable String username);
}
