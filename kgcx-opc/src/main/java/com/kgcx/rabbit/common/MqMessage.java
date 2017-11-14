package com.kgcx.rabbit.common;

import java.io.Serializable;

/**
 * 消息体
 * @author lic
 */
public class MqMessage implements Serializable {

	private static final long serialVersionUID = -1L;
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

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
	public Object getBody() {
		return body;
	}
	public void setBody(Object body) {
		this.body = body;
	}
	public Object getParams() {
		return params;
	}
	public void setParams(Object params) {
		this.params = params;
	}

}
