package org.java.version.jdk8;

import java.util.function.UnaryOperator;

//UnaryOperator<T> – a Function with same input/output type
public class UnaryOperatorExample {

    public static void main(String[] args){
       // UnaryOperator<String> makeUpper = s -> s.toUpperCase();
        UnaryOperator<String> makeUpper = String::toUpperCase;
        System.out.println(makeUpper.apply("unary"));
    }
}
