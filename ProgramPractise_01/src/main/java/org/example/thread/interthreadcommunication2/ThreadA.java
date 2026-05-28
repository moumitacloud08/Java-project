package org.example.thread.interthreadcommunication2;

public class ThreadA {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b){
            System.out.println("main thread trying to call wait() method");
            b.wait();
            System.out.println("main thread got notification");
            System.out.println(b.total);
        }
    }

}
