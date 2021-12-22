package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: 【 EurekaApplication7002 】
 * @Author : XiaoRong
 * @Date : Created in 22:15 2021/12/8
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7002 {
     public static void main(String[] args) {
           SpringApplication.run(EurekaApplication7002.class, args);
      }
     
}
