package Linked_List;

public class reverse_linked_list {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode curr= head;
            ListNode prev= null;
            ListNode N=head;
            while (curr != null)
            { N =curr.next;
                curr.next = prev;
                prev= curr;
                curr=N;
            }
            return prev;   }
    }
}
