package com.test.java8programs.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThan5LengthElementsFromTwoList {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Apple", "Mango", "Grapes", "Banana");
		List<String> list2 = Arrays.asList("Apple", "Mango", "Berrys", "Orange");

		List<String> GeraterThanElements1 = list1.stream()
			.filter(item -> item.length() > 5)
            .collect(Collectors.toList());//[Grapes, Banana]
		
		List<String> GeraterThanElements2 = list2.stream()
            .filter(item -> item.length() > 5)
            .collect(Collectors.toList());//[Berrys, Orange]
		
		List<String> geraterThanElementsResult = new ArrayList<>();
		geraterThanElementsResult.addAll(GeraterThanElements1);
		geraterThanElementsResult.addAll(GeraterThanElements2);
		System.out.println(geraterThanElementsResult);
	}
}
