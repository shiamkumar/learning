package com.test.java8programs.strings;

import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		String str1 = "race";
		String str2 = "care";
		boolean result = anagramCheck(str1, str2);
		System.out.println(result);
	}

	public static boolean anagramCheck(String str1, String str2) {
		boolean flag = false;
		int size1 = str1.length();
		int size2 = str2.length();
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		if (size1 != size2) {
            return flag;
		}
		Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        flag = Arrays.equals(charArray1, charArray2);
        return flag;
	}
	
}
