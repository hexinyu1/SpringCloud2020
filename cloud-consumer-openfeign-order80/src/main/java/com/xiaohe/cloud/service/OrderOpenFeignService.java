package com.xiaohe.cloud.service;

import com.xiaohe.cloud.bean.Payment;
import com.xiaohe.cloud.utils.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/17 9:49
 * @Content:
 */
@Component
@FeignClient(value = "cloud-payment-service") // 开启服务调用,value/name:服务名称
public interface OrderOpenFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String getPaymentTimeout();

}
