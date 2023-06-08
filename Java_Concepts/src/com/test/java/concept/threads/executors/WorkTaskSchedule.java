package com.test.java.concept.threads.executors;

import java.time.LocalDateTime;

public class WorkTaskSchedule implements Runnable {

	private String taskName;

	WorkTaskSchedule(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void run() {
		Thread currentThread = new Thread();
		System.out.println(taskName + "::" + LocalDateTime.now() + "::" + currentThread.getName());
		try {
			Thread.sleep(3000);
			System.out.println(taskName + "compelted" + currentThread.getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
