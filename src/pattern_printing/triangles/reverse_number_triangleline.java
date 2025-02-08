package pattern_printing.triangles;

import java.util.Scanner;

public class reverse_number_triangleline {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of row and coloumn ");
    int m = sc.nextInt();
    for (int i = 1; i <= m + 1; i++) {
        for (int j = 1; j <= m + 1 - i; j++) {
            System.out.print((char) (i));
        }
        System.out.println();

    }
}
}


