package com.test.java.concept.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class CallableExample {
	public static void main(String[] args) {

		Callable<Integer> task1 = () -> {
			int result = IntStream.of(1, 2, 3, 4, 5).sum();
			return result;
		};

		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> future = service.submit(task1);
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}
}
