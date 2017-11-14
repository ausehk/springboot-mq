package com.kgcx.opc.entity;


import java.io.Serializable;

public class Message implements Serializable {

    private static final long serialVersionUID = -295123815695940734L;
    /**
	 * 消息编号,建议使用uuid
	 */
	private String id;
	/**
	 * 消息类型
	 */
	private String type;
	/**
	 * 保留参数c
	 */
	private Object params;
	/**
	 * 消息内容
	 */
	private Object body;
	/**
	 * 消息创建时间
	 */
	private String createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
