package com.test.java8concept.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreation {
	public static void main(String[] args) {

		System.out.println("***** Stream Object *****");
		Stream<String> stream01 = Stream.of("Kelly", "Jack", "Anna", "Scott");
		stream01.forEach(System.out::println);

		System.out.println("***** From Collection *****");
		Collection<String> collection = Arrays.asList("Kelly", "Jack", "Anna", "Scott");
		Stream<String> stream02 = collection.stream();
		stream02.forEach(System.out::println);

		System.out.println("***** From List *****");
		List<String> list = Arrays.asList("Kelly", "Jack", "Anna", "Scott");
		Stream<String> stream03 = list.stream();
		stream03.forEach(System.out::println);

		System.out.println("***** From Set *****");
		Set<String> set = new HashSet<String>(list);
		Stream<String> stream04 = set.stream();
		stream04.forEach(System.out::println);

		System.out.println("***** From Array *****");
		String[] strArray = { "Kelly", "Jack", "Anna", "Scott" };
		Stream<String> stream05 = Arrays.stream(strArray);
		stream05.forEach(System.out::println);
		
	}
}
