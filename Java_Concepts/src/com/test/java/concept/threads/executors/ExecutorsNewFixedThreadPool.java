package com.test.java.concept.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsNewFixedThreadPool {
	public static void main(String[] args) {
		ExecutorsNewFixedThreadPool example02 = new ExecutorsNewFixedThreadPool();
		example02.startThreadPoolExample02();
	}
	
	private void startThreadPoolExample02() {
		//newFixedThreadPool() - we can set, how many threads needs to execute my tasks. here i set 3 threads
		ExecutorService executorService = Executors.newFixedThreadPool(3);
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
task1::30::Thread-0
task2::31::Thread-1
task3::32::Thread-2
task3compeltedThread-2
task4::3039::Thread-3
task1compeltedThread-0
task5::3039::Thread-4
task2compeltedThread-1
task6::3039::Thread-5
task4compeltedThread-3
task6compeltedThread-5
task5compeltedThread-4
*/