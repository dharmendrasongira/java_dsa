package stacks;

import java.util.Stack;

    public class prefix_evalution  {
        public static void main(String[] args) {
            String post = "-9/*+  5346";
            Stack<Integer> val = new Stack<>();
            for (int i = post.length()-1; i >=0; i--) {
                int ch = post.charAt(i);
                int ascci= (int )ch;
                if ( ascci>= 48 &&ascci<=57){
                    val.push(ascci-48);
                }
                else{
                    int v1=val.pop();
                    int v2= val.pop();
                    if(ch=='+')val.push(v1+v2);
                    if(ch=='-')val.push(v1-v2);
                    if(ch=='*')val.push(v1*v2);
                    if(ch=='/')val.push(v1/v2);
                }


            }
            System.out.println(val.peek());
        }

    }


