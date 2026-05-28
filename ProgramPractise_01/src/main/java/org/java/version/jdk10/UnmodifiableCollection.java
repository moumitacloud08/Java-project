package org.java.version.jdk10;

import java.util.ArrayList;
import java.util.List;

public class UnmodifiableCollection {

    List<Integer> someIntList = new ArrayList<>();

     UnmodifiableCollection(){
        someIntList.add(56);
        someIntList.add(98);
        someIntList.add(229);
    }

    protected void example1(){
        List<Integer> copyList = List.copyOf(someIntList);
       // copyList.add(45);
        copyList.forEach(i->System.out.println(i));
    }
}
