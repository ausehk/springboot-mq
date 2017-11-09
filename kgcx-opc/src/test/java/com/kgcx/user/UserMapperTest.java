package com.kgcx.user;

import com.github.pagehelper.PageHelper;
import com.kgcx.KgcxOpcApplicationTests;
import com.kgcx.opc.entity.User;
import com.kgcx.opc.mapper.user.UserMapper;
import com.kgcx.opc.query.UserQuery;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 用户持久化测试
 *
 * @author 苏晓蒙
 * @version 0.1
 * @time 2017/9/12 12:04
 * @since 0.1
 */
public class UserMapperTest extends KgcxOpcApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void queryUserById() {
        User userVo = userMapper.queryUserById(2);
        System.out.println(userVo);
    }

    @Test
    public void queryUserList() {
        UserQuery userQuery = new UserQuery();
        PageHelper.startPage(userQuery.getPageNumber(), userQuery.getPageSize());
        List<User> userList = userMapper.queryUserList(userQuery);
        System.out.println(userList);
    }

}
