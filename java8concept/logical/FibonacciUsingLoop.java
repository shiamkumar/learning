package com.test.java8concept.logical;

public class FibonacciUsingLoop {
	public static void main(String[] args) {
		int count = 10;
		int first = 0, second = 1, third;
		for (int i = 0; i < count; ++i) {
			System.out.print(first + " ");
			third = first + second;
			first = second;
			second = third;
		}
	}
}
