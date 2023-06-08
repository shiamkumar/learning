package com.test.java8concept.optionalclass;

import java.util.Optional;

public class OptionalMainClass {
	public static void main(String[] args) {

		String name = null;
		String email = "jack@gmail.com";
		
		// to create optional object using these methods - empty, of, ofNullable
		System.out.println("empty() Method");
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

		System.out.println("of() Method");
		// Optional<String> ofOptional01 = Optional.of(name);
		// System.out.println(ofOptional01); //throw NullPinterException

		Optional<String> ofOptional02 = Optional.of(email);
		System.out.println(ofOptional02);

		System.out.println("ofNullable() Method");
		Optional<String> ofNullableOptional01 = Optional.ofNullable(name);
		System.out.println(ofNullableOptional01);

		Optional<String> ofNullableOptional02 = Optional.ofNullable(email);
		System.out.println(ofNullableOptional02);

		// to Retrieve value of Optional Class Object - get()
		System.out.println("get() Method");
		// Optional<String> getOptional01 = Optional.ofNullable(name);
		// System.out.println(getOptional01.get()); //throw NoSuchElementException

		Optional<String> getOptional02 = Optional.ofNullable(email);
		System.out.println(getOptional02.get());

		System.out.println("isPresent() Method");
		Optional<String> isPresentOptional01 = Optional.ofNullable(name);
		String result01 = (isPresentOptional01.isPresent()) ? isPresentOptional01.get() : "No data found";
		System.out.println(result01);

		Optional<String> isPresentOptional02 = Optional.ofNullable(email);
		String result02 = (isPresentOptional02.isPresent()) ? isPresentOptional02.get() : "No data found";
		System.out.println(result02);

		System.out.println("orElse(String datatype) & orElseGet(Supplier datatype) & Method");
		String defaultValue = "default@gmail.com";
		Optional<String> orElseOptional01 = Optional.ofNullable(name);
		String result03 = orElseOptional01.orElse(defaultValue);
		System.out.println(result03);

		Optional<String> orElseOptional02 = Optional.ofNullable(email);
		String result04 = orElseOptional02.orElse(defaultValue);
		System.out.println(result04);
		
		System.out.println("orElseThrow(String datatype) & orElseThrow(Supplier datatype) & Method");
		//Optional<String> orElseThrowOptional01 = Optional.ofNullable(name);
		//String result05 = orElseThrowOptional01.orElseThrow( () -> new IllegalArgumentException("name doesnot exist"));
		//System.out.println(result05); //IllegalArgumentException: name doesnot exist
		
		Optional<String> orElseThrowOptional02 = Optional.ofNullable(email);
		String result06 = orElseThrowOptional02.orElseThrow( () -> new IllegalArgumentException("name doesnot exist"));
		System.out.println(result06);
		
		System.out.println("ifPresent() Method");
		Optional<String> empty = Optional.empty();
		Optional<String> gender = Optional.of("MALE");
		empty.ifPresent((val) -> System.out.println("No data found"));
		gender.ifPresent((val) -> System.out.println("Value is present"));
		
		System.out.println("filter() & map() Methods");
		String data = "  abc  ";
		if(data!=null && data.contains("abc")) {
			System.out.println(data);
		}
		
		Optional<String> dataOptional = Optional.of(data);
		dataOptional.filter(res -> res.contains("abc"))
		.map(String::trim)
		.ifPresent((res) -> System.out.println(res));
		
	}
}
