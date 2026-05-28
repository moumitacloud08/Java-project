package org.java.version.jdk8;

import java.util.function.BiPredicate;

//BiPredicate<T, U> – two inputs, returns boolean
public class BiPredicateExample {
    public static void main(String[] args){
        //BiPredicate<String,String> equalIgnorecase = (a,b) -> a.equalsIgnoreCase(b);
        BiPredicate<String,String> equalIgnorecase = String::equalsIgnoreCase;
        System.out.println(equalIgnorecase.test("JAVA","java"));
    }
}
