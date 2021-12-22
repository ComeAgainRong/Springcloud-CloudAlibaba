package zl.xr.springcloud;

import org.junit.jupiter.api.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import zl.xr.myrule.MySelfRule;

/**
 * @ClassName: 【 OrderMain80 】
 * @Author : XiaoRong
 * @Date : Created in 17:13 2021/12/8
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
