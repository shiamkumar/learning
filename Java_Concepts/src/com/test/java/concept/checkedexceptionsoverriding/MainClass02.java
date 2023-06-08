package com.test.java.concept.checkedexceptionsoverriding;

import java.io.IOException;

class SuperClass02 {
	// SuperClass declares an exception
	void method() throws IOException {
		System.out.println("SuperClass");
	}
}

class SubClass02 extends SuperClass02 {
	// SubClass declaring without exception
	void method() {
		System.out.println("SubClass");
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		SuperClass02 s = new SubClass02();
		try {
			s.method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
