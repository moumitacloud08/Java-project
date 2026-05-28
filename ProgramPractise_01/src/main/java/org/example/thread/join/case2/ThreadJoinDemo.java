package org.example.thread.join.case2;

public class ThreadJoinDemo {

    public static void main(String[] args) throws InterruptedException {
        MyThread.mt = Thread.currentThread();
        MyThread t = new MyThread();
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}
