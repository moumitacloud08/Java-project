package org.leetcode.LinkedList.append;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(5);
       // myLinkedList.append(11);


        myLinkedList.printAll();


        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2

        	Linked List:
        	1
        	2

     	*/

    }

}


