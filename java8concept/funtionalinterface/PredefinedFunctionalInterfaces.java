package com.test.java8concept.funtionalinterface;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PredefinedFunctionalInterfaces {
	public static void main(String[] args) {

		System.out.println("Function Interface");
		Function<String, Integer> function = (String str) -> str.length();
		System.out.println(function.apply("Hello"));

		System.out.println("Consumer Interface");
		Consumer<String> consumer = (String str) -> System.out.println(str);
		consumer.accept("World");

		System.out.println("Supplier Interface");
		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
		System.out.println(supplier.get());

		System.out.println("Predicate Interface");
		Predicate<Integer> predicate = (age) -> (age == 18);
		System.out.println(predicate.test(9));

		List<String> list = Arrays.asList("car", "van", "carvan", "bus");
		List<String> result = list.stream().filter(name -> name.startsWith("car")).collect(Collectors.toList());
		System.out.println(result);

		System.out.println("BiFunction Interface");
		BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> (a + b);
		System.out.println(biFunction.apply(100, 200));

		System.out.println("BiConsumer Interface");
		BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
		biConsumer.accept(10, 20);

		System.out.println("BiPredicate Interface");
		BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
		System.out.println(biPredicate.test("ramesh", "ramesh"));

	}
}
