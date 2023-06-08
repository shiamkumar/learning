package com.test.java.concept.uncheckedexceptionsoverriding;

class SuperClass {
	// SuperClass declares an exception
	void method() throws RuntimeException {
		System.out.println("SuperClass");
	}
}

class SubClass extends SuperClass {
	// SubClass declaring a child exception of RuntimeException
	void method() throws ArithmeticException {
		// ArithmeticException is a child exception of the RuntimeException. So the compiler won't give an error
		System.out.println("SubClass");
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		SuperClass s = new SubClass();
        s.method();
	}
}
