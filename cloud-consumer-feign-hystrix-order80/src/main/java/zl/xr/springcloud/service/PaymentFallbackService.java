package zl.xr.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName: 【 PaymentFallbackService 】
 * @Author : XiaoRong
 * @Date : Created in 22:54 2021/12/11
 */
@Component
public class PaymentFallbackService implements  PaymentHystrixService{
    @Override
    public String paymentInfo_ok(Integer id) {
        return "PaymentFallbackService ----Fallback----paymentInfo_ok";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService ----Fallback----paymentInfo_TimeOut";
    }
}
