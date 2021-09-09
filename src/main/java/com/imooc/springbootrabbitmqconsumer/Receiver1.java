package com.imooc.springbootrabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 描述：消费者1
 */
@Component
@RabbitListener(queues = "queue1")//使用这个注解指定用哪个队列
public class Receiver1 {

    //@RabbitHandler意思是收到这个消息后怎么处理
    @RabbitHandler
    public void process(String message){
        System.out.println("Receiver1:"+message);
    }

}
