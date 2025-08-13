package org.LLD1.Concurrency1ProcessesAndThreads;

public class CreateThreadUsingRunnable implements Runnable{
    public void run(){
        System.out.println("Thread using runnable => " +Thread.currentThread().getName());
    }
}
