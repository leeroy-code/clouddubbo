package com.xiaoli.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ConsumerServiceDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServiceDubboApplication.class, args);
    }

}
