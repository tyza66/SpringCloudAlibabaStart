package com.tyza66.order.interceptor.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author: tyza66
 * Date: 2023/04/23 10:28
 * Github: https://github.com/tyza66
 **/
public class CustomFeignInterceptor implements RequestInterceptor {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    public void apply(RequestTemplate requestTemplate) {
        //为当前请求头设置参数
        requestTemplate.header("xxx", "xxx");
        //为当前请求头修改参数
        requestTemplate.query("xxx");
        logger.info("feign拦截器");
    }
}
