package Linked_List;

public class remove_nth_node_from_end {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head;
        ListNode fast = head;
        for (int i=1 ;i<=n;i++){
            fast=fast.next;
        }
        if (fast==null){return head.next;}
        while (fast.next!=null){
            slow=slow.next;
            fast= fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
}
