package zl.xr.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: 【 ApplicationContextConfig 】
 * @Author : XiaoRong
 * @Date : Created in 17:21 2021/12/8
 */
@Configuration
public class ApplicationContextConfig {


    @Bean
    @LoadBalanced //开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
