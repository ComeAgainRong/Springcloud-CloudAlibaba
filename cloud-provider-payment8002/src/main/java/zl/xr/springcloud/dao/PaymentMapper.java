package zl.xr.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import zl.xr.springcloud.entities.Payment;

/**
 * @ClassName: 【 PaymentDao 】
 * @Author : XiaoRong
 * @Date : Created in 15:55 2021/12/8
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

}

