package org.leetcode.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class Foo  {
    private final ReentrantLock lock = new ReentrantLock();
    public Foo() {

    }
    public  void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        try {
            System.out.println("First");
            printFirst.run();
        }finally {
            lock.unlock();
        }
    }
    public  void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        try{
            System.out.println("Second");
            printSecond.run();
        }finally {
            lock.unlock();
        }

    }
    public  void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        try{
            System.out.println("Third");
            printThird.run();
        }finally {
            lock.unlock();
        }

    }
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()
//                + ", executing run() method!");
//    }
    // Main Method
    public static void main(String[] args) throws InterruptedException {

        Foo foo = new Foo();

        Thread t1 = new Thread();
        t1.start();
        foo.first(t1);

        Thread t3 = new Thread();
        t3.start();
        foo.third(t3);

        Thread t2 = new Thread();
        t2.start();
        foo.second(t2);

    }
}
