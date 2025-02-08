package basic;

import java.util.Scanner;

public class sumof2userinput {
    public static void main(String[] args) {
        System.out.println("please enter value of first no.");
        Scanner sc =new Scanner(System.in);
        double a= sc.nextDouble();
        System.out.println("please enter value of second no.");
        double b= sc.nextDouble();
        System.out.println(a+b);

    }
}
