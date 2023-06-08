package com.test.java8programs.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnigueElementsFromTwoList {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Apple", "Mango", "Grapes", "Banana");
		List<String> list2 = Arrays.asList("Apple", "Mango", "Berrys", "Guava");

		List<String> intersectElements1 = list1.stream()
			.filter(item -> !list2.contains(item))
            .collect(Collectors.toList());//[Grapes, Banana]
		
		List<String> intersectElements2 = list2.stream()
			.filter(item -> !list1.contains(item))
            .collect(Collectors.toList());//[Berrys, Guava]
		
		List<String> intersectResult = new ArrayList<>();
		intersectResult.addAll(intersectElements1);
		intersectResult.addAll(intersectElements2);
		System.out.println("Unique Elements from 2 list::"+intersectResult);
	}
	
}
