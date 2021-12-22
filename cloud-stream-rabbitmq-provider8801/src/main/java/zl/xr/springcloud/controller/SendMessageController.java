package zl.xr.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zl.xr.springcloud.service.IMessageService;

import javax.annotation.Resource;

/**
 * @ClassName: 【 SendMessageController 】
 * @Author : XiaoRong
 * @Date : Created in 17:46 2021/12/13
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageService iMessageService;


    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return iMessageService.send();
    }
}
