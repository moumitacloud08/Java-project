package org.leetcode;

public class SubsequentCheck {
    public static boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        if(t.length() >= s.length()){
           while(s.length() > i && t.length() > j){
               if(s.charAt(i) == t.charAt(j)){
                   i++;
               }
               j++;
           }
            return s.length() == i;
        }
        return false;
    }
}
