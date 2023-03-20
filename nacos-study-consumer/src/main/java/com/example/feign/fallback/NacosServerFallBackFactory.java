package com.example.feign.fallback;

import com.example.feign.NacosServerFeign;
import org.example.ResultEntity;
import org.springframework.cloud.openfeign.FallbackFactory;

public class NacosServerFallBackFactory implements FallbackFactory<NacosServerFeign> {
    @Override
    public NacosServerFeign create(Throwable cause) {
        return new NacosServerFeign() {
            @Override
            public String getPost() {
                return "server error ,you can try again later";
            }

            @Override
            public String getUsername(String username) {
                return null;
            }

            @Override
            public ResultEntity test3() {
                return null;
            }

            @Override
            public ResultEntity getUserById(String userId) {
                return ResultEntity.failed("server error ,you can try again later");
            }
        };
    }
}
