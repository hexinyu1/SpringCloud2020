package com.xiaohe.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/16 14:41
 * @Content: 自定义算法接口
 */
public interface LoadBalanced {

    // 获取当前有多少服务器
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
