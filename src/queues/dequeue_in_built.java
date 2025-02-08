package queues;

import java.util.*;

public class dequeue_in_built {
    public static void main(String[] args) {
        Deque<Integer>dq= new LinkedList<>();

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.addFirst(5);
        System.out.println(dq);
        dq.removeLast();// remove last
        System.out.println(dq);
        dq.removeFirst();//remove first
        System.out.println(dq);
        dq.removeAll(dq);//delete  everything
        dq.remove();//first remove
        dq.add(52);//add last
        dq.removeFirstOccurrence(1);//pure queue me trevel karega jab tak fiRst wale one ko delete
        dq.removeLastOccurrence(1);//pure queue me trevel karega jab tak  LAST wale one ko delete
        System.out.println(dq);
    }
}
