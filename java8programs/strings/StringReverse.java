package com.test.java8programs.strings;

public class StringReverse {
	public static void main(String[] args) {
		String str = "google";
		String recursive = reverseUsingRecursive(str);
		String stringClazz = reverseUsingStringClass(str);
		String toCharArray = reverseUsingToCharArray(str);
		String split = reverseUsingSplit(str);
		System.out.println("String Reverse Using Recursive::"+recursive);
		System.out.println("String Reverse Using StringClass::"+stringClazz);
		System.out.println("String Reverse Using ToCharArray::"+toCharArray);
		System.out.println("String Reverse Using Split::"+split);
	}

	public static String reverseUsingRecursive(String str) {
		if ((str == null) || (str.length() <= 1))
			return str;
		else {
			return reverseUsingRecursive(str.substring(1)) + str.charAt(0);
		}
	}

	public static String reverseUsingStringClass(String str) {
		String strRev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strRev = strRev + str.charAt(i);
		}
		return strRev;
	}

	public static String reverseUsingToCharArray(String str) {
		String strRev = "";
		char[] charArr = str.toCharArray();
		for (int i = charArr.length - 1; i >= 0; i--) {
			strRev = strRev + charArr[i];
		}
		return strRev;
	}

	public static String reverseUsingSplit(String str) {
		String strRev = "";
		String[] strArr = str.split("");
		for (int i = strArr.length - 1; i >= 0; i--) {
			strRev = strRev + strArr[i];
		}
		return strRev;
	}

}
