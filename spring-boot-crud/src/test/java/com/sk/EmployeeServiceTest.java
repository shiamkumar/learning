package com.sk;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sk.entity.Employee;
import com.sk.repository.EmployeeRepository;
import com.sk.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

	@Mock
	private EmployeeRepository empRepository;

	@InjectMocks
	private EmployeeService empService;

	private Employee employee;

	@BeforeEach
	public void setUp() {
	}

	@Test
	void when_no_cats_return_empty_list() {
		Mockito.when(empRepository.findAll()).thenReturn(emptyList());
		Optional<Employee> empsFromDB = empService.getEmployeeById(1L);
		assertTrue(empsFromDB.isEmpty());
	}

	List<Employee> emptyList() {
		// TODO Auto-generated method stub
		return null;
	}
}
