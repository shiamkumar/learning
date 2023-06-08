package com.test.java8programs.numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumbersFromList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 44, 33);
		List<Integer> output = list.stream()
			.filter(i -> Collections.frequency(list, i) == 1)
			.collect(Collectors.toList());
		System.out.println(output);
	}
}
