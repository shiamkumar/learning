package com.test.java8programs.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedAndNonRepeatedCharacter {
	public static void main(String[] args) {
		String str = "abcsdnvsn";
		Map<Character, Long> collectData =  str
				.chars()
				.mapToObj(ch -> (char)ch)
				.collect(Collectors.groupingBy(
						Function.identity(), LinkedHashMap::new, Collectors.counting()));
		//collectData.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));

        Optional<Character> firstRepeat = collectData
        		.entrySet()
        		.stream()
        		.filter( (e) -> e.getValue() > 1)
        		.map(e -> e.getKey())
        		//.skip(1) //second srepeating characters
        		.findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));
        
        Optional<Character> firstNonRepeat = collectData
        		.entrySet()
        		.stream()
        		.filter( (e) -> e.getValue() == 1)
        		.map(e -> e.getKey())
        		//.skip(1) //second non-repeating characters
        		.findFirst();
        if(firstNonRepeat.isPresent()) {
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }
        
	}
}

