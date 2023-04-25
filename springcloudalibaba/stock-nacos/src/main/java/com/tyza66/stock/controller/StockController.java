package com.tyza66.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tyza66
 * Date: 2023/04/21 22:03
 * Github: https://github.com/tyza66
 **/
@RestController
@RequestMapping("/stock")
public class StockController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/reduce")
    public String reduce(){
        System.out.println("扣减库存");
        return "扣减库存," + port;
    }

    @RequestMapping("/reduce2")
    public String reduce2(){
        //int i = 1/0;
        System.out.println("扣减库存");
        return "扣减库存," + port;
    }
}
