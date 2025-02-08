package stacks;

import java.util.Stack;

public class postfix_to_infix {

    public static void main(String[] args) {
        String post = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for (int i = 0; i < post.length(); i++) {
            char ch = post.charAt(i);
            int ascci = (int) ch;
            if (ascci >= 48 && ascci <= 57) {
                String s = "" + ch;
                val.push(s);
            } else {
                String v2 = val.pop();
                String v1 = val.pop();
                if (ch == '+') val.push('('+v1 +ch+ v2+')' );
                if (ch == '-') val.push('('+v1+ch + v2+')' );
                if (ch == '*') val.push('('+v1+ch+ v2+')');
                if (ch == '/') val.push('('+v1+ch+ v2+')' );
            }


        }
        System.out.println(val.peek());
    }
}