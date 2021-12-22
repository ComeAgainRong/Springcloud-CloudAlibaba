package zl.xr.springcloud.service.Impl;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import zl.xr.springcloud.service.IMessageService;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.UUID;


/**
 * @ClassName: 【 IMessageServiceImp 】
 * @Author : XiaoRong
 * @Date : Created in 17:38 2021/12/13
 */
@EnableBinding(Source.class) //定义消息推送管道
public class IMessageServiceImp implements IMessageService {
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial= UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial"+serial);
        return serial;
    }
}
