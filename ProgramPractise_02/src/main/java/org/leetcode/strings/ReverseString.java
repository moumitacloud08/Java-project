package org.leetcode.strings;

/**
 * Reverse a char array using
 * In-place algorithm
 */
public class ReverseString {
    public static void reverseString(char[] s) {

        for (int i = s.length - 1,j =0;  j < i; i--,j++) {
            System.out.println(j+"...."+i);
                char temp = s[j];
                s[j] = s[i];
                s[i] = temp;
                System.out.println(s[j]);
            }

        System.out.println(s);
    }

    public static void main(String[] args){
        //char[] chars = {"h","e","l","l","o"};
        char[] chars = new char[5];
        chars[0] = 'h';
        chars[1] = 'e';
        chars[2] = 'l';
        chars[3] = 'l';
        chars[4] = '0';


        ReverseString.reverseString(chars);
    }

}
