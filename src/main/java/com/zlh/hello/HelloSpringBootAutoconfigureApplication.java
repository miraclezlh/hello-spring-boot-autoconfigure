package com.zlh.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * 启动类
 */
@SpringBootApplication
@ConfigurationPropertiesScan
public class HelloSpringBootAutoconfigureApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootAutoconfigureApplication.class, args);
	}
}
