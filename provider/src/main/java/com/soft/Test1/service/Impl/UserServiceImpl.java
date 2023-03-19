package com.soft.Test1.service.Impl;

import com.soft.Test1.domain.User;
import com.soft.Test1.mapper.UserMapper;
import com.soft.Test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserMessage(String userId) {
        return userMapper.selectById(userId);
    }
}
