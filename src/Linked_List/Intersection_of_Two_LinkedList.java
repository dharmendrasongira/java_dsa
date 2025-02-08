package Linked_List;


 //Definition for singly-linked list.
// class ListNode{
//     int val;
//   ListNode next;
//      ListNode(int x) {
//          val = x;
//          next = null;
//      }
//  }

public class Intersection_of_Two_LinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;

        int length1=0;
        while (temp1 != null ){
            temp1 =temp1.next;
            length1++;
        }
        ListNode temp2 = headB;
        int length2=0;
        while (temp2!= null ){
            temp2 =temp2.next;
            length2++;
        }

        temp1= headA;
        temp2= headB;
        int  diff;

        if (length1>length2){
            diff= length1-length2;
            for (int i=1 ;i<=diff;i++){
                temp1 =temp1.next;

            } }
        else {diff =length2-length1;
            for (int i=1 ;i<=diff;i++){
                temp2 =temp2.next;
            }}

        while(temp1 !=temp2){
            temp1 =temp1.next;
            temp2 =temp2.next;
        }return temp2;
    }
}
