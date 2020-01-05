package com.example.mybatisDemo.controller;

import com.example.mybatisDemo.mapper.TestUserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController

public class ApiController {

    @Autowired
    SqlSession getSqlsession;

    @RequestMapping("/getUser")
    public List<Map<String, Object>> getUser(){
        List<Map<String, Object>> user_list = new ArrayList<>();


        return getSqlsession.getMapper(TestUserMapper.class).getUserList();
    }

}
