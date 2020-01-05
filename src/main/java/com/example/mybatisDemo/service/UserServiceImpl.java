package com.example.mybatisDemo.service;

import com.example.mybatisDemo.mapper.TestUserMapper;
import com.example.mybatisDemo.model.Users;
import com.example.mybatisDemo.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private TestUserMapper testUserMapper;

    @Autowired
    SqlSession getSqlsession;

    @Autowired
    SqlSessionFactory masterSqlSessionFactory;
    @Override
    public List<Users> getUserList() {
        return getSqlsession.getMapper(TestUserMapper.class).getUserList();
//        return testUserMapper.getUserList();
//        return getSqlsession.getMapper(testUserMapper.getClass()).getUserList();
    }
}
