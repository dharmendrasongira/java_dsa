package Two_D_array;

import java.util.Scanner;

public class marks_rollnumber {
    public static void main(String[] args) {
        int [][] arr=new int[4][2];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]=sc.nextInt();

            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println( );

        }
    }
}
