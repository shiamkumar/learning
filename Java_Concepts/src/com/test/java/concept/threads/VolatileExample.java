package com.test.java.concept.threads;

public class VolatileExample extends Thread {
	 //Remove the volatile keyword and see
	volatile boolean keepRunningFlag = true;
	 
    public void run() {
        System.out.println("Volatile thread running");
        long counter = 0;
        while (keepRunningFlag) {
            counter++;
        }
        System.out.println("Volatile thread terminated." + counter);
    }
 
    public static void main(String[] args) throws InterruptedException {
        //Code below is executing under Main Thread
        VolatileExample volatileThread = new VolatileExample();
        volatileThread.start();
 
        Thread.sleep(1000);
 
        //Main Thread is changing the value of keepRunningFlag to false. Ideally after this changes,
        //volatileThread created above executing the run method should come out of the while loop,
        //but if you don't declare the variable keepRunningFlag as volatile then there is no guarantee when while loop will break.
        //How this works internally without volatile keyword,
        //Main thread say running in CPU core 1 updates the keepRunningFlag to false which is updated in Main thread CPU cache
        //volatileThread say running in CPU core 2 also has local CPU cache which before starting the thread had cached the variable
        //keepRunningFlag to its local cache as false.
        //So any updates on the local variable not marked as volatile will first get updated to its local CPU cache.
        //No when the local cache value will sync with Main memory is internal to CPU and that is where problem happens.
        //When we mark the variable as volatile, we are instructing CPU as not to read/write the value of this variable to
        //your local cache, instead directly read/write from main memory.
        volatileThread.keepRunningFlag = false;
 
        System.out.println("Main thread ended, keepRunningFlag = " + volatileThread.keepRunningFlag);
    }
}
