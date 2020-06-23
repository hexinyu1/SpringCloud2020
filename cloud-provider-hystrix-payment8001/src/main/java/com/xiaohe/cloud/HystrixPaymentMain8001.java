package com.xiaohe.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author:xiaohe
 * @Date:2020-06-22 16:25
 * @Content:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker //启动断路器
public class HystrixPaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixPaymentMain8001.class, args);
    }

}
