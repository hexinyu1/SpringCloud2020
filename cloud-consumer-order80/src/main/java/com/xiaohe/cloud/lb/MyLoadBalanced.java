package com.xiaohe.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/16 14:44
 * @Content:
 */
@Component
public class MyLoadBalanced implements LoadBalanced {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int getIntace() {
        int current;
        int index;
        do {
            // 获取当前第几个服务器
            current = this.atomicInteger.get();
            // 第几次访问
            index = current >= 2147483647 ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, index));// 退出循环
        System.out.println("-------第" + index + "次访问，次数：" + index + "-------");
        return index;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getIntace() % serviceInstances.size();// 计算访问第几个服务
        return serviceInstances.get(index);
    }

}
