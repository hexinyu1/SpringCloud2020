package com.xiaohe.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:xiaohe
 * @Date:2020-07-06 10:59
 * @Content:
 */
@RestController
@RefreshScope // 开启监控的自动刷新   修改完配置在cmd中使用curl -X POST "http://localhost:3355/actuator/refresh 发送post请求通知3355
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }

}
