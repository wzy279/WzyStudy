package com.soft.Test1;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableDiscoveryClient
@Reference
public class
ProvidApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProvidApplication.class,args);
    }
}
