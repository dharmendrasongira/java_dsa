package Linked_List;

public class palindrome {/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode reverseList(ListNode head) {


        if (head ==null||head.next==null) return head;
        ListNode a = head.next;
        ListNode newhead=reverseList(a);
        a.next =head;
        head.next =null;
        return newhead;
    }
    public boolean isPalindrome(ListNode head) {
        if (head.next==null)return true;
        ListNode slow= head;
        ListNode fast= head;
        while (fast!=null&&fast.next !=null){

            slow=slow.next;
            fast=fast.next.next;}
        ListNode j=reverseList(slow);
        ListNode i= head;
        while (j!=null){
            if  (i.val!=j.val)   return false;
            else { i=i.next;
                j=j.next;}
        }
        return true; }
}
}
