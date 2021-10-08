package com.study.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.study.service.HelloService;

/**
 *
 **/
@Service
public class sayHello implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello..."+name;
    }
}
