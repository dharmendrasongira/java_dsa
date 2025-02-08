package array;

import java.util.Scanner;

public class rotate_array {
    public static void reverse(int[]arr,int i,int j) {
        while (i <= j) {
            int temp= arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i++;
         j--;
        }
    }
    public static void main(String[] args) {
        int[]arr={10,20,30,55,44,999};
        int n= arr.length;
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
         k = k%n;
        reverse( arr,0,n-k-1);
        reverse( arr,n-k,n-1);
        reverse( arr,0,n-1);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
