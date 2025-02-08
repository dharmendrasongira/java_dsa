package stacks;
import java.util.Stack;

public class next_greatest_element {
  public static int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st= new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        st.push(arr[n-1]);
        ans[n-1]=-1;

      for (int i = n-2; i >=0; i--) {
          while (st.peek()<arr[i]&&st.size()>0)    st.pop();
          if (st.size()==0){ans[i]=-1;
          }
          else {ans [i]= st.peek();
              st.push(arr[i]);
      }
          st.push(arr[i]);
   }
      return ans;}
   public static void bruteforce (int []arr){

    int n= arr.length;
    int []res= new int[n];
        for (int i = 0; i <n ; i++) {
        res[i]=-1;
        for (int j = i; j <n ; j++) {
            if ( arr[i]< arr[j]){
                res[i]=arr[j];break;
            }

        }
    }
for(int ele : res){
    System.out.print(ele + " ");
}
   }


    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 540};

        bruteforce(arr);

        System.out.println( );
        int[] answer = nextGreaterElements(arr);
        for(int ele : answer){
            System.out.print(ele+" ");
        }
    }

}
