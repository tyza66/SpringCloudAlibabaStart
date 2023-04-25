package com.tyza66.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: tyza66
 * Date: 2023/04/23 8:52
 * Github: https://github.com/tyza66
 **/
/*这里的feign接口要和服务端的接口一一对应
* 声明完feign接口之后不需要写实现类
* openfeign和mybatis一样使用的是动态代理
 */
//这里的name制定的是需要调用的rest接口属于哪个服务
    //path指的是我们要调用的rest接口所在的RequestMapping 如果没有制定就不用去写
@FeignClient(name = "stock-service",path = "/stock")
public interface StockFeignService {
    //声明需要调用的接口对应的方法
    @RequestMapping("/reduce")
    String reduce();
}
