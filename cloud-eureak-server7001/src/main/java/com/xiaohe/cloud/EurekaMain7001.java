package com.xiaohe.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/10 13:56
 * @Content:Eureka注册中心
 */
@SpringBootApplication
@EnableEurekaServer // Eureka服务中心
public class EurekaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }

}
