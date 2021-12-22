package zl.xr.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: 【 PaymentService 】
 * @Author : XiaoRong
 * @Date : Created in 20:24 2021/12/11
 */
@Service
public class PaymentService {
    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池:" + Thread.currentThread().getName() + " paymentInfo_OK,id:" + id + "\t" + "O(∩_∩)O哈哈~";
    }

    /**
     * 超时访问 服务降低
     *
     * @param id
     *  @HystrixCommand -->fallbackMethod(属性) 本接口如果失败 兜底的接口 commandProperties(属性)
     *  @HystrixProperty(commandProperties 属性下的接口) 设置本线程超时时间 如果超过此时间则paymentInfo_TimeOutHandler
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentInfo_TimeOut(Integer id) {
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:" + Thread.currentThread().getName() + " paymentInfo_TimeOut,id:" + id + "\t" +
                "O(∩_∩)O哈哈~  耗时(秒)" ;
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "调用支付接口超时或异常:\t" +"\t当前线程名字"+Thread.currentThread().getName()+"\t当前id为:"+id;

    }
    // 服务熔断

    @HystrixCommand(fallbackMethod ="paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "60"),//失败率达到多少后跳闸 60=60%
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if(id <0){
            throw  new RuntimeException("**** id不能为负数");
        }
        String serialName = IdUtil.simpleUUID();
        return  Thread.currentThread().getName()+"\t"+"调用成功,流水号:"+serialName;
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return  "id 不能为负数，请稍后再试  id:"+id;
    }

}
