package com.test.java8concept.funtionalinterface;

/*static methods - cannot be overridden in subclasses*/
interface Vehicle {

	void getBrand();

	static void clean() {
		System.out.println("I am cleaning vehicle");
	}

}

class Car implements Vehicle {

	@Override
	public void getBrand() {
		System.out.println("BMW");
	}

	//@Override
	public void clean() {
		System.out.println("Cleaning the vehicle");
	}

}

public class FunctionalInterfaceStaticMethod {
	public static void main(String[] args) {
		Car car = new Car();
		car.getBrand();
		car.clean();
	}
}
