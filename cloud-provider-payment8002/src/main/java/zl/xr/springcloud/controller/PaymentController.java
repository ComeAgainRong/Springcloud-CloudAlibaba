package zl.xr.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import zl.xr.springcloud.entities.CommonResult;
import zl.xr.springcloud.entities.Payment;
import zl.xr.springcloud.service.PaymentService;
import javax.annotation.Resource;

/**
 * @ClassName: 【 PaymentController 】
 * @Author : XiaoRong
 * @Date : Created in 16:35 2021/12/8
 */
@RestController
@Slf4j
@SuppressWarnings("all")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "payment/create")
    public CommonResult create(@RequestBody  Payment payment){
        boolean bol = paymentService.save(payment);
        log.info("插入结果:{}",bol);
        if(bol){
            return new CommonResult(200,"插入数据成功,serverPort:"+serverPort,bol);
        }
           return new CommonResult(400,"插入数据失败,serverPort:"+serverPort,null);
    }
    @GetMapping(value = "/payment/getId/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment pa = paymentService.getById(id);
         if(pa == null){
            return  new CommonResult(400,"查询不到本id"+id+"数据,serverPort:"+serverPort,null);
        }else{
            return  new CommonResult(200,"查到了,serverPort:"+serverPort,pa);
        }
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }
}
