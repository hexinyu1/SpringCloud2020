package com.xiaohe.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/15 14:56
 * @Content:
 */
@SpringBootApplication
@EnableDiscoveryClient // zookeeper和 consul需要
public class PaymentConsulMain8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulMain8006.class, args);
    }

}
