package stacks;
 

import java.util.Stack; 

public class privous_greatest_element {
    static void pregreatest (int[]nums,int n){
        Stack<Integer> st= new Stack<>();
        st.push(nums[0]);
        System.out.println("-1");
        for (int i = 1; i <n; i++) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();}
                if (st.isEmpty()) System.out.println("-1");
                else System.out.println(st.peek() + " ");
                st.push(nums[i]);

        }

    }
 
    public static void main(String[] args) {
    int[] arr={15,5,47,66,4,12,4};
    int n = arr.length;
    pregreatest(arr,n);
    
     

}}
