package pattern_printing.triangles;

import java.util.Scanner;

public class floyds_triangle {  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of row and coloumn ");
    int m = sc.nextInt();
    int a=1;
    for (int i = 1; i <= m ; i++) {

        for (int j = 1; j <= i; j++) {
            System.out.print(a+" ");
            a++;
        }
        System.out.println();

    }
}
}
