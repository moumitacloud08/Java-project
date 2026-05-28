package org.java.version.jdk8;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample1 {
    public static void main(String[] args) {
        List<List<String>> list = List.of(
                List.of("A","B"),
                List.of("C","D"));
        List<String> result = list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
