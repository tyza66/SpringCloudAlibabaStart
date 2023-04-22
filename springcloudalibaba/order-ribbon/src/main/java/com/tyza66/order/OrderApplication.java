package com.tyza66.order;

import com.tyza66.ribbon.RibbonRandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Author: tyza66
 * Date: 2023/04/21 22:12
 * Github: https://github.com/tyza66
 **/
@SpringBootApplication
@RibbonClients(value = {
        @RibbonClient(name = "stock-service", configuration = RibbonRandomRule.class)}
)
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    //懒得往配置文件里面写 直接使用bean
    @Bean
    //负载均衡器 默认是轮询
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        RestTemplate build = builder.build();
        return build;
    }
}
