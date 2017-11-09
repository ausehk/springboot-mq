package com.cgcx.send.service.impl;

import com.cgcx.send.entity.User;
import com.cgcx.send.mapper.UserMapper;
import com.cgcx.send.query.UserQuery;
import com.cgcx.send.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户实现类
 *
 * @author 苏晓蒙
 * @version 0.1
 * @time 2017/9/18 13:20
 * @since 0.1
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(int id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public List<User> queryUserList(UserQuery query) {
        return userMapper.queryUserList(query);
    }
}
