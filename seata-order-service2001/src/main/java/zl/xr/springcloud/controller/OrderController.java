package zl.xr.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zl.xr.springcloud.domain.CommonResult;
import zl.xr.springcloud.domain.Order;
import zl.xr.springcloud.service.OrderService;

import javax.annotation.Resource;

/**
 * @ClassName: 【 OrderController 】
 * @Author : XiaoRong
 * @Date : Created in 16:38 2021/12/22
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return  new CommonResult(200,"订单创建成功");
    }
}
