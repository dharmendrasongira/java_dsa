package pattern_printing.squares;

import java.util.Scanner;


public class small_Alphabet_sqaure { public static void main(String[] args) {


    Scanner sc= new Scanner(System.in);
    System.out.println("enter number of row and coloumn ");
    int m = sc.nextInt();
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <=m ; j++) {
            System.out.print((char)(j+ 96)+" " );
        }
        System.out.println();

    }
}
}
