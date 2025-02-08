package array;

public class reversed_array_using_while_loops {
    public static void main(String[] args) {
        int arr[] = {10, 0, 0, 5, 58, 8, 48, 6,};
        int n = arr.length;
//output loops
        for (int i = 0; i <= n - 1; i++) {
            //   if (arr[i] > max) max = arr[i];
            System.out.print(arr[i]+" ");
        }
        int i=0;int j=n-1;
       while(i<=j){
            int temp =arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println( );
        System.out.println("reversed array");
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
