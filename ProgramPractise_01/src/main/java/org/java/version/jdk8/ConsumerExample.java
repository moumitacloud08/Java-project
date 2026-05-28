package org.java.version.jdk8;

import java.util.function.Consumer;

//Consumer<T> – accepts a value, returns nothing
public class ConsumerExample {
    public static void main(String[] args){
        Consumer<String> printUpper = str -> System.out.println(str.toUpperCase());
        printUpper.accept("Java Functional Interface");
    }
}
