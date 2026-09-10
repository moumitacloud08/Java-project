package org.leetcode.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class Foo2 {

    boolean isFirst = false;
    boolean isSecond = false;

    public Foo2() {
        isFirst = false;
        isSecond = false;
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        isFirst = true;
        notifyAll();

    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (!isFirst)
            wait();
        printSecond.run();
        isSecond = true;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (!isSecond)
            wait();
        printThird.run();
    }

    // Main Method
    public static void main(String[] args) throws InterruptedException {

        Foo2 foo = new Foo2();
        // Runnable tasks for each print
        Runnable printFirst = new Runnable() {
            @Override
            public void run() {
                System.out.println("First task executed.");
            }
        };

        Runnable printSecond = new Runnable() {
            @Override
            public void run() {
                System.out.println("Second task executed.");
            }
        };

        Runnable printThird = new Runnable() {
            @Override
            public void run() {
                System.out.println("Third task executed.");
            }
        };

        // Threads for each method to execute in the desired order
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    foo.first(printFirst);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    foo.second(printSecond);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    foo.third(printThird);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Start the threads

        thread3.start();
        thread2.start();
        thread1.start();

    }
}
