package com.soft.Test1.mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft.Test1.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    public List<User> listAllByUserIdAndUserId(@Param("userId")Integer userId);

    List<User> findAllByUserId(@Param("userId")Integer userId);




}