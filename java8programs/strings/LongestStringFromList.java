package com.test.java8programs.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestStringFromList {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Bond", "Einstein", "Alice", "Whitman", "aaaabbbb");
		
		int longestStringLength01 = str
                .stream()
                .mapToInt(String::length)
                .reduce(Integer::max)
                .getAsInt();
        System.out.println("\nLength of Longest String is = " + longestStringLength01);
        
		int longestStringLength02 = str.stream()
				.map(String::length)
				.max(Integer::compare)
				.get();
		System.out.println("\nLength of Longest String is = " + longestStringLength02);
		
		String longestString = str.stream()
				.max(Comparator.comparingInt(String::length))
				.get();
		System.out.println("\nLongest String is = " + longestString);
		
		Map<Integer, Set<String>> strByLength = str.stream()
		        .collect(Collectors.groupingBy(String::length, Collectors.toSet())); 
		System.out.println(strByLength);

	}
}
/*
Length of Longest String is = 8

Length of Longest String is = 8

Longest String is = Einstein

{4=[Bond], 5=[Alice], 7=[Whitman], 8=[Einstein, aaaabbbb]}
 */
