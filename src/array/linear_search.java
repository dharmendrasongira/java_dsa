package array;

import java.util.Scanner;

public class linear_search { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" please enter size of array");
    int n= sc.nextInt();
    int arr[]=new int[n];
    //input loops

    System.out.println(" please enter elements  of array");
    for (int i=0;i<=n-1;i++){
        arr[i] =sc.nextInt();
    }
    System.out.println("please enter target element ");
    int x =sc.nextInt();

boolean flag = false;
    for (int i = 0; i <n; i++) {

    if (x == arr[i])  flag=true;
    }
    if(flag==true) System.out.println("element found");
    else System.out.println(" element not present");
}}

