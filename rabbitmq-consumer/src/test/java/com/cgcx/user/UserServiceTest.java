package com.cgcx.user;

import com.cgcx.BaseTest;
import com.cgcx.send.entity.User;
import com.cgcx.send.query.UserQuery;
import com.cgcx.send.service.UserService;
import com.github.pagehelper.PageHelper;
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
public class UserServiceTest extends BaseTest {

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
