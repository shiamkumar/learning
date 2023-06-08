package com.test.java8programs.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMaximumSalary {
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeUtility.getEmployees();
		
		Optional<Employee> employeeMaxSalary02 = employees
			.stream()
			.collect(Collectors.maxBy(
					Comparator.comparing(Employee::getSalary)));
		System.out.println(employeeMaxSalary02);
			 
	}
}
