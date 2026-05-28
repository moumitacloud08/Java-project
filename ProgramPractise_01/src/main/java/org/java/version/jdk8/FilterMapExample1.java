package org.java.version.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterMapExample1 {
    public static void main(String[] args){

        /**
         * List.of() does NOT allow null values (Java 9+ feature).
         * As soon as Java sees null, it throws a NullPointerException.
         */
       // List<String> data = List.of("Java", null, "Stream", null);
        List<String> data = Arrays.asList("Java", null, "Stream", null);


        List<Integer> lengths =
            data.stream()
                    .filter(Objects::nonNull)
                    .map(String::length)
                    .collect(Collectors.toList());
        System.out.println(lengths);
    }
}
