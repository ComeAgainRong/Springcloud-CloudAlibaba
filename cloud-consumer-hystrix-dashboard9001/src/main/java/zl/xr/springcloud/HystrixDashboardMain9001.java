package zl.xr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName: 【 HystrixDashboardMain9001 】
 * @Author : XiaoRong
 * @Date : Created in 13:44 2021/12/12
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
     public static void main(String[] args) {
           SpringApplication.run(HystrixDashboardMain9001.class, args);
      }
     
}
