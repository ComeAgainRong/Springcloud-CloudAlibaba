package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: 【 PaymentMian8004 】
 * @Author : XiaoRong
 * @Date : Created in 21:51 2021/12/9
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMian8004 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMian8004.class, args);
      }

}
