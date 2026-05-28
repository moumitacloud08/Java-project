package org.leetcode.strings;

public class FirstOccurenceInString {

    public static int strStr(String haystack, String needle) {

        int index = haystack.indexOf(needle);
        return index;

    }
    public static void main(String[] args){

        String haystack ="sadbutsad";
        String needle="sad";
        int index = FirstOccurenceInString.strStr(haystack,needle);
        System.out.println(index);

//        String haystack ="leetcode";
//        String needle="leeto";
//        int index = FirstOccurenceInString.strStr(haystack,needle);
//        System.out.println(index);
    }
}
