package conditionals;

import java.util.Scanner;

public class triangle_check { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the side A:");
    int A = sc.nextInt();
    System.out.println("please enter the side B:");
    int B = sc.nextInt();
    System.out.println("please enter the side C:");
    int C = sc.nextInt();

    if ((A+B)>C && (A+C)>B && (C+B)>A) {
        System.out.println(" VALID TRIANGLE");
    } else {
        System.out.println("INVALID TRIANGLE");
    }
}}