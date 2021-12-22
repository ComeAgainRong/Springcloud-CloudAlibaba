package zl.xr.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: 【 PaymentController 】
 * @Author : XiaoRong
 * @Date : Created in 19:58 2021/12/14
 */
@RestController
@SuppressWarnings("all")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "nacos registy,serverPort"+serverPort;
    }
}
