package org.example.thread.interthreadcommunication.locking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassLocking {
    private static final Logger logger = LogManager.getLogger(ClassLocking.class);

    public static synchronized void instanceMethod() {
        logger.info(Thread.currentThread().getName() + " entered instanceMethod...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logger.info(Thread.currentThread().getName() + " finished instanceMethod...");
    }

}

   class App2{
    public static void main(String[] args){

        Runnable task1 = ClassLocking::instanceMethod;
        Runnable task2 = ClassLocking::instanceMethod;

        new Thread(task1,"First Thread").start();
        new Thread(task2,"Second Thread").start();
    }
}
