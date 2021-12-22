package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: 【 ConfigClientMain3355 】
 * @Author : XiaoRong
 * @Date : Created in 21:21 2021/12/12
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3355 {
     public static void main(String[] args) {
           SpringApplication.run(ConfigClientMain3355.class, args);
      }
     
}
