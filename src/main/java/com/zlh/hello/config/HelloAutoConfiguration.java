package com.zlh.hello.config;

import com.zlh.hello.property.HelloProperties;
import com.zlh.hello.service.HelloService;
import com.zlh.hello.service.impl.HelloServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置装配类
 * 自定义配置绑定，方式二(@EnableConfigurationProperties(HelloProperties.class)+@ConfigurationProperties)
 * @author 70635
 */
@Configuration
//@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnProperty(prefix = "sms", name = "enabled", havingValue = "true", matchIfMissing = true)
public class HelloAutoConfiguration {
    private final HelloProperties helloProperties;

    public HelloAutoConfiguration(HelloProperties helloProperties) {
        System.out.println("构造函数赋值helloProperties-->"+helloProperties);
        this.helloProperties = helloProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService() {
        return new HelloServiceImpl(helloProperties);
    }
}
