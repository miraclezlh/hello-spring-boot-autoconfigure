package com.zlh.hello.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 属性类
 * 自定义配置绑定，方式三(@ConfigurationProperties+@Component)
 *
 * @author 70635
 */
@Data
@Component
@ConfigurationProperties(prefix = "sms")
public class HelloProperties {
    /**
     * 发送的消息
     */
    private String message;
    /**
     * 是否开启
     */
    private boolean enabled;
}
