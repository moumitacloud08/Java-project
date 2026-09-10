package org.leetcode.LinkedList.MergeTwoSortList;

public class ListNode {

      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }


}

class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current;
        current = dummy;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null)
            current.next = list1;
        else
            current.next = list2;

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String args[]){

        ListNode list1;
        ListNode list2;

        ListNode node2 = new ListNode(4);
        ListNode node1 = new ListNode(2,node2);
        list1 = new ListNode(1,node1);

        ListNode node22 = new ListNode(4);
        ListNode node21 = new ListNode(3,node22);
        list2 = new ListNode(1,node21);

        Solution.printList(list1);
        Solution.printList(list2);

        ListNode mlist = Solution.mergeTwoLists( list1,  list2);
        Solution.printList(mlist);
    }
}
