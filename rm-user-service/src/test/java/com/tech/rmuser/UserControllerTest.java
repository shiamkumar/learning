package com.tech.rmuser;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.tech.rmuser.entity.User;
import com.tech.rmuser.repo.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserControllerTest {

	@Autowired
	private UserRepository repo;

	@Test
	@Order(1)
	public void getAllUsersTest() {
		List<User> users = repo.findAll();
		assertThat(users.size()).isGreaterThan(0);
	}

//	@Test
//	@Order(2)
//	public void getUserByIdTest() {
//		User user = repo.findById(1).get();
//		assertThat(user.getId()).isEqualTo(1);
//	}

/*	@Test
	@Order(3)
	@Rollback(value = false)
	public void createUserTest() {
		User user = User.builder()
				.firstName("Ramesh")
				.lastName("Fadatare")
				.mobileNumber("66666")
				.email("ramesh@gmail.com").build();
		repo.save(user);
		assertThat(user.getId()).isGreaterThan(0);
	} */
	
	@Test
	@Order(4)
	@Rollback(value = false)
	public void deleteUserByIdTest() { 
		repo.deleteById(5);
		assertThat(repo.existsById(5)).isFalse();
	}
	
//	@Test
//	@Order(5)
//	@Rollback(value = false)
//	public void getUserByEmailTest() {
//		User user = null;
//		Optional<User> optionalUser = repo.findByEmail("sama@gmail.com");
//		if (optionalUser.isPresent()) {
//			user = optionalUser.get();
//		}
//		assertThat(user.getFirstName()).isEqualTo("Sam");
//		//assertThat(user).isNull(); //Failure Case
//	}

}
