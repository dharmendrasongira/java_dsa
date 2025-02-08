package array;

import java.util.Scanner;

public class rollnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= {10,55,0,8,8,71};
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]<35){
                System.out.println(i+ " ");
            }

        }

    }
}
