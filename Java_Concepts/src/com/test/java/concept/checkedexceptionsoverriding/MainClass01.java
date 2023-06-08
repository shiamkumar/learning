package com.test.java.concept.checkedexceptionsoverriding;

import java.io.IOException;

class SuperClass {
	// SuperClass doesn't declare any exception
	void method() {
		System.out.println("SuperClass");
	}
}

class SubClass extends SuperClass {
	// method() declaring Checked Exception IOException
	@Override
	void method() throws IOException {
		// IOException is of type Checked Exception. So the compiler will give Error
		System.out.println("SubClass");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		SuperClass s = new SubClass();
		s.method();
	}
}
