package org.LLD1.Concurrency1ProcessesAndThreads.Examples;

public class Main {
    public static void main(String[] args) {

        for(int i=0; i<100; i++){
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
        }

    }
}
