package org.example.thread.interthreadcommunication1;

public class ThreadA {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
       // Thread.sleep(10000);
        b.join();
        System.out.println(b.total);
    }
}
