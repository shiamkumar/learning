	package com.test.java.concept.string;

public class StringMainClass02 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		//totally will create 2 objects.
		//str1 and str2 both refer to the same object
		//str3 refer to the different object.
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
	}
}
