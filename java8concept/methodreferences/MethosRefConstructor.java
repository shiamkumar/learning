package com.test.java8concept.methodreferences;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethosRefConstructor {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Jack", "Kelly", "Peter", "Anna", "Kelly", "Anna");
		// Lambda
		Function<List<String>, Set<String>> setFunctionLambda = (names) -> new HashSet<>(names);
		System.out.println(setFunctionLambda.apply(list));

		// Method References
		Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
		System.out.println(setFunctionMethodRef.apply(list));
	}
}
