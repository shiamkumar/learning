package com.test.java8programs.strings;

import java.util.Arrays;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class DuplicateWordsAndCount {
	public static void main(String[] args) {
		String text = "Bob had had had a better effect on on the teacher";
		ConcurrentMap<String, Integer> freqMap = Arrays
		.asList(text.split("[\\s.]"))
		.parallelStream()
		.filter(s -> !s.isEmpty())
		.collect(Collectors.toConcurrentMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
		System.out.println(freqMap.toString());
		
		freqMap.forEach((key, value) -> {
			if (value > 1) {
				System.out.println(key + "::" + value);
			}
		});
		
	}
}
/*
{better=1, the=1, a=1, teacher=1, bob=1, effect=1, had=3, on=2}
*/