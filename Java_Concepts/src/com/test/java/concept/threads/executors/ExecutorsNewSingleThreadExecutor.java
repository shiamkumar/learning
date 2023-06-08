package com.test.java.concept.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsNewSingleThreadExecutor {
	public static void main(String[] args) {
		ExecutorsNewSingleThreadExecutor example01 = new ExecutorsNewSingleThreadExecutor();
		example01.startThreadPoolExample01();
	}

	private void startThreadPoolExample01() { 
		//newSingleThreadExecutor() - Single thread executing all my tasks
		ExecutorService executorService = Executors.newSingleThreadExecutor();
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
task1::9::Thread-0
task1compeltedThread-0
task2::3021::Thread-1
task2compeltedThread-1
task3::6027::Thread-2
task3compeltedThread-2
task4::9029::Thread-3
task4compeltedThread-3
task5::12044::Thread-4
task5compeltedThread-4
task6::15059::Thread-5
task6compeltedThread-5
*/
