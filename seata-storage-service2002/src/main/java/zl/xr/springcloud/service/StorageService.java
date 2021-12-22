package zl.xr.springcloud.service;

/**
 * @ClassName: 【 StorageService 】
 * @Author : XiaoRong
 * @Date : Created in 16:59 2021/12/22
 */
public interface StorageService {
    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId,Integer count);
}
