package com.tech.rmuser.service;

import java.util.List;
import java.util.Optional;

import com.tech.rmuser.entity.User;


public interface UserService {

	public List<User> findAllUsers();

	public Optional<User> findUserById(Integer id);

	public User saveUser(User user);

	public void deleteUserById(Integer id);

	public Optional<User> findUserByEmail(String email);
	
}
