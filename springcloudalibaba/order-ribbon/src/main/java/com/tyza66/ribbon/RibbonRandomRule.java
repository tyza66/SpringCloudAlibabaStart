package com.tyza66.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: tyza66
 * Date: 2023/04/22 14:14
 * Github: https://github.com/tyza66
 **/
@Configuration
public class RibbonRandomRule {
    //方法名一定要叫这个
    @Bean
    public IRule IRule() {
        return new RandomRule();
    }
}
