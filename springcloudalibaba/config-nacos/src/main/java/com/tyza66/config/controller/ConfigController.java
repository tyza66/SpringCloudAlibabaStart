package com.tyza66.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tyza66
 * Date: 2023/04/24 9:57
 * Github: https://github.com/tyza66
 **/
@RestController
@RequestMapping("/config")
@RefreshScope //加上这个注解之后就可以动态读取到配置中心远程配置文件中的最新的值
public class ConfigController {
    @Value("${user.name}")
    public String username;

    @RequestMapping("/show")
    public String show(){
        return  username;
    }
}
