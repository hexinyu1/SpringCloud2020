package com.xiaohe.cloud.controller;

import com.xiaohe.cloud.bean.Payment;
import com.xiaohe.cloud.service.OrderOpenFeignService;
import com.xiaohe.cloud.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/17 9:50
 * @Content:
 */
@RestController
public class OrderOpenFeignController {

    @Autowired
    private OrderOpenFeignService orderOpenFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable(value = "id") Long id) {
        return orderOpenFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String getPaymentTimeout() {
        return orderOpenFeignService.getPaymentTimeout();
    }

}
