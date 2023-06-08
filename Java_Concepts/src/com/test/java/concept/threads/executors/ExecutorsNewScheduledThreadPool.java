package com.test.java.concept.threads.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsNewScheduledThreadPool {
	public static void main(String[] args) {
		ExecutorsNewScheduledThreadPool example01 = new ExecutorsNewScheduledThreadPool();
		example01.startThreadPoolExample04();
	}
	
	private void startThreadPoolExample04() { 
		//newScheduledThreadPool() - set the time based on our schedule will executing
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
		WorkTaskSchedule task1 = new WorkTaskSchedule("task1");
		WorkTaskSchedule task2 = new WorkTaskSchedule("task2");
		WorkTaskSchedule task3 = new WorkTaskSchedule("task3");
		
		executorService.schedule(task1, 10, TimeUnit.SECONDS);
		executorService.schedule(task2, 20, TimeUnit.SECONDS);
		executorService.schedule(task3, 30, TimeUnit.SECONDS);
		
		executorService.shutdown();
	}	
	
}
