package com.tyza66.seata2.controller;

import com.tyza66.seata2.mapper.ControlNum2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author: tyza66
 * Date: 2023/04/26 7:50
 * Github: https://github.com/tyza66
 **/
@RestController
@RequestMapping("/n1")
public class Num2Controller {
    @Resource
    ControlNum2 controlNum2;

    @RequestMapping("/go")
    public String go(){
        controlNum2.noPass(1);
        //int i = 1/0;
        return "go";
    }
}
