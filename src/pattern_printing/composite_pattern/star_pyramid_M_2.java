package pattern_printing.composite_pattern;

import java.util.Scanner;

public class star_pyramid_M_2 {public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of row and coloumn ");
    int m = sc.nextInt();
    int nsp=m-1;
    int nst=1;
    for (int i = 1; i <= m ; i++) {
        for (int j = 1; j <=nsp; j++) {/////simple code of flipped triangle
            System.out.print("  ");}
        for (int k = 1; k <=nst ; k++) {///simple code of square
            System.out.print("* ");

        }
        System.out.println();
        nsp--;
        nst +=2;

    }
}
}

