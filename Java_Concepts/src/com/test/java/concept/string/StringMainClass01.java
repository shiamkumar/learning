package com.test.java.concept.string;

public class StringMainClass01 {
	public static void main(String[] args) {
		String str = "Java";
		System.out.println(str); // Java
		
		str.concat("Full Stack"); //Can't modify
		System.out.println(str); //// Java
		
		str = "Java Backend"; //Can able to destory and will create new object
		System.out.println(str); //Java Backend
	}
}
