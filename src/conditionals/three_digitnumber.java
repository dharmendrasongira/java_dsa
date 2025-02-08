package conditionals;

import java.util.Scanner;

public class three_digitnumber {public static void main(String[] args) {
    System.out.println("please enter the number:");
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();

    if( 99<n && n<=1000){System.out.println(" Given number is 3 digit no."  );}
    else{System.out.println(" Given number is not 3 digit no." );}
}}
