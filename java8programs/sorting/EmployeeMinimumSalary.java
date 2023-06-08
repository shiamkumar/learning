package com.test.java8programs.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeMinimumSalary {
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeUtility.getEmployees();
		
		Optional<Employee> employeeMinSalary = employees
			.stream()
			.min(Comparator.comparing(Employee::getSalary));
		System.out.println(employeeMinSalary);
		
	}
}
