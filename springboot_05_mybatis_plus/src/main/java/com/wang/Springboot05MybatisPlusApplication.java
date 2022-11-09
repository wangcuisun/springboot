package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wang.dao")
public class Springboot05MybatisPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot05MybatisPlusApplication.class, args);
	}

}
