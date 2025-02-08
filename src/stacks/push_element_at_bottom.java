package stacks;

import java.util.Stack;

public class push_element_at_bottom {
    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();

        st.push(10);//adding elements
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.print(st);
        System.out.println();
        Stack <Integer> st1=new Stack<>();
        while(st.size()>0){

            st1.push(st.pop());
        }
        st.push(50);
        System.out.println();


        // while(st.size()>0){
        while(!st1.isEmpty()){
            st.push(st1.pop());
        }
        System.out.print(st);


}}
