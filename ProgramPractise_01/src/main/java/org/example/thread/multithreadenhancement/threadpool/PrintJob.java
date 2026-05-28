package org.example.thread.multithreadenhancement.threadpool;

public class PrintJob implements Runnable{
    String name;
    PrintJob(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name+"....Job Started by Thread:"+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println( name + "....Job completed by Thread "+ Thread.currentThread().getName());
    }
}
