package com.test.java.concept.threads;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	BlockingQueue<String> queue = null;

	public Producer(BlockingQueue queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			System.out.println("Producing element 1");
			queue.put("Element 1");
			Thread.sleep(1000);
			System.out.println("Producing element 2");
			queue.put("Element 2");
			Thread.sleep(1000);
			System.out.println("Producing element 3");
			queue.put("Element 3");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
