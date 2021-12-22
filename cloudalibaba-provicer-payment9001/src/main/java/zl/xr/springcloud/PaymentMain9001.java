package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: 【 PaymentMain9001 】
 * @Author : XiaoRong
 * @Date : Created in 19:57 2021/12/14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9001 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain9001.class, args);
      }
     
}
