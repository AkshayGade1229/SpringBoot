package com.rt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value ="classpath:DemoApplication.properties")
@SpringBootApplication
public class Starter {

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}

}
