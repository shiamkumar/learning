package com.test.java.concept.threads;

//Early Instantiation: The object creation takes place at the load time.
//Lazy Instantiation: The object creation is done according to the requirement

public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}

/*
 * Lazy initialization is possible. 
 * It is also thread safe. 
 * Performance overhead gets reduced because of synchronized keyword.
 * First time, it can affect performance.
 */


