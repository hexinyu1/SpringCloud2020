package com.xiaohe.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/12 14:32
 * @Content:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentZKMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZKMain8004.class,args);
    }

}
