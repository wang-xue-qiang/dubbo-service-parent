package com.zkh.service.impl;

import org.springframework.stereotype.Service;

import com.zkh.bean.User;
import com.zkh.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Override
	public User findById(String id) {
		User user = new User(id,"wxq","17521582785");
		return user;
	}

}
