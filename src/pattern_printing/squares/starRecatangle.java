package pattern_printing.squares;

import java.util.Scanner;

public class starRecatangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of row ");
        int m = sc.nextInt();
        System.out.println("enter number of coloumn ");
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
