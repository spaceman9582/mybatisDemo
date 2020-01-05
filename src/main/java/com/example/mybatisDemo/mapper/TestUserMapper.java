package com.example.mybatisDemo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestUserMapper {
    List<Map<String, Object>> getUserList();
}
