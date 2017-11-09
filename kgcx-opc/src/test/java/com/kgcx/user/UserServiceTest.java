package com.kgcx.user;

import com.github.pagehelper.PageHelper;
import com.kgcx.KgcxOpcApplicationTests;
import com.kgcx.entity.User;
import com.kgcx.query.UserQuery;
import com.kgcx.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 业务测试类
 *
 * @author 苏晓蒙
 * @version 0.1
 * @time 2017/9/12 12:31
 * @since 0.1
 */
public class UserServiceTest extends KgcxOpcApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void queryUserById() {
        User user = userService.queryUserById(2);
        System.out.println(user);

    }

    @Test
    public void queryUserList() {
        UserQuery userQuery = new UserQuery();
        PageHelper.startPage(userQuery.getPageNumber(), userQuery.getPageSize());
        List<User> userList = userService.queryUserList(userQuery);
        System.out.println(userList);

    }
}
