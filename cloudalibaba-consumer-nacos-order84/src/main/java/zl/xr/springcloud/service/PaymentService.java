package zl.xr.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import zl.xr.springcloud.entities.CommonResult;
import zl.xr.springcloud.entities.Payment;
import zl.xr.springcloud.service.Impl.PaymentFallbackService;

/**
 * @ClassName: 【 PaymentService 】
 * @Author : XiaoRong
 * @Date : Created in 14:19 2021/12/22
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

}
