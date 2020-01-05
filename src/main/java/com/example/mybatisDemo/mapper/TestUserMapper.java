package com.example.mybatisDemo.mapper;

import com.example.mybatisDemo.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestUserMapper {
    List<Users> getUserList();
}
