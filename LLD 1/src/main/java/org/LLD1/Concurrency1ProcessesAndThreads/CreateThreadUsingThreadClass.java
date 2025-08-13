package org.LLD1.Concurrency1ProcessesAndThreads;

public class CreateThreadUsingThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("Thread using class => " + Thread.currentThread().getName());
    }
}
