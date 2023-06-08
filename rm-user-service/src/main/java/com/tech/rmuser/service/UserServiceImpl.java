package com.tech.rmuser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.rmuser.repo.UserRepository;
import com.tech.rmuser.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	@Override
	public List<User> findAllUsers() {
		List<User> users = userRepo.findAll();
		return users;
	}

	@Override
	public Optional<User> findUserById(Integer id) {
		Optional<User> user = userRepo.findById(id);
		return user;
	}

	@Override
	public Optional<User> findUserByEmail(String email) {
		 Optional<User> user = userRepo.findByEmail(email);
		return user;
	}

	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public void deleteUserById(Integer id) {
		userRepo.deleteById(id);
	}


}
