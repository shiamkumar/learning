package com.test.java8concept.logical;

public class FibonacciUsingRecursive {
	static int first = 0, second = 1, third = 0;

	public static void main(String[] args) {
		int count = 10;
		for (int i = 0; i < count; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	static int fibonacci(int count) {
		if (count <= 1) {
			return count;
		}
		return fibonacci(count - 1) + fibonacci(count - 2);
	}
}
