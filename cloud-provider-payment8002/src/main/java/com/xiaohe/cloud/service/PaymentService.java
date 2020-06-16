package com.xiaohe.cloud.service;

import com.xiaohe.cloud.bean.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/9 14:49
 * @Content:
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}



