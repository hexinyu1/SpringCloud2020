package com.xiaohe.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/10 9:46
 * @Content:
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    // @LoadBalanced // 开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
