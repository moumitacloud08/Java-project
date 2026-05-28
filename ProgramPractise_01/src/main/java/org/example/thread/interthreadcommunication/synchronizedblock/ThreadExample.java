package org.example.thread.interthreadcommunication.synchronizedblock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadExample {

    private static final Logger logger = LogManager.getLogger(ThreadExample.class);

    private int counter1;
    private int counter2;

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public  void increment1(){
        synchronized (lock1){
            counter1++;
        }
    }
    public  void increment2(){
        synchronized (lock2){
            counter2++;
        }
    }

    public void execute(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment1();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment2();
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

        logger.info("Counter1 value is : {}", counter1);
        logger.info("Counter2 value is : {}", counter2);
    }



}
