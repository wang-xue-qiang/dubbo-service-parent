package com.zkh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zkh.bean.User;
import com.zkh.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	

	@RequestMapping(value="getUser")
	public void findById(String id){
		User user = userService.findById(id);
		System.out.println("=="+user);	
	}
}
