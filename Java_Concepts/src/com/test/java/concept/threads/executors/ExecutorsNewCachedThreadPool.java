package com.test.java.concept.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsNewCachedThreadPool {
	public static void main(String[] args) {
		ExecutorsNewCachedThreadPool example03 = new ExecutorsNewCachedThreadPool();
		example03.startThreadPoolExample03();
	}
	
	private void startThreadPoolExample03() {
		//newCachedThreadPool - JVM will create threads, depends on my tasks
		ExecutorService executorService = Executors.newCachedThreadPool();
		WorkTask task1 = new WorkTask("task1");
		WorkTask task2 = new WorkTask("task2");
		WorkTask task3 = new WorkTask("task3");
		WorkTask task4 = new WorkTask("task4");
		WorkTask task5 = new WorkTask("task5");
		WorkTask task6 = new WorkTask("task6");
		
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		executorService.submit(task4);
		executorService.submit(task5);
		executorService.submit(task6);
		
		executorService.shutdown();
	}
}

/*
Output::
task1::1::Thread-0
task5::2::Thread-4
task4::2::Thread-3
task3::2::Thread-2
task2::1::Thread-1
task6::2::Thread-5
task5compeltedThread-4
task3compeltedThread-2
task4compeltedThread-3
task1compeltedThread-0
task2compeltedThread-1
task6compeltedThread-5
 */
