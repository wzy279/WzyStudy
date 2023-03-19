package com.example.feign;

import org.example.ResultEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Component
@FeignClient("providerWZY")
public interface NacosServerFeign {
    @GetMapping("provider/test")
    public String getPost();

    @GetMapping("provider/user/{username}")
    public String getUsername(@PathVariable("username") String username);


    @GetMapping("provider/test3")
    public ResultEntity test3();

    @GetMapping("provider/userById/{userId}")
    public ResultEntity getUserById(@PathVariable("userId") String userId);

}
