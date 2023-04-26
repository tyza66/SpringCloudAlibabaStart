package com.tyza66.seata2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: tyza66
 * Date: 2023/04/26 8:52
 * Github: https://github.com/tyza66
 **/
@FeignClient(name = "seata-t2",path = "/n1")
public interface FeignT2 {

    @RequestMapping("/go")
    public String go();
}
