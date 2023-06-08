 package com.test.java8programs.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumbersAndCount {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 44, 33);
		System.out.println("*****DuplicateNumbersAndCount*****");
		Map<Integer, Long> map01 = list.stream()
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map01);
	}
}
