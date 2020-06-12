package com.xiaohe.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/12 14:42
 * @Content:
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    public static final String URL = "http://cloud-provider-zk-payment";

    @RequestMapping(value = "/consumer/order/zk")
    public String getZKInfo() {
        return restTemplate.getForObject(URL + "/payment/getZk", String.class);
    }

}
