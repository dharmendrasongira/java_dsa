package pattern_printing.triangles;

import java.util.Scanner;

public class star_triangle_flipped {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row and coloumn ");
        int m = sc.nextInt();
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= m; j++) {
              if (j<=m-i){
                  System.out.print("  ");
              }
              else{
                  System.out.print(j+" ");
              }
             }
            System.out.println();

        }
    }

}
