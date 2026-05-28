package org.example.thread.join.case1;

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
