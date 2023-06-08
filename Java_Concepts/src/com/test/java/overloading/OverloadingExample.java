package com.test.java.overloading;


class MethodOverloading {
	public void methodTest(Object object) {
		System.out.println("Calling Object");
	}
	
	public void methodTest(String object) {
		System.out.println("Calling String");
	}
	
}


public class OverloadingExample {
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.methodTest(null);
	}
}
