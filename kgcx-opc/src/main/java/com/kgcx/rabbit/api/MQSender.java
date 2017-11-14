package com.kgcx.rabbit.api;


import com.kgcx.rabbit.common.MqMessage;

/**
 * 消息发送接口
 * @author lic
 */
public interface MQSender {
    /**
     * 发送消息到指定队列
     * @param message
     * @param routingKey
     */
	void sendMessage(MqMessage message, String routingKey);
}
