package Linked_List;

public class reverse_ll_by_recurssion {
}/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution1{
    public ListNode reverseList(ListNode head) {


        if (head ==null||head.next==null) return head;
        ListNode a = head.next;
        ListNode newhead=reverseList(a);

        a.next =head;
        head.next =null;
        return newhead;
    }
}

