package com.test.java8concept.logical;

public class FactorialUsingLoop {
	public static void main(String[] args) {
		int size = 6, fact = 1;
		for (int i = size; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("factoral=" + fact);
	}
}
