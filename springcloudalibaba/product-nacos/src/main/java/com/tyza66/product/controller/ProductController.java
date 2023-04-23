package com.tyza66.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tyza66
 * Date: 2023/04/23 9:30
 * Github: https://github.com/tyza66
 **/
@RestController
@RequestMapping("/product")
public class ProductController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/{id}")
    public String get(@PathVariable Integer id) {
        System.out.println("查询商品");
        return "查询商品," + id + "," + port;
    }
}
