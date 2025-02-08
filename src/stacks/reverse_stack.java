package stacks;

import java.util.Stack;

public class reverse_stack {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();

        st.push(10);//adding elements
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.print(st);
        System.out.println();
        Stack <Integer> st1=new Stack<>();
        while(!st.isEmpty()){
//            int element=st.pop();
//            st1.push(element);
              st1.push(st.pop());
        }
        System.out.print(st1);
    }
}
