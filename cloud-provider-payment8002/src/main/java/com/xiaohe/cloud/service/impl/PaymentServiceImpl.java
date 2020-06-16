package com.xiaohe.cloud.service.impl;

import com.xiaohe.cloud.bean.Payment;
import com.xiaohe.cloud.dao.PaymentDao;
import com.xiaohe.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/9 14:51
 * @Content:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}
