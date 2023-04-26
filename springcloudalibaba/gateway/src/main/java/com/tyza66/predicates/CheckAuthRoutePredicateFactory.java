package com.tyza66.predicates;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.server.ServerWebExchange;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


/**
 * Author: tyza66
 * Date: 2023/04/26 19:13
 * Github: https://github.com/tyza66
 **/
@Component
public class CheckAuthRoutePredicateFactory extends AbstractRoutePredicateFactory<CheckAuthRoutePredicateFactory.Config> {
    public CheckAuthRoutePredicateFactory() {
        super(CheckAuthRoutePredicateFactory.Config.class);
    }

    public List<String> shortcutFieldOrder() {
        return Arrays.asList("name");
    }

    public Predicate<ServerWebExchange> apply(CheckAuthRoutePredicateFactory.Config config) {
        return new GatewayPredicate() {
            public boolean test(ServerWebExchange exchange) {
                if(config.getName().equals("tyza66")){
                    return true;
                }
                return false;
            }
        };
    }

    //用于接受配置文件中断言的信息
    @Validated
    public static class Config {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}