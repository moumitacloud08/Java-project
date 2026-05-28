package org.example.thread.multithreadenhancement.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo {
    public static void main(String[] args){
        PrintJob[] jobs = {
            new PrintJob("Naruto"),
            new PrintJob("Sasuke"),
            new PrintJob("Sakura"),
            new PrintJob("Itachi"),
            new PrintJob("Jiraya"),
            new PrintJob("Tsunade"),
        };
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (PrintJob job:jobs){
            service.submit(job);
        }
        service.shutdown();
    }
}
