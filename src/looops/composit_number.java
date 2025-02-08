package looops;

import java.util.Scanner;

public class composit_number {public static void main(String[] args) {
    System.out.println("please enter the number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 2; i <=n-1 ; i++) {
        if (n%i==0){///i is a factor
            System.out.println("composite number");
            break;
        }
    }
}}
