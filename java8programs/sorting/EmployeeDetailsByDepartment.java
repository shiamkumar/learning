package com.test.java8programs.sorting;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDetailsByDepartment {

	public static void main(String[] args) {

		List<Employee> employees = EmployeeUtility.getEmployees();
		
		Map<Integer, List<Employee>> empListBasedDepartment = employees
				.stream()
				.collect(Collectors.groupingBy(
						Employee::getDepartmentId, Collectors.toList()));
		empListBasedDepartment.forEach((k,v) -> System.out.println(k +":: "+v));
		
	}

}
