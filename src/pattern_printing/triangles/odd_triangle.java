package pattern_printing.triangles;

import java.util.Scanner;

public class odd_triangle {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row and coloumn ");
        int m = sc.nextInt();
        for (int i = 1; i <= m + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((2*j-1)+" ");

            }
            System.out.println();

        }
    }
}
