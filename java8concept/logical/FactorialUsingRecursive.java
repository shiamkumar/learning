package com.test.java8concept.logical;

public class FactorialUsingRecursive {
	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println(result);
	}
	
	static int factorial(int count) {
		if(count==0 || count==1) {
			return 1;
		}
		return count * factorial(count -1);
	}
}
