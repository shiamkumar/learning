package com.tech.rminfo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tech.rminfo.entity.User;


@FeignClient(value="RM-USER-SERVICE", url="http://localhost:9001/user")
public interface UserRestService {

	@GetMapping("/getAll")
    public List<User> getAllUser();

	@GetMapping("/getById/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id);
    
	@GetMapping("/getByEmail/{email}") 
	public ResponseEntity<User> getUserByEmail(@PathVariable("email") String email);
	
}
