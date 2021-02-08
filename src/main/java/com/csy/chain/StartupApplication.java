package com.csy.chain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
@MapperScan("com.csy.chain.mapper")
public class StartupApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartupApplication.class, args);
    }

}
