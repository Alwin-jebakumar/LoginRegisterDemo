package com.loginandregistration.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginandregistration.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}
