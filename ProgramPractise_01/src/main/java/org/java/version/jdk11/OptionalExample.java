package org.java.version.jdk11;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] main){
        Optional<String> value = Optional.of("Java");

        if(value.isEmpty()){
            System.out.println("No value");
        }else{
            System.out.println(value.get());
        }
    }
}
