package stacks;

import java.util.Stack;


public class prefix_to_postfix {
    public static void main(String[] args) {
        String pre= "-9/*+5346";
        Stack<String> val = new Stack<>();
        for (int i = pre.length()-1; i >=0; i--) {
            char ch = pre.charAt(i);
            int ascci= (int )ch;
            if ( ascci>= 48 &&ascci<=57){
                String s= "" +ch;
                val.push(s);
            }
            else{
                String v1=val.pop();
                String v2= val.pop();
                if(ch=='+')val.push(v1+v2+ch);
                if(ch=='-')val.push(v1+v2+ch);
                if(ch=='*')val.push(v1+v2+ch);
                if(ch=='/')val.push(v1+v2+ch);
            }


        }
        System.out.println(val.peek());
    }

}


