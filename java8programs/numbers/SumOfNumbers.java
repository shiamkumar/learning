package com.test.java8programs.numbers;

import java.util.stream.IntStream;

public class SumOfNumbers {
	public static void main(String[] args) {
		int sumOfOddNumbers =
			IntStream.of(11, 22, 33, 44, 55)
			.filter(n -> !(n % 2 == 0))
			.reduce(0, (x, y) -> x + y);
		System.out.println("Sum Of Odd Numbers:: "+sumOfOddNumbers);
		
		int sumOfEvenNumbers =
				IntStream.of(11, 22, 33, 44, 55)
				.filter(n -> n % 2 == 0)
				.reduce(0, (x, y) -> x + y);
		System.out.println("Sum Of Even Numbers:: "+sumOfEvenNumbers);
		
		int sum = IntStream.of(11, 22, 33, 44, 55)
				.reduce(0, (x, y) -> x + y);
		System.out.println("Sum Of Numbers using reduce():: "+sum);
		
		int sumMethod = IntStream.of(11, 22, 33, 44, 55).sum();
		System.out.println("Sum Of Numbers using sum():: "+sumMethod);
		
		long summaryStatisticsSumMethod = IntStream.of(11, 22, 33, 44, 55).summaryStatistics().getSum();
		System.out.println("Sum Of Numbers using summaryStatistics sum():: "+summaryStatisticsSumMethod);
	}
}
