package com.xiaohe.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/16 10:52
 * @Content:自定义ribbon轮询的规则配置类
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();// 随机
    }

}
