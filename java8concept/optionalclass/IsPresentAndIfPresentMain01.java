package com.test.java8concept.optionalclass;

import java.util.Optional;

public class IsPresentAndIfPresentMain01 {
	public static void main(String[] args) {
		
		Optional<String> gender01 = Optional.ofNullable("MALE");
		Optional<String> gender02 = Optional.ofNullable(null);      
        String result01 = (gender01.isPresent()) ? "value available" : "value available";
		System.out.println(result01);
		
		String result02 = (gender02.isPresent()) ? "value available" : "value not available";
		System.out.println(result02);
        

        
		Optional<String> gender03 = Optional.ofNullable("MALE");
		Optional<String> gender04 = Optional.ofNullable(null);
		gender03.ifPresent(System.out::println);
		gender04.ifPresent(System.out::println);
        
	}
}
