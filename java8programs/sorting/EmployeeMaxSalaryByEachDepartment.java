package com.test.java8programs.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeMaxSalaryByEachDepartment {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeUtility.getEmployees();
		
		Map<Integer, Optional<Employee>> maxSalarybyEachDepart = employees
		.stream()
		.collect(Collectors.groupingBy(Employee::getDepartmentId, 
			Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		//maxSalarybyEachDepart.forEach((k,v) -> System.out.println("Max Emp Salry from Each Department:: "+k +":: "+v));
		maxSalarybyEachDepart.entrySet().forEach(map -> {
			System.out.println(map.getKey() + ": " + map.getValue().get().getName()  + ": " + map.getValue().get().getSalary());
		});
		
	}
}
