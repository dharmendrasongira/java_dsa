package pattern_printing.composite_pattern;

import java.util.Scanner;

public class number_spiral {public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of row and coloumn ");
    int m = sc.nextInt();
    for (int i = 1; i <=2*m-1; i++) {
        for (int j = 1; j <= 2*m-1; j++){
        int a= i,b =j;
        if (i>m) a=2*m-i;
        if (j>m) b=2*m-j;

               System.out.print(Math.min(a,b)+" ");}

        System.out.println();}

    }
}
