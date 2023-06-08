package com.test.java8programs.sorting;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeCountByDepartment {
	public static void main(String[] args) {

		List<Employee> employees = EmployeeUtility.getEmployees();

		Map<Integer, Long> empCountByDepartment = employees.stream()
			.collect(Collectors.groupingBy(Employee::getId, Collectors.counting()));
		empCountByDepartment.forEach((k, v) -> System.out.println(k + ":: " + v));

	}
}
