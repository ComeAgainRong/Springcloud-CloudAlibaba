package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: 【 OrderZkMain80 】
 * @Author : XiaoRong
 * @Date : Created in 22:06 2021/12/9
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderZkMain80.class, args);
      }

}
