package com.test.java8programs.sorting;

import java.util.Arrays;
import java.util.List;

public class EmployeeUtility {
	public static List<Employee> getEmployees() {
		Employee emp1 = new Employee(1, "Peter", 20000, 100001);
		Employee emp2 = new Employee(3, "Sam", 90000, 100003);
		Employee emp3 = new Employee(5, "Jack", 70000, 100007);
		Employee emp4 = new Employee(4, "Hari", 50000, 100005);
		Employee emp5 = new Employee(2, "Lucky", 30000, 100005);
		Employee emp6 = new Employee(7, "Ravi", 40000, 100003);
		Employee emp7 = new Employee(5, "john", 120000, 100001);
		return Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7);
	}
}
