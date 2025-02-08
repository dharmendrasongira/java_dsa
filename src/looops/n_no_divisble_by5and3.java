package looops;

import java.util.Scanner;

public class n_no_divisble_by5and3 {public static void main(String[] args) {
    System.out.println("please enter the number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
        if (i% 3==0||i%5==0) System.out.println(i);

    }
}}