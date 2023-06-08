package com.test.java8programs.strings;

import java.util.stream.IntStream;

public class StringPermutations {
	public static void main(String[] args) {
		System.out.println();
		stringPermuteAndPrint01("", "ABC");
		System.out.println();
		stringPermuteAndPrint02("", "ABC");
	}

	private static void stringPermuteAndPrint01(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.print(prefix + " ");
		} else {
			IntStream
			.range(0, n)
			.parallel()
			.forEach(i -> stringPermuteAndPrint01(prefix + str.charAt(i),
					str.substring(i + 1, n) + str.substring(0, i)));
		}
	}

	public static void stringPermuteAndPrint02(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.print(prefix + " ");
		} else {
			for (int i = 0; i < n; i++) {
				stringPermuteAndPrint02(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
			}
		}
	}

}
