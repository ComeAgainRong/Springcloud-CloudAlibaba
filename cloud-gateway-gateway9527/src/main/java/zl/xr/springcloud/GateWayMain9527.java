package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: 【 GateWayMain9527 】
 * @Author : XiaoRong
 * @Date : Created in 14:27 2021/12/12
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
     public static void main(String[] args) {
           SpringApplication.run(GateWayMain9527.class, args);
      }
     
}
