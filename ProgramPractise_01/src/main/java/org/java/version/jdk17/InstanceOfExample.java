package org.java.version.jdk17;

public class InstanceOfExample {
    public static void main(String[] args){
        Object obj = "Hello Java 17";

        if(obj instanceof String s){
            System.out.println(s.toUpperCase());
        }
    }
}
