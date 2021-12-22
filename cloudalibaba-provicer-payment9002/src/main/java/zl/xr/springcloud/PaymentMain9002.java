package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: 【 PaymentMain9002 】
 * @Author : XiaoRong
 * @Date : Created in 20:09 2021/12/14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain9002.class, args);
      }
     
}
