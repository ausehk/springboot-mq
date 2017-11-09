package com.kgcx.opc.service.impl;

import com.kgcx.opc.entity.User;
import com.kgcx.opc.query.UserQuery;
import com.kgcx.opc.service.UserService;
import com.kgcx.opc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户实现类
 *
 * @author
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
