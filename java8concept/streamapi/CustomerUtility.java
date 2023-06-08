package com.test.java8concept.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerUtility {

	public static List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(101, "john", "john@gmail.com", Arrays.asList("3979379555", "21654725")));
		customers.add(new Customer(102, "smith", "smith@gmail.com", Arrays.asList("8956386566", "2487238947")));
		customers.add(new Customer(103, "peter", "peter@gmail.com", Arrays.asList("3894638654", "3286768922")));
		customers.add(new Customer(104, "kelly", "kelly@gmail.com", Arrays.asList("4892468377", "5488987611")));
		customers.add(new Customer(105, "jack", "jack@gmail.com", Arrays.asList("7788994433", "4382445566")));
		customers.add(new Customer(105, "jack", "jack@gmail.com", Arrays.asList("7788994433", "4382445566")));
		return customers;
	}
	
}
