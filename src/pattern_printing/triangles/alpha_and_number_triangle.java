package pattern_printing.triangles;

import java.util.Scanner;

public class alpha_and_number_triangle {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of row and coloumn ");
    int m = sc.nextInt();
    for (int i = 1; i <= m + 1; i++) {
        for (int j = 1; j <= i; j++) {
            if(i%2==0) System.out.print((char) (j+64)+" ");
            else System.out.print(j+" ");
        }
        System.out.println();

    }
}
}


