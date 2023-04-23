package com.tyza66.order.controller;

import com.tyza66.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: tyza66
 * Date: 2023/04/21 22:01
 * Github: https://github.com/tyza66
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    StockFeignService stockFeignService;

    @RequestMapping("/add")
    public String add() {
        System.out.println("下单成功!");
        //String forObject = restTemplate.getForObject("http://stock-service/stock/reduce", String.class);
        String reduce = stockFeignService.reduce();
        System.out.println("接收到:" + reduce);
        return "Hello,World!Feign" + reduce;
    }
}
