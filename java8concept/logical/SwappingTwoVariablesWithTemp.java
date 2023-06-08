package com.test.java8concept.logical;

public class SwappingTwoVariablesWithTemp {
	public static void main(String[] args) {
		int first = 10, second = 20, temp;
		System.out.println("Before Swapping: "+first +" : "+ second);
		temp = first;
		first = second;
		second = temp;
		System.out.println("After Swapping: "+first +" : "+ second);
	}
}
