package pattern_printing.composite_pattern;

import java.util.Scanner;

public class number_bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row and coloumn ");
        int m = sc.nextInt();
        int k = 0;
        for (int l = 1; l <= 2 * m - 1; l++) {
            System.out.print(l + " ");
        }

        System.out.println(" ");

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= m - i; j++) {/////simple code of flipped triangle
                System.out.print(j + " ");
                k=j+1;
            }
            for (int l = 1; l <= 2 * i - 1; l++) {///space pyramid code
                k +=1;
                System.out.print("  ");

            }
            for (; k <= 2 * m - 1; k++) {
                System.out.print(k + " ");
            }

            System.out.println();

        }
    }
}

