package org.example.thread.interthreadcommunication2;

public class ThreadB extends Thread{
    int total=0;
    public void run(){
        synchronized (this){
            System.out.println("Child Thread starts communication");
            for(int i=1;i<=10;i++){
                total = total+i;
            }
            System.out.println("Child Thread trying to give notification");
            this.notify();

        }
    }
}
