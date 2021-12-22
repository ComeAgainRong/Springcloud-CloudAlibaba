package zl.xr.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zl.xr.springcloud.entities.CommonResult;
import zl.xr.springcloud.entities.Payment;
import zl.xr.springcloud.service.PaymentFeignService;

import javax.annotation.Resource;

/**
 * @ClassName: 【 OderFeginController 】
 * @Author : XiaoRong
 * @Date : Created in 15:59 2021/12/10
 */
@RestController
@Slf4j
public class OderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/getId/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        return  paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openFeign -ribbon  客户端默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
