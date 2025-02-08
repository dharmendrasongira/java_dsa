package stacks;

import java.util.Stack;

public class display {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);//adding elements
        st.push(20);
        st.push(30);
        st.push(40);
      //  System.out.print(st);
        while(!st.isEmpty()){
            System.out.println(st.pop());

        }
    }
}