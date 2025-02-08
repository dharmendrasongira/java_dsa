package queues.question;

import java.util.*;
import java.util.Queue;


public class reverse_the_queue {
    public static void reverse( Queue<Integer> q){
        Stack<Integer>st=new Stack<>();
        while (!q.isEmpty()){
           st.push( q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        reverse(q);
        System.out.println(q);
    }
}
