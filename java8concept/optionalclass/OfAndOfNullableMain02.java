package com.test.java8concept.optionalclass;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OfAndOfNullableMain02 {
	public static void main(String[] args) {

		String str01 = "Hello World";
		Optional<String> optionalOf01 = Optional.of(str01);
		Optional<String> optionalNullable01 = Optional.ofNullable(str01);
		System.out.println("optionalOf1 : " + optionalOf01.get());
		System.out.println("optionalNullable : " + optionalNullable01.get());

		String str02 = null;
		try {
			Optional<String> optionalOf02 = Optional.of(str02);
			optionalOf02.get();
		} catch (NullPointerException e) {
			System.out.println("Optional.of throws Null Pointer Exception: " + "NullPointerException");
		}

		try {
			Optional<String> optionalNullable02 = Optional.ofNullable(str02);
			optionalNullable02.get();
		} catch (NoSuchElementException e) {
			System.out.println("Optional.ofNullable return empty Optional: " + "NoSuchElementException");
		}
	}
}
