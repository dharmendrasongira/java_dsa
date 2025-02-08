package stacks;

import java.util.Stack;

public class reverse_stack_recursively {
    public static void reverse(Stack<Integer> st){
         if ( st.isEmpty())return ;;
        int top =st.pop();
        reverse(st);
        System.out.print(top +" ");
        st.push(top);
    }
    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        st.push(10);//adding elements
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.print(st);
        System.out.println();

        reverse(st);
}}
