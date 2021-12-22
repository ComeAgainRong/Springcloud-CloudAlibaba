package zl.xr.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @ClassName: 【 ReceiveMessageListenerController 】
 * @Author : XiaoRong
 * @Date : Created in 18:08 2021/12/13
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String ServerPort;


    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("我是消费者1号，-----》接受到的消息是："+message.getPayload()+"\t"+ServerPort);
    }
}
