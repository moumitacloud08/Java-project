package org.example.thread.deadlock.case1;

public class A {
    public synchronized void d1(B b){
        System.out.println("Thread1 starts executing of  d1() method");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread2 trying to call B's last() method");
        b.last();
    }
    public synchronized void last(){
        System.out.println("Inside A last() method");
    }
}
