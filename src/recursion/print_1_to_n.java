package recursion;

import java.util.Scanner;

public class print_1_to_n {

    //static int n;
    //global varible

    public static void print(int u,int n){
        if (u>n)return;
        System.out.println(u);
        print(u+1,n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number :");
        int n= sc.nextInt();
      print(1,n);

    }
}
