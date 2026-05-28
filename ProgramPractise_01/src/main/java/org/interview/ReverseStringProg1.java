package org.interview;

public class ReverseStringProg1 {

    public static void main(String[] main){
        String input = "hello";
        String reversed = "";

        for(int i = input.length() - 1;i >=0;i--){
            reversed = reversed + input.charAt(i);
        }

        System.out.println(reversed);
    }
}
