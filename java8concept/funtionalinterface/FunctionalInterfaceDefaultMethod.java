package com.test.java8concept.funtionalinterface;

/*default() - Method has the implementation inside the interface.*/
interface SimProvider {

	void sim();

	default String generation() {
		String gen = "5th Gen";
		System.out.println(gen);
		return gen;
	}

}

class Airtel implements SimProvider {
	@Override
	public void sim() {
		System.out.println("Airtel Sim");
	}
}

class Vodafone implements SimProvider {
	@Override
	public void sim() {
		System.out.println("Vodafone Sim");
	}
}

class BSNL implements SimProvider {
	@Override
	public void sim() {
		System.out.println("BSNL Sim");
	}
}

public class FunctionalInterfaceDefaultMethod {
	public static void main(String[] args) {
		SimProvider airtel = new Airtel();
		airtel.sim();
		airtel.generation();

		SimProvider vodafone = new Vodafone();
		vodafone.sim();
		vodafone.generation();

		SimProvider bsnl = new BSNL();
		bsnl.sim();
		//bsnl.generation();
	}
}
