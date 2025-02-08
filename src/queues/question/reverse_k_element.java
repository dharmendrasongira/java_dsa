package queues.question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;




public class reverse_k_element {
    public static void reverse( Queue<Integer> q,int k){
        Stack<Integer> st=new Stack<>();
        int n=q.size();
        for (int i = 1; i <=k; i++) {
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for (int i = 1; i <=n-k; i++) {
            q.add(q.remove());
        }

    }
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k=3;

        System.out.println(q);
        reverse(q,k);
        System.out.println(q);
    }
}

