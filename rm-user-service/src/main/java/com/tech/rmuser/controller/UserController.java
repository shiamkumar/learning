package com.tech.rmuser.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tech.rmuser.entity.User;
import com.tech.rmuser.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserService userService;

	@GetMapping("/getAll")
	public List<User> getAllUser(@RequestParam(required = false) String user) {
		return userService.findAllUsers();
	}

	@GetMapping("/getById/{id}")
	public Optional<User> getUserById(@PathVariable("id") Integer id) {
		return userService.findUserById(id);
	}

	@GetMapping("/getByEmail/{email}")
	public Optional<User> getUserByEmail(@PathVariable("email") String email) {
		return userService.findUserByEmail(email);
	}

	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUserById(@PathVariable("id") Integer id) {
		userService.deleteUserById(id);
		String message = "Record was deleted successfully";
		return message;
	}

}
