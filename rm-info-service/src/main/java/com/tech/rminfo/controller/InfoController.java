package com.tech.rminfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.rminfo.service.UserRestService;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
    private UserRestService userService;
	
	@GetMapping("/getAllUserInfo")
	public String getAllUserInfo() {
		return "Accessing from RM-USER-SERVICE ==> " + userService.getAllUser();
	}
	
	@GetMapping("/getUserByIdInfo/{id}")
	public String getUserByIdInfo(@PathVariable Integer id) {
		return "Accessing from RM-USER-SERVICE ==> " + userService.getUserById(id);
	}
	
	@GetMapping("/getUserByEmailInfo/{email}")
	public String getUserByEmailInfo(@PathVariable("email") String email) {
		return "Accessing from RM-USER-SERVICE ==> " + userService.getUserByEmail(email);
	}
		
}
