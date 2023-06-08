package com.test.java8concept.logical;

public class SwappingTwoVariablesWithoutTemp {
	public static void main(String[] args) {
		int first=10, second=20;      
		System.out.println("Before Swapping: "+first +" : "+ second);
		first=first+second;//a=30 (10+20)    
		second=first-second;//b=10 (30-20)    
		first=first-second;//a=20 (30-10)    
		System.out.println("After Swapping: "+first +" : "+ second);
	}
}
