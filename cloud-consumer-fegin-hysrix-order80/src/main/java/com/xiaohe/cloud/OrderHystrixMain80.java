package com.xiaohe.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author:xiaohe
 * @Date:2020-06-23 10:32
 * @Content:
 */
@SpringBootApplication
@EnableFeignClients // 开启Fegin服务调用
@EnableHystrix //开启熔断器
public class OrderHystrixMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }

}

