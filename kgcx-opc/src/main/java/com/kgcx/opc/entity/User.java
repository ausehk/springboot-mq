package com.kgcx.opc.entity;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author
 * @version 0.1
 * @time 2017/9/18 13:19
 * @since 0.1
 */
public class User implements Serializable {
    /**
     * id
     */
    private String id;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
