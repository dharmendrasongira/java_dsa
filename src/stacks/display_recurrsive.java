package stacks;

import java.util.Stack;

public class display_recurrsive {
    public static void display(Stack<Integer> st){
        if(st.size()==0 )return;
        int top =st.pop();
  ///     System.out.println(top+" ");
        display(st);
        System.out.println(top+" ");
        st.push(top);

    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);//adding elements
        st.push(20);
        st.push(30);
        st.push(40);
        //  System.out.print(st);
        display(st);
    }}