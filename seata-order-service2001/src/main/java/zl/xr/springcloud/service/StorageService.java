package zl.xr.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import zl.xr.springcloud.domain.CommonResult;

/**
 * @ClassName: 【 StorageService 】
 * @Author : XiaoRong
 * @Date : Created in 16:14 2021/12/22
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
