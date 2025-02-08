package pattern_printing.composite_pattern;

import java.util.Scanner;

public class star_bridge {public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of row and coloumn ");
    int m = sc.nextInt();
    for (int l = 1; l <= 2*m-1 ; l++) {
        System.out.print("* ");

    }
    System.out.println(" ");
    for (int i = 1; i <= m ; i++) {
        for (int j = 1; j <= m-i; j++) {/////simple code of flipped triangle
            System.out.print("* ");}
        for (int l = 1; l <=2*i-1 ; l++) {///space pyramid code

            System.out.print("  ");
        }
        for (int k = 1; k <=m-i; k++) {//simple code of flipped triangle
            System.out.print("* ");}

        System.out.println();

    }
}
}
