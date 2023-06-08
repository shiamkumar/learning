package com.test.java8concept.methodreferences;

@FunctionalInterface
interface Printable {
	void print(String message);
}

public class MethosRefObjectInstanceMethod {
	public void display(String message) {
		message = message.toUpperCase();
		System.out.println(message);
	}

	public static void main(String[] args) {
		MethosRefObjectInstanceMethod instacne = new MethosRefObjectInstanceMethod();
		Printable printable = instacne::display;
		printable.print("Hello World");
	}
}
