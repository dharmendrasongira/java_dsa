package looops;

import java.util.Scanner;

public class one_to_n_loop {public static void main(String[] args) {
    System.out.println("please enter the number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i =1; i<=n; i++) {
        System.out.println(i);
    }}}