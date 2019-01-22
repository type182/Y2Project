package com;

import org.apache.catalina.core.ApplicationContext;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dao")
public class AppContext {
	public static void main(String[] args) {
		SpringApplication.run(AppContext.class, args);
	}
}
