package com.tyza66.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: tyza66
 * Date: 2023/04/23 9:22
 * Github: https://github.com/tyza66
 **/
@Configuration //如果加了@Configuration 就是全局配置 作用于所有的服务方
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
