package com.test.java.overriding;

class ClassA {
	public void methodTest1() {
		System.out.println("ClassA - methodTest");
	}
}

class ClassB extends ClassA {

	public void methodTest1() {
		System.out.println("ClassB - methodTest1");
	}

	public void methodTest2() {
		System.out.println("ClassB - methodTest2");
	}
}

public class OverridingExample {
	public static void main(String[] args) {
		ClassA a = new ClassB();
		a.methodTest1(); //ClassB - methodTest1
		a.methodTest2(); //compile time error becuase methodTest2 undefined method for ClassA
	}
}
