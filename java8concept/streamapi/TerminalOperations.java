package com.test.java8concept.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
	public static void main(String[] args) {
		
		System.out.println("***** toArray() *****");
		Stream<Integer> streamtoArray = Stream.of(1, 2, 3, 4, 5);
		Object[] objArray = streamtoArray.toArray();
		System.out.println("objArray length " + objArray.length);
		
		System.out.println("***** collect() *****");
		Stream<Integer> streamCollect = Stream.of(1, 2, 3, 4, 5);
		List<Integer> intList = streamCollect.collect(Collectors.toList());
		System.out.println(intList);
		
		System.out.println("***** forEach() *****");
		Stream<Integer> streamForEach01 = Stream.of(1, 2, 3, 4, 5);
		streamForEach01.forEach(value -> System.out.println(value)); //Print the values
		
		Stream<Integer> streamForEach02 = Stream.of(1, 2, 3, 4, 5);
		List<Integer> numList = new ArrayList<>();
		streamForEach02.forEach(value -> numList.add(value)); //Adding values
		System.out.println("numList : " + numList);
		
		System.out.println("***** forEachOrdered() *****");
		Stream<Integer> streamForEachOrdered = Stream.of(1, 2, 5, 4,3).parallel();
		streamForEachOrdered.forEachOrdered(value -> System.out.println(value));
		
		System.out.println("***** count() *****");
		Stream<Integer> streamCount = Stream.of(1, 2, 3, 4, 5);
		long count = streamCount.count();
		System.out.println("count :: " + count);
		
		System.out.println("***** max() *****");
		List<String> streamMax = Arrays.asList("Jack", "Dany", "Sageer", "Zareena");
		streamMax.stream().max(Comparator.comparing(String::valueOf))
		.ifPresent(e -> System.out.println("Max: " + e));
		
		System.out.println("***** min() *****");
		List<Integer> streamMin = Arrays.asList(42, 44, 43, 41);
		streamMin.stream().min(Comparator.comparing(Integer::intValue))
		.ifPresent(e -> System.out.println("Min: " + e));
		
		System.out.println("***** reduce() *****");
		streamMin.stream().reduce(Integer::min).ifPresent(s -> System.out.println(s)); 
		streamMin.stream().reduce(Integer::max).ifPresent(s -> System.out.println(s));
		
		List<Car> persons = Arrays.asList(
				new Car("Skoda", 18544),
                new Car("Volvo", 22344),
                new Car("Fiat", 23650),
                new Car("Renault", 19700));
        Optional<Car> car = persons.stream().reduce((c1, c2) -> c1.getPrice() > c2.getPrice() ? c1 : c2);
        car.ifPresent(System.out::println);
        
        
        System.out.println("***** noneMatch() positve case *****");
        Stream<Integer> streamNoneMatch01 = Stream.of(1, 2, 3, 4, 5).parallel();
        Predicate<Integer> nonematch01 = value -> value > 7;
        boolean isNoneMatch01 = streamNoneMatch01.noneMatch(nonematch01);
        System.out.println("noneMatch()::positve case:" + isNoneMatch01);
        
        System.out.println("***** noneMatch() negaive case *****");
        Stream<Integer> streamNoneMatch02 = Stream.of(1, 2, 3, 4, 5).parallel();
        Predicate<Integer> nonematch02 = value -> value > 3;
        boolean isNoneMatch02 = streamNoneMatch02.noneMatch(nonematch02);
        System.out.println("noneMatch()::negaive case:" + isNoneMatch02);
        
        System.out.println("***** anymatch() positve case *****");
        Stream<Integer> streamAnymatch01 = Stream.of(1, 2, 3, 4, 5).parallel();
        Predicate<Integer> anymatch01 = value -> value > 4;
        boolean isAnymatch01 = streamAnymatch01.anyMatch(anymatch01);
        System.out.println("anymatch()::positve case:" + isAnymatch01);
        
        System.out.println("***** anymatch() negative case *****");
        Stream<Integer> streamAnymatch02 = Stream.of(1, 2, 3, 4, 5).parallel();
        Predicate<Integer> anymatch02 = value -> value > 5;
        boolean isAnymatch02 = streamAnymatch02.anyMatch(anymatch02);
        System.out.println("anymatch()::negative case:" + isAnymatch02);
        
        System.out.println("***** allmatch() positve case *****");
        Stream<Integer> streamAllmatch01 = Stream.of(1, 2, 3, 4, 5).parallel();
        Predicate<Integer> allmatch01 = value -> value >= 1;
        boolean isAllmatch01 = streamAllmatch01.allMatch(allmatch01);
        System.out.println("allmatch()::postive case:" + isAllmatch01);
        
        System.out.println("***** allmatch() negative case *****");
        Stream<Integer> streamAllmatch02 = Stream.of(1, 2, 3, 4, 5).parallel();
        Predicate<Integer> allmatch02 = value -> value > 1;
        boolean isAllmatch02 = streamAllmatch02.allMatch(allmatch02);
        System.out.println("allmatch()::negative case:" + isAllmatch02);
        
        System.out.println("***** findFirst() *****");
        Stream<Integer> streamFindFirst = Stream.of(1, 2, 3, 4, 5).parallel();
        Predicate<Integer> findFirst = value -> value % 2 == 0;
        Optional<Integer> findFirstOpt = streamFindFirst.filter(findFirst).findFirst();
        System.out.println("Find first even number : " + findFirstOpt.get());
        	
        System.out.println("***** findAny() *****");
        Stream<Integer> streamFindAny = Stream.of(1, 2, 3, 4, 5).parallel();
        Predicate<Integer> findAny = value -> value % 2 == 1;
        Optional<Integer> findAnyOpt = streamFindAny.filter(findAny).findAny();
        System.out.println("Find any odd number : " + findAnyOpt.get());
	}
}
