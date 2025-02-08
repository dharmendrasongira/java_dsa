package Linked_List;




///**
// * Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode middleNode(ListNode head) {
//        ListNode temp= head;
//        int length=0;
//        while(temp !=null){
//            temp = temp.next;
//            length++;
//
//        }
//        int mid = length/2 +1;
//        ListNode t= head;
//        for(int i=1; i<=mid-1;i++ ){
//            t= t.next;
//        }
//        return t;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next !=null && fast !=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

public class middle_element_of_linked_list {



    public static void main(String[] args) {

    }
}
