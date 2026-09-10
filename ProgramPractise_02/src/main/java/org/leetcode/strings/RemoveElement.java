package org.leetcode.strings;

import java.util.Arrays;

public class RemoveElement {

    private static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i=0;i<nums.length; i++){
            if(nums[i] != val){
             int temp = nums[index] ;
             nums[index] = nums[i]  ;
             nums[i] = temp;
             index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
    public static void main(String[] args){

        int[] nums = new int[4];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 2;
        nums[3] = 3;

//        int[] nums = new int[8];
//        nums[0] = 0;
//        nums[1] = 1;
//        nums[2] = 2;
//        nums[3] = 2;
//        nums[4] = 3;
//        nums[5] = 0;
//        nums[6] = 4;
//        nums[7] = 2;


       int k =  RemoveElement.removeElement(nums,2);
       System.out.println(k);
    }


}
