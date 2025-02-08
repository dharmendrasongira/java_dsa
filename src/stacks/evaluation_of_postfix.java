package stacks;

import java.util.Stack;

public class evaluation_of_postfix {
    public static void main(String[] args) {
        String post = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for (int i = 0; i < post.length(); i++) {
            int ch = post.charAt(i);
            int ascci= (int )ch;
            if ( ascci>= 48 &&ascci<=57){
                val.push(ascci-48);
            }
            else{
                int v2=val.pop();
                int v1= val.pop();
                if(ch=='+')val.push(v1+v2);
                if(ch=='-')val.push(v1-v2);
                if(ch=='*')val.push(v1*v2);
                if(ch=='/')val.push(v1/v2);
            }


            }
        System.out.println(val.peek());
        }

    }
