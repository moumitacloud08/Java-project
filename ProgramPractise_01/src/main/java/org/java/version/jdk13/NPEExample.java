package org.java.version.jdk13;

public class NPEExample {
    public static void main(String[] args){
        Person p = null;
        System.out.println(p.name);
    }
}
class Person{
    String name;
}