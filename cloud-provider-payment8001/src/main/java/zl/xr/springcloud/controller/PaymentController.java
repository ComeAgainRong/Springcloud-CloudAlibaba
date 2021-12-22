package zl.xr.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import zl.xr.springcloud.entities.CommonResult;
import zl.xr.springcloud.entities.Payment;
import zl.xr.springcloud.service.PaymentService;
import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: 【 PaymentController 】
 * @Author : XiaoRong
 * @Date : Created in 16:35 2021/12/8
 */
@RestController
@Slf4j
@SuppressWarnings("all")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "payment/create")
    public CommonResult create(@RequestBody  Payment payment){
        boolean bol = paymentService.save(payment);
        log.info("插入结果:{}",bol);
        if(bol){
            return new CommonResult(200,"插入数据成功,serverPort:"+serverPort,bol);
        }
           return new CommonResult(400,"插入数据失败,serverPort:"+serverPort,null);
    }
    @GetMapping(value = "/payment/getId/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment pa = paymentService.getById(id);
         if(pa == null){
            return  new CommonResult(400,"查询不到本id"+id+"数据,serverPort:"+serverPort,null);
        }else{
            return  new CommonResult(200,"查到了,serverPort:"+serverPort,pa);
        }
    }
    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("***element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return  serverPort;
    }
    @GetMapping(value = "/payment/zipkin")
    public String paymentZipkin() {
        return "hi,i`am paymentzipkin server fall back.welcome to atguigu.hahahahahhahahah";
    }
}
