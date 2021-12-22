package zl.xr.springcloud.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import zl.xr.springcloud.dao.PaymentMapper;
import zl.xr.springcloud.entities.Payment;
import zl.xr.springcloud.service.PaymentService;

/**
 * @ClassName: 【 PaymentServiceImp 】
 * @Author : XiaoRong
 * @Date : Created in 16:13 2021/12/8
 */
@Service
public class PaymentServiceImp extends ServiceImpl<PaymentMapper,Payment> implements PaymentService {

}
