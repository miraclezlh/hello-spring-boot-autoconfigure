package com.zlh.hello.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性类
 *
 * @author 70635
 */
@Data
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
