package com.cgcx.send.service;


import com.cgcx.send.entity.User;
import com.cgcx.send.query.UserQuery;

import java.util.List;

/**
 * 用户业务层
 *
 * @author 苏晓蒙
 * @version 0.1
 * @time 2017/9/18 13:18
 * @since 0.1
 */
public interface UserService {
    /**
     * 根据ID查询用户信息
     *
     * @param id
     * @return
     */
    User queryUserById(int id);

    /**
     * 分页查询用户信息
     *
     * @param query
     * @return
     */
    List<User> queryUserList(UserQuery query);
}
