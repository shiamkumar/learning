package com.test.java8programs.sorting;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeAverageSalary {
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeUtility.getEmployees();
		
		Map<Integer, Double> employeeAvgSalary = employees
			.stream()
			.collect(Collectors.groupingBy(
				Employee::getSalary, Collectors.averagingInt(Employee::getSalary)));
		 employeeAvgSalary.forEach((k,v) -> System.out.println(k +":: "+v));
		 
	}
}
