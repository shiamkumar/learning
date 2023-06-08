package com.test.java8programs.numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 44, 33);
		Set<Integer> hs = new HashSet<Integer>();
		List<Integer> dupList = list.stream().filter(item -> !hs.add(item)).collect(Collectors.toList());
		System.out.println(dupList);
	}
}
