package com.tyza66.seata1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tyza66
 * Date: 2023/04/26 7:50
 * Github: https://github.com/tyza66
 **/
@RestController
@RequestMapping("/n1")
public class Num1Controller {

    @RequestMapping("/go")
    public String go(){
        return "go";
    }
}
