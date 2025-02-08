package basic;

import java.util.Scanner;

public class asii_value_finder {
    public static void main(String[] args) {
        System.out.println("please enter character");
        Scanner sc =new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);
    }
}
