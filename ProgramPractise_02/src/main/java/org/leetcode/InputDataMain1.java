package org.leetcode;

import java.util.Scanner;

public class InputDataMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();

            String[] str = input.split(",");
            boolean subsequence = SubsequentCheck.isSubsequence(str[0], str[1]);
            System.out.println(subsequence);


        }
    }
}
