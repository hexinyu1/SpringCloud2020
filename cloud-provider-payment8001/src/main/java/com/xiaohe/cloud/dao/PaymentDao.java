package com.xiaohe.cloud.dao;

import com.xiaohe.cloud.bean.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/9 14:43
 * @Content:
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}



