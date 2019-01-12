package com.example.rabbit.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//ʹ��@RabbitListenerע���Ƿ�����������������hello������Ϣʱ�����н��ղ�����
//@RabbitListener��ע���������ʾ�����յ���Ϣ��ʱ�򣬾ͽ���@RabbitHandler�ķ�������
//����ʹ���ĸ������������� MessageConverter ת����Ĳ�������
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }

}
