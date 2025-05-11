package com.zlh.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * 启动类
 * 自定义配置绑定，方式一(@ConfigurationPropertiesScan)
 */
@SpringBootApplication
//@ConfigurationPropertiesScan
public class HelloSpringBootAutoconfigureApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootAutoconfigureApplication.class, args);
	}
}
