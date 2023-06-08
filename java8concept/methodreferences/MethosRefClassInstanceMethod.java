package com.test.java8concept.methodreferences;

import java.util.function.Function;

public class MethosRefClassInstanceMethod {
	public static void main(String[] args) {
		//Lambda
		Function<String, String> functionLambda = (String input) -> input.toLowerCase();
		System.out.println(functionLambda.apply("Hello World"));
		
		//Method REferences
		Function<String, String> functionMethodRef = String::toLowerCase;
		System.out.println(functionMethodRef.apply("Hello World"));
		
	}
}
