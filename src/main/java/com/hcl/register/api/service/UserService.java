package com.hcl.register.api.service;

import com.hcl.register.api.model.User;


public interface UserService {
	void save(User user);
	User findByUsername(String username);
}
