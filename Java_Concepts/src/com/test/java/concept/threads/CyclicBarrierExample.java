package com.test.java.concept.threads;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
	public static void main(String args[]) {
		final CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
			@Override
			public void run() {
				System.out.println("Start the Game");
			}
		});

		Thread player1 = new Thread(new Player(cb), "Thread1");
		Thread player2 = new Thread(new Player(cb), "Thread2");
		Thread player3 = new Thread(new Player(cb), "Thread3");

		player1.start();
		player2.start();
		player3.start();
	}
}

class Player implements Runnable {

	private CyclicBarrier barrier;

	public Player(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
			barrier.await();
			System.out.println(Thread.currentThread().getName() + " has passed the barrier");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
