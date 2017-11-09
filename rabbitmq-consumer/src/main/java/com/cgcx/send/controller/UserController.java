package com.cgcx.send.controller;

import com.cgcx.send.entity.User;
import com.cgcx.send.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 *
 * @author 苏晓蒙
 * @version 0.1
 * @time 2017/9/18 13:14
 * @since 0.1
 */
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public User getUserInfo(int id) {
        return userService.queryUserById(id);
    }
}
