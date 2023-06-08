package com.test.java8programs.strings;

public class StringRotation {
	public static void main(String[] args) {
		String original = "IndiaVsChina";
		String rotation = "ChinaIndiaVs";
		boolean result = checkRotation(original, rotation);
		System.out.println(result);
	}

	public static boolean checkRotation(String original, String rotation) {
		boolean flag = true;
		if (original.length() != rotation.length()) {
			flag = false;
			return flag;
		}
		String concatStr = original + original;
		if (concatStr.indexOf(rotation) != -1) {
			flag = true;
			return flag;
		}
		flag = false;
		return flag;
	}
}
