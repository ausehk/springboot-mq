package com.kgcx.rabbit.config;

import com.kgcx.rabbit.json.FastJsonMessageConverter;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory;

/**
 * @author 何凯
 * @version 0.1
 * @description
 * @time 2017/11/14 16:19
 * @since 0.1
 */
@Configuration
@EnableRabbit
public class ConsumerConfig implements RabbitListenerConfigurer {
    @Bean
    public DefaultMessageHandlerMethodFactory handlerMethodFactory(){
        DefaultMessageHandlerMethodFactory factory=new DefaultMessageHandlerMethodFactory();
        factory.setMessageConverter(new MappingJackson2MessageConverter());
        return factory;
    }
    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar rabbitListenerEndpointRegistrar) {
        rabbitListenerEndpointRegistrar.setMessageHandlerMethodFactory(handlerMethodFactory());
    }
}
