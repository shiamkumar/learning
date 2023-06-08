package com.test.java8programs.others;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateAndCount {
	public static void main(String[] args) {
		duplicateNumberAndCount();
		duplicateCharactersAndCount();
		duplicateWordsAndCount();
	}
	
	public static void duplicateNumberAndCount() {
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 44, 33);
		System.out.println("*****DuplicateNumbersAndCount*****");
		Map<Integer, Long> map = list.stream()
			.collect(Collectors.groupingBy(
					Function.identity(), Collectors.counting()));
		System.out.println(map);
	}
	
	public static void duplicateCharactersAndCount() {
		String str = "javajavaeexyz";
		Map<Character, Long> map = str
		.chars()
		.mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(
						Function.identity(), Collectors.counting()));
		System.out.println(map);
	}
	
	public static void duplicateWordsAndCount(){
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
