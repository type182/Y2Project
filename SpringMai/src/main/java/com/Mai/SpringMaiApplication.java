package com.Mai;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@SpringBootApplication
@MapperScan("com.Mai.dao.Mybatis")
@EnableTransactionManagement
public class SpringMaiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringMaiApplication.class, args);
	}
}
