package zl.xr.springcloud.service.Impl;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import zl.xr.springcloud.dao.OrderDao;
import zl.xr.springcloud.domain.Order;
import zl.xr.springcloud.service.AccountService;
import zl.xr.springcloud.service.OrderService;
import zl.xr.springcloud.service.StorageService;

import javax.annotation.Resource;

/**
 * @ClassName: 【 OrderServiceImp 】
 * @Author : XiaoRong
 * @Date : Created in 16:15 2021/12/22
 */
@Service
@Slf4j
public class OrderServiceImp implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说：下订单->扣库存->减余额->改状态
     */
    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("----->开始新建订单");
        //1 新建订单
        orderDao.create(order);
        log.info("------>订单微服务开始调用库存，做扣减Count");
        //order.getProductId() 产品 order.getCount()数量 库存扣数量
        //2 扣减库存
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("----->订单微服务开始调用库存,做扣减Money");
        //order.getUserId() 用户账号 order.getMoney() 钱 账户扣钱
        //3 扣减账户的钱
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("----->订单微服务开始调用库存,做扣减end");
        //4.修改订单状态 从零到1 ，1代表已经完成
        log.info("----->修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("----->修改订单状态结束");
        log.info("---->下订单结束了");
    }
}
