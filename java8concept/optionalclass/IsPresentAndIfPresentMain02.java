package com.test.java8concept.optionalclass;

import java.util.Optional;

public class IsPresentAndIfPresentMain02 {
	public static void main(String[] args) {

		Optional<String> opt01 = Optional.of("hello world!");
		String flag01 = (opt01.isPresent()) ? "Found" : "Not Found";
		System.out.println("flag01: " + flag01);

		Optional<String> opt02 = Optional.ofNullable(null);
		String flag02 = (opt02.isPresent()) ? "Found" : "Not Found";
		System.out.println("flag02: " + flag02);

		Optional<String> opt03 = Optional.of("hello world!");
		opt03.ifPresent(name -> System.out.println(name.length()));
		
		Optional<String> opt04 = Optional.of(null);
		opt04.ifPresent(name -> System.out.println(name.length()));

	}
}
