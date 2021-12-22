package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: 【 EurekaApplication7001 】
 * @Author : XiaoRong
 * @Date : Created in 21:27 2021/12/8
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7001 {
     public static void main(String[] args) {
           SpringApplication.run(EurekaApplication7001.class, args);
      }

}
