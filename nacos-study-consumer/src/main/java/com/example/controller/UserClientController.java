package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/clients")
public class UserClientController {
    @Autowired
    RestTemplate restTemplate;
    /*@Autowired
    NacosServerFeign nacosServerFeign;*/
    @GetMapping("/{username}")
    public String getInfoByUsername(@PathVariable String username){

       return  restTemplate.getForObject("http://nacos-demo-server/servers/userInfo/"+username,String.class);
      /* return  nacosServerFeign.getInfoByUsername(username);*/
    }
    @GetMapping("test")
     public String test(){
        return "hello";
    }
    @GetMapping("/test2")
    public String test2(){
        return restTemplate.getForObject("http://providerWZY/provider",String.class);
    }


}
