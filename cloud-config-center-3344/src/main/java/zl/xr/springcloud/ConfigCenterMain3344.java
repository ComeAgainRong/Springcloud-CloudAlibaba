package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: 【 ConfigCenterMain3344 】
 * @Author : XiaoRong
 * @Date : Created in 20:52 2021/12/12
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
     public static void main(String[] args) {
           SpringApplication.run(ConfigCenterMain3344.class, args);
      }
     
}
