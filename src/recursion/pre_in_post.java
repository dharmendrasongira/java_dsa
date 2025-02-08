package recursion;

import java.util.Scanner;

public class pre_in_post {
    public  static  void pip(int n){
        if (n==0)return;
        System.out.println("pre "+n);
        pip(n-1);
        System.out.println("in"+n);
        pip(n-1);
        System.out.println("post"+n);

    }

    public static void main(String[] args) {
        System.out.println("please enter any number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pip(n);
    }
}
