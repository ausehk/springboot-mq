package com.kgcx.opc.query;


import com.kgcx.opc.common.query.BaseQuery;

/**
 * class_name: UserQuery
 * package: com.kgcx.query
 * describe: TODO
 * creat_user: 何凯
 * creat_date: 2017/11/9
 * creat_time: 21:16
**/
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
