package com.test.java8programs.numbers;

import java.util.stream.IntStream;

public class SumEvenNumbersUsingReduceAndSum {
	public static void main(String[] args) {
		
		int sum02 = IntStream.of(11, 22, 33, 44, 55)
				.filter(n -> n % 2 == 0)
				.reduce(0, (x, y) -> x + y);
		System.out.println("Using Reduce::"+sum02);
		
		int sum = IntStream.of(11, 22, 33, 44, 55)
				.filter(n -> n % 2 == 0)
				.sum(); 
		System.out.println("Using Sum::"+sum);

	}
}
