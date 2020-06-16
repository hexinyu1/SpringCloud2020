package com.xiaohe.cloud.controller;

import com.xiaohe.cloud.bean.Payment;
import com.xiaohe.cloud.lb.MyLoadBalanced;
import com.xiaohe.cloud.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/10 9:46
 * @Content:
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;// 注入restTemplate模板

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private MyLoadBalanced myLoadBalanced;

    // 定义8001地址
    // private static final String URL = "http://localhost:8001";
    private static final String URL = "http://cloud-payment-service";

    @GetMapping(value = "/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        log.debug("***添加数据***");
        return restTemplate.postForObject(URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable(value = "id") Long id) {
        log.debug("***获取数据***");
        return restTemplate.getForObject(URL + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB() {
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        ServiceInstance instances1 = myLoadBalanced.instances(instances);
        return restTemplate.getForObject(instances1.getUri() + "/payment/lb", String.class);
    }

}
