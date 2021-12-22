package zl.xr.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: 【 ConfigController 】
 * @Author : XiaoRong
 * @Date : Created in 15:39 2021/12/13
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${config.info}")
    private String configInfo;


    @Value("${server.port}")
    private String ServerPort;

    @RequestMapping("/getServerPort")
    public String getConfigInfo() {
        return "configInfo"+configInfo+"\t"+"ServerPort"+ServerPort;
    }
}
