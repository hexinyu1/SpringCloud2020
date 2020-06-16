package com.xiaohe.cloud;

import com.xiaohe.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: XiaoHe
 * @Date: 2020/6/9 17:24
 * @Content:consumer
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "cloud-payment-service", configuration = MySelfRule.class)// name：服务的名称，configuration：自定义轮询规则的配置类
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

}
