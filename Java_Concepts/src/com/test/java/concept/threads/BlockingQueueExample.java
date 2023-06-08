package com.test.java.concept.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();
	}
}
