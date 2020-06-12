package com.xiaohe.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/12 14:33
 * @Content:
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/payment/getZk")
    public String getZk() {
        return "springcloud with zookeeper:" + port + "\t" + UUID.randomUUID().toString();
    }

}
