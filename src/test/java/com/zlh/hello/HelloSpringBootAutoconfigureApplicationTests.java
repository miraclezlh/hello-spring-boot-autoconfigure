package com.zlh.hello;

import com.zlh.hello.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringBootAutoconfigureApplicationTests {

	@Autowired
	private HelloService helloService ;

	@Test
	void contextLoads() {
		helloService.send("hello world");
	}
}
