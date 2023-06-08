package com.test.java8programs.strings;

public class RemovingSpecialCharactersUsingRegx {
	public static void main(String[] args) {
		String str01 = "It%cont#ains^special*chars&.";
		str01 = str01.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str01);

		String str02 = "It%cont#ains^special*chars&.";
		str02 = str02.replaceAll("[#%^*&.]*", "");
		System.out.println(str02);

		String str03 = "It%cont#ains^special*chars&.";
		str03 = str03.replaceAll("\\W", " ");
		System.out.println(str03);

		String str05 = "It%cont#ains^special*chars&.";
		String str06 = "";
		for (int i = 0; i < str05.length(); i++) {
			if ((str05.charAt(i) > 64 && str05.charAt(i) <= 90) || (str05.charAt(i) > 96 && str05.charAt(i) <= 122)) {
				str06 = str06 + str05.charAt(i);
			}
		}
		System.out.println(str06);
		
		String str07 = "Pr!ogr#am%m*i|n&,.'g/:;<>?@{} Lan?#guag(e";
		String str08 = "";
		for (int i = 0; i < str07.length(); i++) {
			if (str07.charAt(i) > 64 && str07.charAt(i) <= 122) {
				str08 = str08 + str07.charAt(i);
			}
		}
		System.out.println(str08);
	}
}
