package com.test.java8programs.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HighestOddNumber {
	public static void main(String[] args) {

		OptionalInt oddMaxValue1 = IntStream.of(11, 22, 33, 44, 55, 66, 77)
				.filter(n -> !(n % 2 == 0))
				.max();
		System.out.println(oddMaxValue1);

		int oddMaxValue2 = IntStream.of(11, 22, 33, 44, 55, 66, 77)
				.filter(n -> !(n % 2 == 0))
				.summaryStatistics().getMax();
		System.out.println(oddMaxValue2);

		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 66, 77);
		Optional<Integer> oddMaxValue3 = list.stream()
				.filter(n -> !(n % 2 == 0))
				.reduce(Integer::max);
		System.out.println(oddMaxValue3);
		
		Optional<Integer> oddMaxValue4 = list.stream()
				.filter(n -> !(n % 2 == 0))
				.collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println(oddMaxValue4);
		
		int oddMaxValue5 = list.stream()
				.mapToInt(item -> item)
				.filter(n -> !(n % 2 == 0))
				.summaryStatistics().getMax();
		System.out.println(oddMaxValue5);
	}
}
