package com.test.java.concept.uncheckedexceptionsoverriding;

class SuperClass {
    // SuperClass doesn't declare any exception
    void method(){
        System.out.println("SuperClass");
    }
}

class SubClass extends SuperClass {
	// method() declaring Unchecked Exception ArithmeticException
	@Override
	void method() throws ArithmeticException {
		//ArithmeticException is of type Unchecked Exception.So the compiler won't give any error
		System.out.println("SubClass");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		SuperClass s = new SubClass();
        s.method();
	}
}
