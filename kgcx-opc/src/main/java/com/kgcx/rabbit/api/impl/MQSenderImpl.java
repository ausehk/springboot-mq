package com.kgcx.rabbit.api.impl;

import com.kgcx.rabbit.api.MQSender;
import com.kgcx.rabbit.common.MqMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MQSenderImpl implements MQSender {

	private static final Logger LOGGER = LoggerFactory.getLogger(MQSenderImpl.class);

	@Autowired
    private AmqpTemplate amqpTemplate;

	@Override
	public void sendMessage(MqMessage message, String routingKey) {
		if(message==null){
			LOGGER.warn("消息发送失败：消息为null");
			return;
		}
		if(message.getId()==null){
			message.setId(UUID.randomUUID().toString());
		}
		/*
		* convertAndSend：将Java对象转换为消息发送到匹配Key的交换机中Exchange，由于配置了JSON转换，这里是将Java对象转换成JSON字符串的形式。原文：Convert a Java object to an Amqp Message and send it to a default exchange with a specific routing key.
		*/
		amqpTemplate.convertAndSend(routingKey, message);
		LOGGER.info("send msg success!!!");
	}
}

