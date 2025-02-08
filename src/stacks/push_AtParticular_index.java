package stacks;

import java.util.Stack;

public class push_AtParticular_index {
        public static void main(String[] args) {
            int index;
            Stack<Integer> st=new Stack<>();
             index=2;
            st.push(10);//adding elements
            st.push(20);
            st.push(30);
            st.push(40);
            System.out.print(st);
            System.out.println();
            Stack <Integer> st1=new Stack<>();
            while(st.size()>index){

                st1.push(st.pop());
            }
            st.push(50);
            System.out.println();

            while(!st1.isEmpty()){
                st.push(st1.pop());
            }
            System.out.print(st);


        }}


