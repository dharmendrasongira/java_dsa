package recursion;

import java.util.Scanner;

public class print_1_to_n_after_call{
 public static void rec(int n){
        if (n==0)  return;//base case
        rec(n-1);//call
     System.out.println(n); //work
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter number :");
        int n=sc.nextInt();
        rec(n);

    }
}
