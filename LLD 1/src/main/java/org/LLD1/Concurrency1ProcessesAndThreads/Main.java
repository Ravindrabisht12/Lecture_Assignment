package org.LLD1.Concurrency1ProcessesAndThreads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Working fine");


        /*
          We have two option to create threads
          1. Using Thread class
          2. Using Runnable interface -> Preferred method
         */


        // Thread class Example
        // Here is the example how to create thread using Thread class
        // Current execution is parallel as both using different thread to execute
        CreateThreadUsingThreadClass t1 = new CreateThreadUsingThreadClass();
        CreateThreadUsingThreadClass t2 = new CreateThreadUsingThreadClass();
        t1.start();
        t2.start();


        // Runnable Interface example
        // Current execution is parallel as both using different thread to execute
        CreateThreadUsingRunnable r1 = new CreateThreadUsingRunnable();
        // Thread using runnable class
        Thread t3 = new Thread(r1);
        t3.start();
        Thread t4 = new Thread(r1);
        t4.start();
    }
}
