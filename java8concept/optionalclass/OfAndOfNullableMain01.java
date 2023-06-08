package com.test.java8concept.optionalclass;

import java.util.Optional;

public class OfAndOfNullableMain01 {
	public static void main(String[] args) {

		String answer1 = "Yes";
		String answer2 = null;

		System.out.println("ofNullable() on Non-Empty Optional: " + Optional.ofNullable(answer1));//return value
		System.out.println("ofNullable() on Empty Optional: " + Optional.ofNullable(answer2)); //return Optional.empty
		System.out.println(Optional.ofNullable(answer2).get()); 
		
		System.out.println("of() on Non-Empty Optional: " + Optional.of(answer1)); //return value
		System.out.println("of() on Empty Optional: " + Optional.of(answer2));  //return nullPointerException

	}
}
