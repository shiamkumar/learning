package com.test.java.concept.threads;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	BlockingQueue<String> queue = null;

	public Consumer(BlockingQueue queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed " + queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
