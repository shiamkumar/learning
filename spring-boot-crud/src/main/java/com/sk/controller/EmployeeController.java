package com.sk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sk.dto.EmployeeDTO;
import com.sk.entity.Employee;
import com.sk.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		try {
			List<Employee> list = employeeService.getEmployees();
			if (list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/employeeById/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		try {
			java.util.Optional<Employee> employee = employeeService.getEmployeeById(id);
			if (employee.isPresent()) {
				return new ResponseEntity<>(employee.get(), HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/employeeByIdAndName/{id}/{name}")
	public ResponseEntity<List<Employee>> getEmployeesByIdAndName(@PathVariable Long id, @PathVariable String name) {
		try {
			List<Employee> list = employeeService.getEmployeeByIdAndName(id, name);
			if (list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
		try {
			return new ResponseEntity<>(employeeService.addEmployee(employeeDTO), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
		try {
			return new ResponseEntity<>(employeeService.updateEmployee(employeeDTO), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable Long id) {
		try {
			java.util.Optional<Employee> employee = employeeService.getEmployeeById(id);
			if (employee.isPresent()) {
				employeeService.deleteEmployee(id);
			}
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
