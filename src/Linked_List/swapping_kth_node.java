package Linked_List;

public class swapping_kth_node {
  
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode temp= head;
        for (int i=1;i<k;i++){

            fast=fast.next;
            temp=temp.next;
        }
        if (fast==null){return head.next;}
        while (fast.next!=null){
            slow=slow.next;
            fast= fast.next;
        }
        int  ok ;
        ok= temp.val;
        temp.val =slow.val;
        slow.val=ok;

        return head;
    }

}

}
