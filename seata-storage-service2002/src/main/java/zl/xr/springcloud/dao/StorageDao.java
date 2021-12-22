package zl.xr.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: 【 StorageDao 】
 * @Author : XiaoRong
 * @Date : Created in 16:53 2021/12/22
 */
@Mapper
public interface StorageDao {
    //扣减库存
    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
