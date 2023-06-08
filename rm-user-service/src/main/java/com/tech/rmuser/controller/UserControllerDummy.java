package com.tech.rmuser.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.tech.rmuser.entity.User;
//import com.tech.rmuser.service.UserService;



//@RestController
//@RequestMapping("/user")
public class UserControllerDummy {
//
//	@Autowired
//	public UserService userService;
//
//	@GetMapping("/getAll") 
//	public ResponseEntity<List<User>> getAllUser(@RequestParam(required = false) String user) {
//		try {
//			List<User> users = new ArrayList<User>();
//			users = userService.findAllUsers();
//			if (users.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			} else {
//				return new ResponseEntity<>(users, HttpStatus.OK);
//			}
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
//	@GetMapping("/getById/{id}")
//	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
//		Optional<User> tutorialData = userService.findUserById(id);
//		if (tutorialData.isPresent()) {
//			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//	
//	
//	@GetMapping("/getByEmail/{email}") 
//	public ResponseEntity<User> getUserByEmail(@PathVariable("email") String email) {
//		Optional<User> tutorialData = userService.findUserByEmail(email);
//		if (tutorialData.isPresent()) {
//			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//
//	@PostMapping("/create")
//	public ResponseEntity<User> createUser(@RequestBody User user) {
//		try {
//			User userdata = userService.saveUser(new User(
//					user.getId(), user.getFirstName(), user.getLastName(), user.getMobileNumber(), user.getEmail()));
//			return new ResponseEntity<>(userdata, HttpStatus.CREATED);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<HttpStatus> deleteUserById(@PathVariable("id") Integer id) {
//		try {
//			userService.deleteUserById(id);
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
}
