package org.leetcode.hashmap;

import org.leetcode.strings.ReverseWords;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
       return false;
    }

    public static void main(String[] args){

        String ransomNote  ="aa";
        String magazine ="aab";
        boolean isPossible = RansomNote.canConstruct(ransomNote,magazine);
        System.out.println(isPossible);
    }
}
