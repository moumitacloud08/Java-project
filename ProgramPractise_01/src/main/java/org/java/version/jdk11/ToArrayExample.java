package org.java.version.jdk11;

import java.util.List;

public class ToArrayExample {
    public static void main(String[] args){
        List<String> list = List.of("A","B","C");

        String[] array = list.toArray(String[]::new);

        for(String s:array){
            System.out.println(s);
        }
    }
}
