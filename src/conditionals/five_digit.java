package conditionals;

import java.util.Scanner;

public class five_digit {
    public static void main(String[] args) {

        System.out.println("please enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (9999 < n && n <= 100000) {
            System.out.println(" Given number is 5 digit no.");
        } else {
            System.out.println(" Given number is not 5 digit no.");
        }
    }
}