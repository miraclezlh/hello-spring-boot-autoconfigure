package com.zlh.hello.service.impl;

import com.zlh.hello.property.HelloProperties;
import com.zlh.hello.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * 消息发送Service
 *
 * @author 70635
 */
@Service
public class HelloServiceImpl implements HelloService {
    private final HelloProperties helloProperties ;

    public HelloServiceImpl(HelloProperties helloProperties) {
        this.helloProperties=helloProperties;
    }

    @Override
    public void send(String message) {
        System.out.println(helloProperties.getMessage());
        System.out.println(message);
    }
}
