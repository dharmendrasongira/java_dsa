package Linked_List;

public class local_minima_maxima {/**
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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode l=head;
        ListNode m=head.next;
        ListNode r=head.next.next;
        int idx =0;
        int first =-1;
        int last=-1;
        int []arr={-1,-1};
        int mindis=Integer.MAX_VALUE;

        while(r!=null )   {
            if(m.val<l.val&&m.val<r.val||m.val>l.val&&m.val>r.val)
            {
                if(first ==-1) first= idx;
                if(last !=-1){
                    int dis =idx-last;
                    mindis= Math.min(mindis,dis);
                }
                last=idx;
            }
            idx++;
            l=l.next;
            m=m.next;
            r=r.next;     }
        if (first==last)return arr;
        int max =last-first;
        arr[0]=mindis;
        arr[1]=max;
        return arr;
    }
}
}
