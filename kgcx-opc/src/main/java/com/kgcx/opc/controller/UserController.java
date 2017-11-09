package com.kgcx.opc.controller;

import com.kgcx.opc.entity.User;
import com.kgcx.opc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 *
 * @author
 * @version 0.1
 * @time 2017/9/18 13:14
 * @since 0.1
 */
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUserInfo(@PathVariable int id) {
        return userService.queryUserById(id);
    }
}
