package array;
import java.util.Scanner;
public class max_array {
    public static void main(String[] args) {


        int arr[] = {10, 0, 0, 5, 58, 8, 48, 6,};
        int n = arr.length;
//output loops
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 1; i++) {
         //   if (arr[i] > max) max = arr[i];
            max=Math.max(arr[i],max);
        }
        System.out.println(max);
    }}