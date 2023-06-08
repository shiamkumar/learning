package com.test.java8programs.numbers;

import java.util.Arrays;
import java.util.List;

public class SumOfPairValuesFormArray {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8, 7, 2, 5, 3, 1);
		int target = 10;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == target) {
					System.out.println("Pair found: " + list.get(i) + "," + list.get(j));
				}
			}
		}
	}
}
