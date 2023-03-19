package com.soft.Test1.controller;


import com.soft.Test1.domain.User;
import com.soft.Test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.example.ResultEntity;
@RestController
@RequestMapping("/provider")
public class UserClientController {

    @Value(value = "${server.port}")
    int port;

    @Autowired
    UserService userService;


    @GetMapping("test")
    public String test(){
        return "hello ,  i am  provider client port:"+port;
    }
    @GetMapping("test3")
    public ResultEntity test3(){
        return ResultEntity.successWithData("1");
    }


    @GetMapping("user/{username}")
    public String getUsers(@PathVariable String username) {
        return "username is "+username;
    }

    @GetMapping("userById/{userId}")
    public ResultEntity getUserById(@PathVariable String userId){
        User user = userService.getUserMessage(userId);
        return ResultEntity.successWithData(user);
    }

}
