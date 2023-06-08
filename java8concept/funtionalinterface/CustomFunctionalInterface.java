package com.test.java8concept.funtionalinterface;

@FunctionalInterface
public interface CustomFunctionalInterface {
	void print(String message);
	
	//void printA(String message);

	default void method01() {
		System.out.println("default method");
	}

	static void method02() {
		System.out.println("static method");
	}
}
