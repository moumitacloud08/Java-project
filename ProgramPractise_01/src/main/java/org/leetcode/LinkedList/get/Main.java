package org.leetcode.LinkedList.get;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(15);


        System.out.println(myLinkedList.get(0).value);


        /*
            EXPECTED OUTPUT:
            ----------------
            3

        */

    }

}
