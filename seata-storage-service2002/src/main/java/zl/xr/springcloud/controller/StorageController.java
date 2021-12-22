package zl.xr.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zl.xr.springcloud.domain.CommonResult;
import zl.xr.springcloud.service.StorageService;

/**
 * @ClassName: 【 StorageController 】
 * @Author : XiaoRong
 * @Date : Created in 17:07 2021/12/22
 */
@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;
    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
