package Two_D_array;

import java.util.Scanner;

public class search_insorted_2darray {
    public static void main(String[] args) {
        int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 9}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int m = arr.length;
        int n = arr[0].length;


        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        int i = 0;
        int j = n - 1;
        boolean flag = false;
        while (i < m && j > 0) {
            if (arr[i][j] == target) {flag=true; break;}
            else if (arr[i][j] > target) {
                j--;
            } else {
                i++;
            }

        }
        if (flag == true)System.out.println("the element is found");
        else System.out.println("element is not found");
    }
}
