package com.tyza66.seata2.controller;

import com.tyza66.seata2.feign.FeignT2;
import com.tyza66.seata2.mapper.ControlNum1;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
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
public class Num1Controller {
    @Autowired
    FeignT2 feignT2;

    @Resource
    ControlNum1 controlNum1;

    @GlobalTransactional
    @RequestMapping("/go")
    public String go(){
        controlNum1.noPass(1);
        feignT2.go();
        return "go";
    }
}
