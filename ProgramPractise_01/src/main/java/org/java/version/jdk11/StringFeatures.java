package org.java.version.jdk11;

public class StringFeatures {
    protected  void example(){
        String str = "   Hello Java 11   ";
        System.out.println(str.isBlank());
        System.out.println(str.strip());
        System.out.println("Line1\nLine2".lines().count());
        System.out.println("Hi ".repeat(3));

    }
}
