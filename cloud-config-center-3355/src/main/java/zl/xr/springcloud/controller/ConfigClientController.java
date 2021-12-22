package zl.xr.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: 【 ConfigClientController 】
 * @Author : XiaoRong
 * @Date : Created in 21:24 2021/12/12
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;


    @Value("${server.port}")
    private String ServerPort;

    @RequestMapping("/getServerPort")
    public String getConfigInfo() {
        return "configInfo"+configInfo+"\t"+"ServerPort"+ServerPort;
    }
}
