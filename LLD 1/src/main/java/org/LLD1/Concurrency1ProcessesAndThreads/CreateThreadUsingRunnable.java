package org.LLD1.Concurrency1ProcessesAndThreads;

import java.util.AbstractList;

public class CreateThreadUsingRunnable implements Runnable{
    public void run(){
        System.out.println("Thread using runnable => " +Thread.currentThread().getName());
    }
}
