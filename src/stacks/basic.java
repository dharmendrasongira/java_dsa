package stacks;
import java.util.Stack;
public class basic {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack <>();
        st.isEmpty();//khali hai ki nahi check
        st.push(10);//adding elements
        st.push(20); st.push(30); st.push(40);
        st.isEmpty();
        st.size();//for length
        st.pop();//remove element
        System.out.println(st);
        System.out.println(st.peek());//last element (top)enterted display karta hai
        System.out.println(st.pop());//remove karke print
        System.out.println(st.size());
        //to access first element inserted in stack
        while(st.size()>1){
            st.pop();
        }

        System.out.println(st);
        System.out.println(st.peek());
    }
}
