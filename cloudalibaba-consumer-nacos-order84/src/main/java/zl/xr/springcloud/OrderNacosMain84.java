package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: 【 OrderNacosMain84 】
 * @Author : XiaoRong
 * @Date : Created in 13:27 2021/12/22
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//<------------------------
public class OrderNacosMain84 {
     public static void main(String[] args) {
           SpringApplication.run(OrderNacosMain84.class, args);
      }
}
