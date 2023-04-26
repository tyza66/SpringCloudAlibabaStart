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
        return Arrays.asList("");
    }

    public Predicate<ServerWebExchange> apply(CheckAuthRoutePredicateFactory.Config config) {
        return new GatewayPredicate() {
            public boolean test(ServerWebExchange exchange) {
                return false;
            }
        };
    }

    @Validated
    public static class Config {

    }
}