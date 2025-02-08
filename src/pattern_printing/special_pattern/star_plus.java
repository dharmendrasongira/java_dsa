package pattern_printing.special_pattern;

import java.util.Scanner;

public class star_plus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the no. of row and coloumn");
        int m =sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=m ; j++) {
                if (j==(m/2)+1  ||  i==(m/2)+1) System.out.print("* ");
                else System.out.print("  ");

            }
            System.out.println();

        }
    }
}
