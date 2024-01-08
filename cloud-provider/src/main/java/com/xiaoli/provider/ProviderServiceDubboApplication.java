package com.xiaoli.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.xiaoli.provider.service.impl")
public class ProviderServiceDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderServiceDubboApplication.class, args);
    }

}
