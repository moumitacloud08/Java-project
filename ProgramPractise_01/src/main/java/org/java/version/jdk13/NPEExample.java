package org.java.version.jdk13;

/**
 * It is actual a standard feature of jdk 14
 * Helpful NullPointerExceptions : The error message
 */
public class NPEExample {
    public static void main(String[] args){
        Person p = null;
        System.out.println(p.name);
    }
}
class Person{
    String name;
}