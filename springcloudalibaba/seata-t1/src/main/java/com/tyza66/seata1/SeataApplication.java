package com.tyza66.seata1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Author: tyza66
 * Date: 2023/04/26 7:44
 * Github: https://github.com/tyza66
 **/
@SpringBootApplication
@MapperScan("com.tyza66.seata1.mapper")
@EnableFeignClients
public class SeataApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataApplication.class,args);
    }
}
