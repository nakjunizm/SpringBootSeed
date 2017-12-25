package com.github.nakjunizm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.nakjunizm.model.User;
import com.github.nakjunizm.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public User getUserByName(String name) {
		return userRepository.findByName(name);
	}

	public User putUser(String name, String departmentId) {
		User user = new User();
		user.setName(name);
		user.setDepartmentId(departmentId);
		return userRepository.save(user);
	}

}
