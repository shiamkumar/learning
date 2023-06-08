package com.test.java8programs.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumberAndRemoveNullFromList {
	public static void main(String[] args) {	
		List<Integer> list1 = Arrays.asList(11, 22, 33, 44, 55);
		Integer secondMaxVal = list1
			.stream()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst()
			.get();
		System.out.println(secondMaxVal);
		
		List<Integer> list2 = Arrays.asList(11, null, 33, 44, null, 55, 22);	
		Optional<Integer> secondMaxValAndRemoveNull = list2
			.stream()
			.filter(x -> x != null) //or else .filter(Objects::nonNull) 
			.sorted(Comparator.reverseOrder())  //or else .sorted((o1, o2) -> o2.compareTo(o1))
			.skip(1)
			.findFirst();
		System.out.println(secondMaxValAndRemoveNull);
	}
}
