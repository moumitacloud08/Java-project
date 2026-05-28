package org.java.version.jdk8;

import java.util.Optional;

public class OptionalExample {

    public  static void main(String[] args){
        Optional<String> name = Optional.ofNullable("Java 8");
        name.ifPresent(n -> System.out.println("Hello "+n));
        System.out.println(name.orElse("No name provided"));
    }
}
