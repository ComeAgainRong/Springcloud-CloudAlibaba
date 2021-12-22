package zl.xr.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @ClassName: 【 AccountDao 】
 * @Author : XiaoRong
 * @Date : Created in 17:14 2021/12/22
 */
@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId,@Param("money") BigDecimal money);
}
