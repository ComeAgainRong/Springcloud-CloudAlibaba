package zl.xr.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import zl.xr.springcloud.entities.CommonResult;
import zl.xr.springcloud.entities.Payment;

/**
 * @ClassName: 【 PaymentFeignService 】
 * @Author : XiaoRong
 * @Date : Created in 15:52 2021/12/10
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/getId/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
