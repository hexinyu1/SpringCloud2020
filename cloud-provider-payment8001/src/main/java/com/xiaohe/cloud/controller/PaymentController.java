package com.xiaohe.cloud.controller;

import com.xiaohe.cloud.bean.Payment;
import com.xiaohe.cloud.service.PaymentService;
import com.xiaohe.cloud.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/9 14:53
 * @Content:
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("****插入结果:" + result);
        if (result > 0) {
            return new CommonResult<>(200, "插入数据库成功,端口号为：" + port, result);
        } else {
            return new CommonResult<>(400, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果:" + payment);
        if (payment != null) {
            return new CommonResult<>(200, "查询成功,端口号为：" + port, payment);
        } else {
            return new CommonResult<Payment>(400, "没有对应记录，查询ID: " + id, null);
        }
    }

}



