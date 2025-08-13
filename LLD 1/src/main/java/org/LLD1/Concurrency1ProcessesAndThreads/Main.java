package org.LLD1.Concurrency1ProcessesAndThreads;

public class Main {
    public static void main(String[] args) {
        /*
          We have two option to create threads
          1. Using Thread class
          2. Using Runnable interface -> Preferred method

          Why Runnable interface preferred?
          - Runnable represents what to do (the task).
          - Thread represents how to run it (the execution mechanism).
          - By using Runnable, you keep your task logic separate from the thread implementation — makes your code more flexible.
          - You have option to extend another useful parent class eg. class NewThread extends SomeOtherClass implements Runnable
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
