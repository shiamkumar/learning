package com.test.java.concept.commonexceptionsoverriding;

class SuperClass {
	  // SuperClass declares an exception
	  void method() throws RuntimeException {
	    System.out.println("SuperClass");
	  }
	}

class SubClass extends SuperClass {
	  // SubClass declaring an exception. which are not a child exception of RuntimeException
	  void method() throws Exception {
	    // Exception is not a child exception of the RuntimeException. So the compiler will give an error
	    System.out.println("SubClass");
	  }
}

public class MainClass01 {
	public static void main(String[] args) {
		SuperClass s = new SubClass();
	    s.method();
	}
}
