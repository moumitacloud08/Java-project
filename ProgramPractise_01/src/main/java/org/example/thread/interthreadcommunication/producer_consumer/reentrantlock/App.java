package org.example.thread.interthreadcommunication.producer_consumer.reentrantlock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockWorker {
    private static final Logger logger = LogManager.getLogger(LockWorker.class);
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void producer() throws InterruptedException {
        lock.lock();
        logger.info("Producer method.....");
        //wait()
        condition.await();
        logger.info("Again the producer method");
        lock.unlock();

    }

    public void consumer() throws InterruptedException {
        //We want to make sure that we start with producer()
        Thread.sleep(2000);
        lock.lock();
        logger.info("Consumer method...");
        Thread.sleep(3000);
        //notify()
        condition.signal();
        lock.unlock();
    }
}

public class App {

    public static void main(String[] args) {

        LockWorker worker = new LockWorker();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    worker.producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    worker.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
