package looops;

import java.util.Scanner;

public class gp {public static void main(String[] args) {
    System.out.println("please enter the number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 3, d = 4;
    for (int i = 1; i <= n; i++) {
        System.out.println(a);
        a *= d;
    }
}}