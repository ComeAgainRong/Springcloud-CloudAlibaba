package zl.xr.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import zl.xr.springcloud.Ib.LoadBalancer;
import zl.xr.springcloud.entities.CommonResult;
import zl.xr.springcloud.entities.Payment;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @ClassName: 【 OrderController 】
 * @Author : XiaoRong
 * @Date : Created in 17:18 2021/12/8
 */
@RestController
@Slf4j
@SuppressWarnings("all")
public class OrderController {

    //private static final String PAYMENT_URL="http://localhost:8001";
    private final static String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancer loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
            log.info("进入插入");
            return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/getId/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return  restTemplate.getForObject(PAYMENT_URL+"/payment/getId/"+id,CommonResult.class);
    }
    @GetMapping("/consumer/payment/getForEntityId/{id}")
    public CommonResult<Payment> getPaymentById1(@PathVariable("id") Long id){
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(PAYMENT_URL + "/payment/getId/" + id, CommonResult.class);
        if(forEntity.getStatusCode().is2xxSuccessful()){
            return forEntity.getBody();
        }else{
            return new CommonResult(400,"操作失败");
        }
    }

    @GetMapping(value = "/consumer/payment/lb")
    public String gtePaymentLB(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if(instances == null || instances.size() <=0 ){
            return  null;
        }
        ServiceInstance serviceInstance =loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        return  restTemplate.getForObject(uri+"/payment/lb",String.class);

    }

    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipKin(){
        String result = restTemplate.getForObject( "http://localhost:8001"+"/payment/zipkin/", String.class);
        return  result;
    }


}
