package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: 【 PaymentMain9004 】
 * @Author : XiaoRong
 * @Date : Created in 13:22 2021/12/22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain9004.class, args);
      }
     
}
