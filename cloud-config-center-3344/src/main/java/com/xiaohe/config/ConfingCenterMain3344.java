package com.xiaohe.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author:xiaohe
 * @Date:2020-07-06 10:24
 * @Content:
 */
@SpringBootApplication
@EnableConfigServer // 开启配置中心
public class ConfingCenterMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfingCenterMain3344.class,args);
    }

}
