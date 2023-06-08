package com.test.java8programs.aggregatefunctions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceUsingAggregationMethodsMainClass {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55);
		
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("sum: "+ sum);
		
		Optional<Integer> min = numbers.stream().reduce(Integer::min);
		System.out.println("min: "+ min.get());
		
		Optional<Integer> max = numbers.stream().reduce(Integer::max);
		System.out.println("max: "+ max.get());
		
	}
}
