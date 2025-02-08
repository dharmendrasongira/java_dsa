package Linked_List;

public class reverse_from_particular_position {/**
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


    public void reverse(ListNode head) {
        ListNode curr= head;
        ListNode prev= null;
        ListNode N=head;
        while (curr != null)
        { N =curr.next;
            curr.next = prev;
            prev= curr;
            curr=N;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next==null || left ==right) return head;
        ListNode temp= head;
        int length=1;
        ListNode a=null,b=null,c=null,d=null;
        while(temp != null){

            if (length==left-1 ){ a= temp;}
            else  if (length==left ){b= temp;}

            else if (length == right){ c= temp;}

            else if (length == right+1){ d= temp;}
            temp = temp.next;
            length++;
        }
        if (a!=null)  a.next =null;

        if (c!=null)   c.next =null;
        reverse(b);
        if (a!=null)   a.next= c;
        b.next=d;
        if (a==null) return c;
        return head;  }
}
}
