package com.tyza66.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

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

    @RequestMapping("/testThread")
    //@SentinelResource(value = "testThread", blockHandler = "blockTestThread")
    public String testThread() throws InterruptedException {
        //TimeUnit.SECONDS.sleep(5);
        return "测试成功";
    }

    public String blockTestThread(BlockException e) {
        return "流控1";
    }

    @RequestMapping("/testAll")
    public String testAll()  {
        return "测试全局注解的controller自己执行成功";
    }


    @RequestMapping("/err")
    @SentinelResource(value = "err", blockHandler = "errBlock")
    public String err(){
        int i = 1/0;
        return "giao";
    }

    public String errBlock(BlockException e){
        return "qqq";
    }

    //用于测试热点流控
    @RequestMapping("/get/{id}")
    @SentinelResource(value = "getById", blockHandler = "getByIdHotHandler")
    public String getById(@PathVariable("id") String id){
        return "正常访问";
    }

    public String getByIdHotHandler(@PathVariable("id") String id,BlockException e){
        return "热点";
    }
}