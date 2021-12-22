package zl.xr.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import zl.xr.springcloud.entities.CommonResult;

/**
 * @ClassName: 【 CustomerBlockHandler 】
 * @Author : XiaoRong
 * @Date : Created in 21:50 2021/12/21
 */
@SuppressWarnings("all")
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
