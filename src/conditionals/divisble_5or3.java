package conditionals;

import java.util.Scanner;

public class divisble_5or3 { public static void main(String[] args) {

    System.out.println("please enter the number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if ( n%3==0 ||n%5==0 ) {
        System.out.println(" Given number is divisible by 5 and 3");
    } else {
        System.out.println(" Given number is  not divisible by 5 and 3");
    }
}}
