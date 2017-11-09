package com.kgcx.opc.mapper;

import com.kgcx.opc.entity.User;
import com.kgcx.opc.query.UserQuery;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * 用户持久化层
 *
 * @author
 * @version 0.1
 * @time 2017/9/18 13:16
 * @since 0.1
 */
@Component
public interface UserMapper {
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
