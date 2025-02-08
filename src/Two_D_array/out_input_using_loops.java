package Two_D_array;

import java.util.Scanner;

public class out_input_using_loops {
    public static void main(String[] args) {
        int[][] grid = new int[2][3];

        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                grid [i][j]=sc.nextInt();
            }

            }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]+" ");

            }
            System.out.println( );

        }
    }
}