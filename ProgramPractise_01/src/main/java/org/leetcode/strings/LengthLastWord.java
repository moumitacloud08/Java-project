package org.leetcode.strings;

public class LengthLastWord {
    public static int lengthOfLastWord(String s) {
         String[] sarray = s.split(" ");
         return sarray[sarray.length-1].length();
    }
    public static void main(String[] args){

        String s ="   fly me   to   the moon  ";
        int len = LengthLastWord.lengthOfLastWord(s);
        System.out.println(len);
    }
}
