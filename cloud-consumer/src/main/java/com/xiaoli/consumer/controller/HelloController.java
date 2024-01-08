package com.xiaoli.consumer.controller;


import com.xiaoli.provider.api.HelloService;
import com.xiaoli.provider.dto.HelloDTO;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @GetMapping
    public HelloDTO sayHello(){
        return helloService.helllo();
    }
}
