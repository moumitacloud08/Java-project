package org.example.thread.interthreadcommunication1;

public class ThreadB extends Thread{
    int total=0;
    public void run(){
        for(int i=1;i<=10;i++){
            total = total+i;
        }
    }
}
