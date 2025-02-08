package stacks;

import java.util.Stack;

public class underflow__overflow {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);//adding elements
        st.push(20);
        st.push(30);
        st.push(40);


        //under flow
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);




    }
}