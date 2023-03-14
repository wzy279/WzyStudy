package com.example.controller;

import com.example.feign.NacosServerFeign;
import org.example.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/clients")
public class UserClientController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    NacosServerFeign nacosServerFeign;
    @GetMapping("/{username}")
    public String getInfoByUsername(@PathVariable String username){
        return nacosServerFeign.getUsername(username);
    }
    @GetMapping("test")
     public String test(@RequestHeader(value = "Truth",required = false) String truth){
        return "hello "+truth;
    }
    @GetMapping("/test2")
    public String test2(){
//        return restTemplate.getForObject("http://providerWZY/provider",String.class);
        return nacosServerFeign.getPost();
    }

    @GetMapping("test3")
    public ResultEntity test3(){
        return nacosServerFeign.test3();
    }


}
