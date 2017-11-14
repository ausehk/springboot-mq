package com.kgcx.rabbit.api.impl;

import com.kgcx.rabbit.common.MqMessage;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 何凯
 * @version 0.1
 * @description
 * @time 2017/11/14 13:57
 * @since 0.1
 */
@Component
@RabbitListener(queues = "apiQueue")
public class MQReceiver{

    @RabbitHandler
    public  void process(MqMessage message){
        System.out.println("message receive  : " + message.getType()+"&"+message.getCreateTime());

    }
}
