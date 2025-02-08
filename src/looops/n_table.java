package looops;

import java.util.Scanner;

public class n_table {public static void main(String[] args) {
    System.out.println("please enter the number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i =n; i<=n*10; i+=n) {
        System.out.println(i);
    }}}


