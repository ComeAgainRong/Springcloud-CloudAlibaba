package zl.xr.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import zl.xr.springcloud.domain.CommonResult;

import java.math.BigDecimal;

/**
 * @ClassName: 【 AccountService 】
 * @Author : XiaoRong
 * @Date : Created in 16:14 2021/12/22
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
