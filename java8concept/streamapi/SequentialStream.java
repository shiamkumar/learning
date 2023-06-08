package com.test.java8concept.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SequentialStream {
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<=50; i++) myList.add(i);
		Stream<Integer> seqStream = myList.stream();
		Stream<Integer> seq = seqStream.filter(p -> p > 40);
		seq.forEach(p -> System.out.println("sequential="+p));
	}
}
