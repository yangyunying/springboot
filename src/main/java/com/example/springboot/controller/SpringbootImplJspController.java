package com.example.springboot.controller;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//修改 @RestController 注解为 @Controller
@Controller
@SpringBootApplication //注意此注解一定要加，否则jsp页面无法加载
public class SpringbootImplJspController {
	
    @RequestMapping("/hellojsp")
    public String index(Model m) {
    	m.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
    	return "hello";
    }
}