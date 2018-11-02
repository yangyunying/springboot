package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController2 {
	
	@Value("${name}")
	private String name;
	
	@Value("${age}")
	private Integer age;
	
	@Value("${content}")
	private String content;
	
	@Autowired
	private StudentProperties stuProperties;
	
    @RequestMapping("/hello2")
    public String index() {
        //return name+age;
    	//return content;
    	return stuProperties.getName()+stuProperties.getAge();
    }
}