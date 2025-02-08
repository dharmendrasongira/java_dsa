package array;

import java.util.Scanner;

public class output_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" please enter size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        //input loops

        System.out.println(" please enter elements  of array");
        for (int i=0;i<=n-1;i++){
      arr[i] =sc.nextInt();
        }
        //output loops

        System.out.println(" your array is ");
        for (int i=0;i<=n-1;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
