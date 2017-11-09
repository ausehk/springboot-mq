package com.kgcx.query;


import com.kgcx.common.query.BaseQuery;

/**
 * 用户查询条件
 *
 * @author 苏晓蒙
 * @version 0.1
 * @time 2017/9/18 13:29
 * @since 0.1
 */
public class UserQuery extends BaseQuery {

    private String id;

    private String userName;

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
