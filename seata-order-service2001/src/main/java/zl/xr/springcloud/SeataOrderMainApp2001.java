package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: 【 SeataOrderMainApp2001 】
 * @Author : XiaoRong
 * @Date : Created in 15:54 2021/12/22
 */
@EnableDiscoveryClient
@EnableFeignClients
//取消数据源的自动创建，而是使用自己定义的
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SeataOrderMainApp2001 {
     public static void main(String[] args) {
           SpringApplication.run(SeataOrderMainApp2001.class, args);
      }
     
}
