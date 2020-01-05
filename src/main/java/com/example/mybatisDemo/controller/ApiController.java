package com.example.mybatisDemo.controller;

import com.example.mybatisDemo.mapper.TestUserMapper;
import com.example.mybatisDemo.model.Users;
import com.example.mybatisDemo.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    SqlSession getSqlsession;

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public List<Users> getUser(){
        List<Users> user_list = new ArrayList<Users>();
        return getSqlsession.getMapper(TestUserMapper.class).getUserList();
//        return userService.getUserList();
    }

}
