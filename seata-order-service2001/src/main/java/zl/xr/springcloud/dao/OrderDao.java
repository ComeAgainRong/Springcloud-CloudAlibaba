package zl.xr.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import zl.xr.springcloud.domain.Order;

/**
 * @ClassName: 【 OrderDao 】
 * @Author : XiaoRong
 * @Date : Created in 15:56 2021/12/22
 */
@Mapper
public interface OrderDao {

    //1.新建订单
    void create(Order order);

    //2.修改订单状态 从零改为1
    void  update(@Param("userId") Long userId,@Param("status") Integer status);


}
