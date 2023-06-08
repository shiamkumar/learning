package com.test.java8programs.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleFieldSorting {
	public static void main(String[] args) {

		List<Employee> employees = EmployeeUtility.getEmployees();

		Comparator<Employee> compareByIdAndName = 
				Comparator
				.comparing(Employee::getId)
				.thenComparing(Employee::getName);
				//.reversed(); //If you want reverse order/ descending order

		List<Employee> sortedEmployee =
				employees
				.stream()
				.sorted(compareByIdAndName.reversed())
				.collect(Collectors.toList());
		
		sortedEmployee.forEach(System.out::println);

	}
}
