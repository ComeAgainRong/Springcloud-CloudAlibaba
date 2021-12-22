package zl.xr.springcloud.Ib;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName: 【 LoadBalancer 】
 * @Author : XiaoRong
 * @Date : Created in 15:07 2021/12/10
 */
public interface LoadBalancer
{
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
