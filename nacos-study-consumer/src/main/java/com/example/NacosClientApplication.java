package com.example;

import com.alibaba.cloud.nacos.loadbalancer.NacosLoadBalancerClientConfiguration;
import com.example.config.DefaultFeignConfiguration;
import com.example.feign.fallback.NacosServerFallBackFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(defaultConfiguration = DefaultFeignConfiguration.class)
@EnableWebMvc
@LoadBalancerClient(value = "providerWZY",configuration = NacosLoadBalancerClientConfiguration.class)
public class NacosClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosClientApplication.class,args);

    }
    @Bean
    @LoadBalanced//开启负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


    @Bean
    NacosServerFallBackFactory providerClientFallBackFactory(){
        return new NacosServerFallBackFactory();
    }



}
