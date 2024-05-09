package com.loginandregistration.service;

import java.util.List;

import com.loginandregistration.dto.UserDto;
import com.loginandregistration.entity.User;

public interface UserService {
	
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
    
}
