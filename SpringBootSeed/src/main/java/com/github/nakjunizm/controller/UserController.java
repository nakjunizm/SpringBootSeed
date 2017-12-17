package com.github.nakjunizm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.nakjunizm.model.User;
import com.github.nakjunizm.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	public User getUser(@PathVariable Long userId) {
		
		return userService.getUserByUserId(userId);
	}
}
