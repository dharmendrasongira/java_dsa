package stacks;
//leetcode 1047
import java.util.Scanner;
import java.util.Stack;


public class Remove_All_Adjacent_Duplicates_In_String_1047 {
    public static String removeDuplicates(String s) {
        Stack <Character> st= new Stack <Character>();
        for (char c:s.toCharArray()) {
            if ( st.isEmpty() )  st.push(c);
            else if (c==st.peek()&& !st.isEmpty() ) st.pop();
            else st.push(c);
        }

        StringBuilder op= new StringBuilder ();

        while (!st.isEmpty()){
            op.append (st.pop());

        }
        return op.reverse().toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        removeDuplicates(s);
    }
}