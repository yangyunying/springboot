package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.pojo.User;

@Controller
//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
//本来应该到success.jsp页面的，则其显示success.
//@RestController
@SpringBootApplication
public class UserController {
	@Autowired
	UserMapper userMapper;

	@RequestMapping("/listUser")
	public String listStudent(Model model) {
		List<User> users = userMapper.findAll();
		model.addAttribute("users", users);
		return "listUser";
	}
}
