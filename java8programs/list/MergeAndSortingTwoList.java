package com.test.java8programs.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeAndSortingTwoList {
	public static void main(String[] args) {
		List<Integer> arr01 = Arrays.asList(1, 3, 5, 7);
		List<Integer> arr02 = Arrays.asList(2, 4, 6, 8);
		//List<Integer> result = mergeTwoList(arr01, arr02);
		//System.out.println(result);
		
		List<Integer> result02 = mergeTwoListUsingJava8(arr01, arr02);
		System.out.println(result02);
	}
	
	public static List<Integer> mergeTwoListUsingJava8(List<Integer> arr01, List<Integer> arr02) {
		List<Integer> unsortedMergeList = Stream
				.concat(arr01.stream(), arr02.stream())
				.collect(Collectors.toList());
		List<Integer> sortedMergeList = unsortedMergeList
				.stream()
				.sorted()
				.collect(Collectors.toList());
		return sortedMergeList;
	}

	public static List<Integer> mergeTwoList(List<Integer> arr01, List<Integer> arr02) {
		List<Integer> mergeList = new ArrayList<>();
		int idx1 = 0;
		int idx2 = 0;
		while (idx1 < arr01.size() && idx2 < arr02.size()) {
			if (arr01.get(idx1) <= arr02.get(idx2)) {
				mergeList.add(arr01.get(idx1));
				idx1++;
			} else {
				mergeList.add(arr02.get(idx2));
				idx2++;
			}
		}
		return mergeList;
	}
}
