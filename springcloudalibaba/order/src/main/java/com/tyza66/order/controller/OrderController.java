package com.tyza66.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tyza66
 * Date: 2023/04/21 22:01
 * Github: https://github.com/tyza66
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    @RequestMapping("/add")
    public String add() {
        System.out.println("下单成功!");
        return "Hello,World!";
    }
}
