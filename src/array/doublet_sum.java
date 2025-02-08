package array;

import java.util.Scanner;

public class doublet_sum {
    public static void main(String[] args) {
        int []arr={10,55,66,88,99,44,5,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("target element");
        int x=sc.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
        if (x == arr[i] + arr[j]) System.out.println("the give no. is sum of "+arr[i]+"+"+arr[j]);

        }}}
    }

