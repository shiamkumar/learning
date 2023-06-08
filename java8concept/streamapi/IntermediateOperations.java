package com.test.java8concept.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntermediateOperations {
	public static void main(String[] args) {

		System.out.println("***** Using Streams API - filter() *****");
		 List<Integer> filter = CustomerUtility.getCustomers()
			.stream()
			.filter(customer -> customer.getId() > 102)
			.map(cust -> cust.getId())
			.collect(Collectors.toList());
		//filter.forEach(System.out::println);
		System.out.println(filter);

		System.out.println("***** Using Streams API - map() *****");
		List<String> map = CustomerUtility.getCustomers()
			.stream()
			.map(customer -> customer.getEmail().toUpperCase())
			.collect(Collectors.toList());
		System.out.println(map);
		
		System.out.println("***** Using Streams API - flatMap() *****");
		List<String> flatMap = CustomerUtility.getCustomers()
			.stream()
			.flatMap(customer -> customer.getPhoneNumbers().stream())
			.collect(Collectors.toList());
		System.out.println(flatMap);

		System.out.println("***** Using Streams API - distinct() *****");
		List<Integer> distinct = CustomerUtility.getCustomers()
			.stream()
			.map(Customer::getId).distinct()
			.collect(Collectors.toList());
		System.out.println(distinct);

		System.out.println("***** Using Streams API - limit() *****");
		List<String> limit = CustomerUtility.getCustomers()
			.stream()
			.map(product -> product.getName()).limit(3)
			.collect(Collectors.toList());
		System.out.println(limit);

		System.out.println("***** Using Streams API - skip() *****");
		List<String> skip = CustomerUtility.getCustomers()
			.stream()
			.map(product -> product.getName()).skip(2)
			.collect(Collectors.toList());
		System.out.println(skip);
		
		System.out.println("***** Using Streams API - peek() *****");
		 Set<Customer> peek = CustomerUtility.getCustomers()
			.stream()
			.peek(System.out::println)
			.collect(Collectors.toSet());
		System.out.println(peek);

		System.out.println("***** Using Streams API - sorted() *****");
		List<String> sorted = CustomerUtility.getCustomers()
			.stream()
			.map(product -> product.getName()).sorted()
			.collect(Collectors.toList());
		System.out.println(sorted);

		System.out.println("***** Using Streams API - sorted(Comparator.comparing()) *****");
		List<String> sortedComparator = CustomerUtility.getCustomers()
			.stream()
			.sorted(Comparator.comparing(Customer::getName))
			.map(cust -> cust.getName())
			.collect(Collectors.toList());
		System.out.println(sortedComparator);
	}



}
