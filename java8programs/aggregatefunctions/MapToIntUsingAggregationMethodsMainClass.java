package com.test.java8programs.aggregatefunctions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class MapToIntUsingAggregationMethodsMainClass {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55);

		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum: " + sum);

		long count = numbers.stream().mapToInt(Integer::intValue).count();
		System.out.println("count: " + count);

		OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();
		System.out.println("min: " + min.getAsInt());

		OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
		System.out.println("max: " + max.getAsInt());

		OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
		System.out.println("average: " + average.getAsDouble());

		
		long sum02 = numbers.stream().mapToInt(x -> x).summaryStatistics().getSum();
		System.out.println("sum02: " + sum02);

		long count02 = numbers.stream().mapToInt(x -> x).summaryStatistics().getCount();
		System.out.println("count02: " + count02);

		int min02 = numbers.stream().mapToInt(x -> x).summaryStatistics().getMin();
		System.out.println("min02: " + min02);

		int max02 = numbers.stream().mapToInt(x -> x).summaryStatistics().getMax();
		System.out.println("max02: " + max02);

		double average02 = numbers.stream().mapToInt(x -> x).summaryStatistics().getAverage();
		System.out.println("average02: " + average02);
	}
}
