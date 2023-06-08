package com.test.java8programs.strings;

import java.util.List;
import java.util.stream.Collectors;

public class RemovingSpecialUsingCharacterClass {
	public static void main(String[] args) {

		String str01 = "asdc@FF#$%!";
		List<Character> chars = str01
				.chars()
				.mapToObj(item -> (char) item)
				.collect(Collectors.toList());
		List<Character> filteredChars = chars.stream()
				.filter(ch -> Character.isAlphabetic(ch) || Character.isDigit(ch))
				.collect(Collectors.toList());
		StringBuilder builder = new StringBuilder();
		for (Character ch : filteredChars) {
			builder.append(ch);
		}
		System.out.println(builder);

		String str02 = "asdc@FF#$%!";
		int[] chArr = str02
				.codePoints()
				.filter(ch -> Character.isAlphabetic(ch) || Character.isDigit(ch))
				.toArray();
		System.out.println(new String(chArr, 0, chArr.length));

	}
}
