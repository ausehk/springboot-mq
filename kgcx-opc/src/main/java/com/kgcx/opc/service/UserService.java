package com.kgcx.opc.service;



import com.kgcx.opc.entity.User;
import com.kgcx.opc.query.UserQuery;

import java.util.List;


/**
 * 用户业务层
 *
 * @author
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
