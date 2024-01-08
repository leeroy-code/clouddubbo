package com.xiaoli.provider.service.impl;

import com.xiaoli.provider.api.HelloService;
import com.xiaoli.provider.dto.HelloDTO;
import org.apache.dubbo.config.annotation.DubboService;


@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public HelloDTO helllo() {
        return new HelloDTO("laoli");
    }
}
