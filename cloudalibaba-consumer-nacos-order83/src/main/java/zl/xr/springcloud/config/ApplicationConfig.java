package zl.xr.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: 【 ApplicationConfig 】
 * @Author : XiaoRong
 * @Date : Created in 20:38 2021/12/14
 */
@Configuration
@SuppressWarnings("all")
public class ApplicationConfig {

    @Bean
    @LoadBalanced
    public RestTemplate  getRestTemplate(){
        return new RestTemplate();
    }
}
