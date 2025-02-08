package stacks;

import java.util.Stack;

public class stock_span {
   static void printarray(int []arr){
        for(int ele:arr){
            System.out.println(ele);
        }
    }

    public static int[] stock(int[] arr) {
        Stack<Integer> st= new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        st.push(0);
        ans[0]=1;

        for (int i = 1; i <n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if(st.isEmpty()){
            ans[i]=i+1;}
        else {  ans[i] = i - st.peek();
        }
            st.push(i);
        }
        return ans;
   }


    public static void main(String[] args) {
        int [] price ={ 10,4,5,6,120,80};
        int n= price.length;
        int [] ans= stock(price);
        printarray(ans);
    }
}
