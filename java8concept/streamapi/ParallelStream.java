package com.test.java8concept.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<=50; i++) myList.add(i);
		Stream<Integer> parallelStream = myList.parallelStream();
		Stream<Integer> parallel = parallelStream.filter(p -> p > 40);
		parallel.forEach(p -> System.out.println("parallel="+p));
	}
}
