package org.leetcode.sort;

import java.util.Arrays;

public class InsertionSort {

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j =i-1;
            int temp = array[i];
            while(j > -1 && temp < array[j]){
                array[j+1] = array[j];
                array[j] = temp;
                j --;
            }
        }
    }


    public static void main(String[] args) {

        int[] myArray = {4, 2, 6, 5, 1, 3};
        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }


}
