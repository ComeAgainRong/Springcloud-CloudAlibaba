package zl.xr.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"zl.xr.springcloud.dao"})
public class MyBatisConfig {
}
