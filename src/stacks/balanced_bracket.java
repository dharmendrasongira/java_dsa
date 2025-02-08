package stacks;

import java.util.Scanner;
import java.util.Stack;



public class balanced_bracket {
    public static boolean isValid(String s) {
        Stack <Character> st= new Stack <Character>();
        for (char c:s.toCharArray()) {
            if ( c =='[')   st.push(']');
            else  if ( c=='{')   st.push('}');
            else  if ( c=='(')   st.push(')');

            else if ( st.isEmpty()|| st.pop()!=c) {return false;
            }}
        boolean x=  st.isEmpty();
        return x;

    }
    public static boolean isbalanced(String s) {
        Stack <Character> st= new Stack <Character>();
        int n=s.length();
        for (int i = 0; i < n; i++) {
            char ch =s.charAt(i);
            if(ch=='(')st.push(ch);
            else {st.pop();
                if(st.size()==0)return false;
                if (st.peek()=='(') st.pop();
        }

    }
    if (st.size()>0)return false;
    else return true;}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String s= sc.nextLine();
        isValid(s);
        ////leet code 20 valid prathesis

    }
}