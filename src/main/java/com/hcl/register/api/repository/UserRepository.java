package com.hcl.register.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.register.api.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User findByUsername(String username);

}
