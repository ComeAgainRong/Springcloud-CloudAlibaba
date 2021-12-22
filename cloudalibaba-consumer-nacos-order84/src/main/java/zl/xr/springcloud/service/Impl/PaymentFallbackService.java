package zl.xr.springcloud.service.Impl;

import org.springframework.stereotype.Service;
import zl.xr.springcloud.entities.CommonResult;
import zl.xr.springcloud.entities.Payment;
import zl.xr.springcloud.service.PaymentService;

/**
 * @ClassName: 【 PaymentFallbackService 】
 * @Author : XiaoRong
 * @Date : Created in 14:22 2021/12/22
 */
@Service
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
