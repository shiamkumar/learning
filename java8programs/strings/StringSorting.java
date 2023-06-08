package com.test.java8programs.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSorting {
	public static void main(String[] args) {
		String str = "welcome";
		str = Stream.of(str.split("")).sorted().collect(Collectors.joining());
		System.out.println(str);

		String str2 = "welcome";
		str2 = str2.chars() // IntStream
				.sorted()
				.collect(
						StringBuilder::new, 
						StringBuilder::appendCodePoint, 
						StringBuilder::append)
				.toString();
		System.out.println(str);
	}
}
