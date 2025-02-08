package pattern_printing.composite_pattern;

import java.util.Scanner;

public class star_pyramid {public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of row and coloumn ");
    int m = sc.nextInt();
    for (int i = 1; i <= m ; i++) {
        for (int j = 1; j <= m-i; j++) {/////simple code of flipped triangle
            System.out.print("  ");}
        for (int k = 1; k <=2*i-1 ; k++) {///simple code of square
            System.out.print("* ");

        }
        System.out.println();

    }
}

}
