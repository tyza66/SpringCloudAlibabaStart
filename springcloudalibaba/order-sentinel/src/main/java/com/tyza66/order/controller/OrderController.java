package com.tyza66.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
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
    /*@Autowired
    RestTemplate restTemplate;*/

    @RequestMapping("/add")
    @SentinelResource(value = "add", blockHandler = "blockAdd")
    public String add() {
        System.out.println("下单成功!");
        /*//远程请求调用 参数:远程调用的地址,相应的数据类型,参数类型
        String forObject = restTemplate.getForObject("http://localhost:8082/stock/reduce", String.class);
        System.out.println("接收到:"+forObject);*/
        return "Hello,World!";
    }

    public String blockAdd(BlockException e) {
        return "流控";
    }
}
