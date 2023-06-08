package com.test.java8programs.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ZEmployeeDetailsSortingUsingList {
	public static void main(String[] args) {
		Customer e1 = new Customer(1001, "Jack", 23, 30000, "Male", "Accounts");
		Customer e2 = new Customer(1002, "Peter", 43, 50000, "Female", "IT");
		Customer e3 = new Customer(1003, "Kelly", 44, 20000, "Male", "Accounts");
		Customer e4 = new Customer(1004, "John", 22, 120000, "Female", "Accounts");
		Customer e5 = new Customer(1005, "Scott", 21, 70000, "Male", "IT");

		List<Customer> empList = Arrays.asList(e1, e2, e3, e4, e5);
		
		System.out.println("Sorted Employee List");
		List<Customer> sortedEmpList = empList.stream()
				.sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.collect(Collectors.toList());
		sortedEmpList.forEach(System.out::println);

		System.out.println("Male Employee List");
		List<Customer> maleEmpList = empList.stream()
				.filter(emp -> emp.getGender() == "Male")
				.collect(Collectors.toList());
		maleEmpList.forEach(System.out::println);

		System.out.println("Female Employee List");
		List<Customer> femaleEmpList = empList.stream()
				.filter(emp -> emp.getGender() == "Female")
				.collect(Collectors.toList());
		femaleEmpList.forEach(System.out::println);

		System.out.println("Senior Employee List");
		List<Customer> seniorEmpList = empList.stream()
				.filter(emp -> emp.getAge() > 40)
				.collect(Collectors.toList());
		for (Customer emp : seniorEmpList) {
			System.out.println(emp.getName() + "_" + emp.getAge() + "_" + emp.getSalary());
		}

		System.out.println("GroupedBy Depart List");
		Map<String, List<Customer>> groupedByDepartList = empList.stream()
				.collect(Collectors.groupingBy(Customer::getDepartment, Collectors.toList()));
		System.out.println(groupedByDepartList);

		Map<String, Set<Customer>> res = empList.stream()
				.collect(Collectors.groupingBy(Customer::getDepartment, Collectors.toSet()));
		System.out.println(res);
	}
}
