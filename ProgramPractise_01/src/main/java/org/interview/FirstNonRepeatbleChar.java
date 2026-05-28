package org.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatbleChar {

    public static Character findFirstNonRepeatableChar(String input){
        Map<Character,Integer> charCountMap = new LinkedHashMap<>();

        for(char c:input.toCharArray()){
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: charCountMap.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }

        /*JAVA 1.8*/
       /* return charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);*/

        return null;
    }

    public static void main(String[] main){
        String input = "swiss";
        System.out.println(findFirstNonRepeatableChar(input));
    }
}
