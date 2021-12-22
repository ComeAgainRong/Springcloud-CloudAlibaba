package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: 【 MainApp8401 】
 * @Author : XiaoRong
 * @Date : Created in 17:30 2021/12/21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8401 {
     public static void main(String[] args) {
           SpringApplication.run(MainApp8401.class, args);
      }

}
