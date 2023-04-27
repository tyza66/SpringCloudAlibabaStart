package com.tyza66.cofig;

import io.netty.handler.codec.http.cors.CorsConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.util.pattern.PathPatternParser;

/**
 * Author: tyza66
 * Date: 2023/04/27 9:37
 * Github: https://github.com/tyza66
 **/
@Configuration
public class MyCorsConfig {
    @Bean
    public CorsWebFilter corsFilter(){
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedMethod("*");  //允许的method
        config.addAllowedOrigin("*");  //允许的来源
        config.addAllowedHeader("*");  //允许的请求头
        //允许访问的资源
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(new PathPatternParser());
        source.registerCorsConfiguration("/**",config);
        return new CorsWebFilter(source);
    }
}
