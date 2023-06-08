package com.test.java8programs.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeNthHighestSalary {
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeUtility.getEmployees();
		
		System.out.println("way01");
		Optional<Employee> result02 = employees.stream()
			.sorted(Comparator.comparing(Employee::getSalary).reversed())
			.skip(1)
			.findFirst();
		System.out.println("2nd highest salary:: "+result02.get().getSalary());

			
		System.out.println("way02");
		List<Employee> result03 = employees.stream()
			.sorted(Comparator.comparing(Employee::getSalary).reversed())
			.collect(Collectors.toList());	
		System.out.println("3rd highest salary:: "+result03.get(2).getSalary()); 
		
	}
}
