package com.test.java.concept.threads;

public class RunnableExample {
	public static void main(String[] args) {

		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running");
			}
		};

		Runnable task2 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running");
			}
		};

		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		thread1.start();
		thread2.start();

	}
}
