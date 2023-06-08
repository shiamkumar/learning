package com.sk.service;

import java.util.List;
import java.util.Optional;

import com.sk.dto.EmployeeDTO;
import com.sk.entity.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();

	Optional<Employee> getEmployeeById(Long id);

	List<Employee> getEmployeeByIdAndName(Long id, String name);

	Employee addEmployee(EmployeeDTO employeeDTO);

	Employee updateEmployee(EmployeeDTO employeeDTO);

	void deleteEmployee(Long id);
	
}
