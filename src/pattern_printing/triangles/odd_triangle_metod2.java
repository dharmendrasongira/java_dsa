package pattern_printing.triangles;

import java.util.Scanner;

public class odd_triangle_metod2 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of row and coloumn ");
    int m = sc.nextInt();
    for (int i = 1; i <= m + 1; i++) {
        int a=1;
        for (int j = 1; j <= i; j++) {
            System.out.print(a+" ");
         a+=2;
        }
        System.out.println();

    }
}
}
