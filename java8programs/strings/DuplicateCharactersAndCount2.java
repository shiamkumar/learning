package com.test.java8programs.strings;

public class DuplicateCharactersAndCount2 {
	public static void main(String[] args) {
		String str = "aaabbbbccaa";
		int currentLength = 1;
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i-1) == str.charAt(i)) {
				currentLength++;
			} else {
				builder
				.append(str.charAt(i - 1))
				.append(currentLength > 1 ? currentLength : "");
				currentLength = 1;
			}
		}
		builder
		.append(str.charAt(str.length() - 1))
		.append(currentLength > 1 ? currentLength : "");
		System.out.println("" + builder.toString());
	}
}
/*
a3b4c2a2
*/