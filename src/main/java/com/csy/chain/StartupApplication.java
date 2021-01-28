package com.csy.chain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class StartupApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartupApplication.class, args);
    }

}
