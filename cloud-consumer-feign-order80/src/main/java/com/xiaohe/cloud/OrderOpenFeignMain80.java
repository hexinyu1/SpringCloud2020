package com.xiaohe.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/17 9:39
 * @Content:
 */
@SpringBootApplication
@EnableFeignClients // 开启Fegin负载均衡
public class OrderOpenFeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignMain80.class, args);
    }

}
