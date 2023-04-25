package com.tyza66.order.feign;

import org.springframework.stereotype.Component;

/**
 * Author: tyza66
 * Date: 2023/04/25 9:03
 * Github: https://github.com/tyza66
 **/
@Component
public class StockFeignServiceFallback implements StockFeignService {
    public String reduce() {
        return "服务1降级了！";
    }

    public String reduce2() {
        return "服务2降级了！";
    }
}
