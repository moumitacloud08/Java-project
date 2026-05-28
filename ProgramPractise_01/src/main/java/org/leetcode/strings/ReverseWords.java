package org.leetcode.strings;

import java.util.Arrays;

public class ReverseWords {

    public static String reverseWords(String s) {
        String[] sarray = s.split(" ");

        for(int i =0,j=sarray.length-1 ; i<j ; i++,j--){
            String temp = sarray[i];
            sarray[i] = sarray[j];
            sarray[j] = temp;
        }
        s = String.join(" ",sarray);
        return s.replaceAll(",","").replaceAll("\\s+"," ").trim();
    }

    public static void main(String[] args){

        String s ="   fly me   to   the moon  ";
        String str = ReverseWords.reverseWords(s);
        System.out.println(str);
    }
}
