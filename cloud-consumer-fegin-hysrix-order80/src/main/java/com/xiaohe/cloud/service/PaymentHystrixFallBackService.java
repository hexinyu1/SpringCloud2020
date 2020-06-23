package com.xiaohe.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author:xiaohe
 * @Date:2020-06-23 11:21
 * @Content:
 */
@Component // spring容器扫描
public class PaymentHystrixFallBackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentHystrixFallBackService--->paymentInfo_OK--->服务器宕机，请联系管理员";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentHystrixFallBackService--->paymentInfo_TimeOut--->服务器宕机，请联系管理员";
    }
}
