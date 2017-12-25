package com.github.nakjunizm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.nakjunizm.model.User;
import com.github.nakjunizm.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public User getUser(@PathVariable String name) {
		return userService.getUserByName(name);
	}
	
	@RequestMapping(value = "/{name}", method = RequestMethod.PUT)
	public User putUser(@PathVariable String name, 
			@RequestParam(value="departmentId", required=true) String departmentId) {
		return userService.putUser(name, departmentId);
	}
}
