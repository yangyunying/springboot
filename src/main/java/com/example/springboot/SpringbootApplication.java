package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * 不加下面注解报错：
 * Unable to start EmbeddedWebApplicationContext due to missing EmbeddedServletContainerFactory bean.
 */
@SpringBootApplication
@ServletComponentScan
@Configuration
@EnableAutoConfiguration

@MapperScan("com.example.springboot.mapper")
public class SpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
