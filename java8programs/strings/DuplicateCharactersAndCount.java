package com.test.java8programs.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersAndCount {
	public static void main(String[] args) {
		String str = "javajavaeexyz";

		Map<Character, Integer> map01 = new HashMap<>();
		for (char ch : str.toCharArray()) {
			map01.put(ch, map01.getOrDefault(ch, 0) + 1);
		}
		System.out.println("map01 w/o using java8::  " + map01);

		Map<Character, Long> map02 = str.chars()
		.mapToObj(ch -> (char) ch)
		.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		System.out.println("map02 with using java8:: " + map02);
		
		Map<Character, Long> map03 = str
		.chars()
		.mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("map03 with using java8:: " + map03);

		Map<Character, Integer> map04 = str
		.chars()
		.mapToObj(c -> (char) c)
		.collect(Collectors.toMap(Function.identity(), c -> 1, Math::addExact));
		System.out.println("map04 with using java8:: " + map04);

		System.out.println("Only duplicates chars and its count with using java8");
		map04.forEach((key, value) -> {
			if (value > 1) {
				System.out.println(key + "::" + value);
			}
		});
		
	}
}
/*
map01 w/o using java8::  {a=4, e=2, v=2, x=1, y=1, j=2, z=1}
map02 with using java8:: {a=4, e=2, v=2, x=1, y=1, z=1, j=2}
map03 with using java8:: {a=4, e=2, v=2, x=1, y=1, z=1, j=2}
map04 with using java8:: {a=4, e=2, v=2, x=1, y=1, z=1, j=2}
Only duplicates chars and its count with using java8
a::4
e::2
v::2
*/