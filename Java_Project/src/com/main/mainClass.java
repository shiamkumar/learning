package com.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class mainClass {
	public static void main(String[] args) {
		// Using Java8
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 33, 44);
		Set<Integer> hs = new HashSet<>();
		List<Integer> uniqueList = list.stream().filter(item -> hs.add(item)).collect(Collectors.toList());
		System.out.println(uniqueList);

	}
}
