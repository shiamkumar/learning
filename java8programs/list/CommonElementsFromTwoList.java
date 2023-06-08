package com.test.java8programs.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsFromTwoList {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Apple", "Mango", "Grapes", "Banana");
		List<String> list2 = Arrays.asList("Apple", "Mango", "Berrys", "Guava");
		List<String> unionElements = list1.stream()
			//.filter(item -> list2.contains(item))
			.filter(list2::contains)
			.collect(Collectors.toList());
		System.out.println("Common Elements From 2 List:: "+unionElements);
	}
}
