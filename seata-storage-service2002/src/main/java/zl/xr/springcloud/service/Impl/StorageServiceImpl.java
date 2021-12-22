package zl.xr.springcloud.service.Impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import zl.xr.springcloud.dao.StorageDao;
import zl.xr.springcloud.service.StorageService;

import javax.annotation.Resource;

/**
 * @ClassName: 【 StorageServiceImpl 】
 * @Author : XiaoRong
 * @Date : Created in 17:00 2021/12/22
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        log.info("------->storage-service中扣减库存结束");
    }
}
