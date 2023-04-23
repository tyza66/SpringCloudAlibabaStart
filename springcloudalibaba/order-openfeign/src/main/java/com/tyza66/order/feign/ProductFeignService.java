package com.tyza66.order.feign;

import com.tyza66.order.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: tyza66
 * Date: 2023/04/23 9:35
 * Github: https://github.com/tyza66
 **/
//configuration属性制定使用哪个规则
@FeignClient(name = "product-service",path = "/product",configuration = FeignConfig.class)
public interface ProductFeignService {
    @RequestMapping("/{id}")
    public String get(@PathVariable("id") Integer id);
}
