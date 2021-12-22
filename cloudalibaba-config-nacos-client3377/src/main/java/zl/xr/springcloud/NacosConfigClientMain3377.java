package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: 【 NacosConfigClientMain3377 】
 * @Author : XiaoRong
 * @Date : Created in 10:09 2021/12/15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
     public static void main(String[] args) {
           SpringApplication.run(NacosConfigClientMain3377.class, args);
      }
     
}
