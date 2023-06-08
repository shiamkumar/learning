package com.test.java.concept.threads.executors;

public class WorkTask implements Runnable {

	private long createTime;
	private String taskName;

	WorkTask(String taskName) {
		this.createTime = System.currentTimeMillis();
		this.taskName = taskName;
	}

	@Override
	public void run() {
		Thread currentThread = new Thread();
		long waitedTime = System.currentTimeMillis() - createTime;
		System.out.println(taskName + "::" + waitedTime + "::" + currentThread.getName());
		try {
			Thread.sleep(3000);
			System.out.println(taskName + "compelted" + currentThread.getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
