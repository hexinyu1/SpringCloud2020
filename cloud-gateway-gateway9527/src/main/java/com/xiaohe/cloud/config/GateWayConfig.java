package com.xiaohe.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:xiaohe
 * @Date:2020-06-27 15:47
 * @Content: GateWay配置路由
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator1(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rote1", // 相当yml中的gateway.routes.id
                // 使用lamboda表达式配置9527访问的路径进行路由
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei"))// 路由到百度新闻地址
                .build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rote2", // 相当yml中的gateway.routes.id
                // 使用lamboda表达式配置9527访问的路径进行路由
                r -> r.path("/guoji")
                        .uri("http://news.baidu.com/guoji"))// 路由到百度新闻地址
                .build();
        return routes.build();
    }

}
