package zl.xr.springcloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zl.xr.springcloud.dao.PaymentMapper;
import zl.xr.springcloud.entities.Payment;

/**
 * @ClassName: 【 PaymentDaoTest 】
 * @Author : XiaoRong
 * @Date : Created in 16:06 2021/12/8
 */
@SpringBootTest
public class PaymentDaoTest {

    @Autowired
    private PaymentMapper paymentDao;


    @Test
    public void test(){
        Payment payment = paymentDao.selectById(1);
        System.out.println(payment.getSerial());
    }

}
