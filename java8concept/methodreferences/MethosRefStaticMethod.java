package com.test.java8concept.methodreferences;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethosRefStaticMethod {
	public static void main(String[] args) {
		// Function - Lambda Expression
		Function<Integer, Double> functionLambda = (input) -> Math.sqrt(input);
		System.out.println(functionLambda.apply(4));
		// Function - Method Reference
		Function<Integer, Double> functionMethodRef = Math::sqrt;
		System.out.println(functionMethodRef.apply(4));

		// BiFunction - Lambda Expression
		BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethosRefStaticMethod.addition(a, b);
		System.out.println(biFunctionLambda.apply(2, 4));
		// BiFunction - Method Reference
		BiFunction<Integer, Integer, Integer> biFunctionMethodRef = MethosRefStaticMethod::addition;
		System.out.println(biFunctionMethodRef.apply(2, 4));
	}

	public static int addition(int a, int b) {
		return (a + b);
	}
}
