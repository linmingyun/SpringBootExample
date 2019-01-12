package com.example.rabbit.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//使用@RabbitListener注解标记方法，当监听到队列hello中有消息时则会进行接收并处理
//@RabbitListener标注在类上面表示当有收到消息的时候，就交给@RabbitHandler的方法处理，
//具体使用哪个方法处理，根据 MessageConverter 转换后的参数类型
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }

}
