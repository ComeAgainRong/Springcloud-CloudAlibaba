package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: 【 StreamMQMain8802 】
 * @Author : XiaoRong
 * @Date : Created in 18:07 2021/12/13
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8802 {
     public static void main(String[] args) {
           SpringApplication.run(StreamMQMain8802.class, args);
      }
     
}
