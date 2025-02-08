package basic_of_sorting;

import java.util.ArrayList;

public class move_zeroes  {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 0, 0, 0, 4, 8, 9};
        int noz = 0;

        for (int ele : arr) {
            if (ele == 0) noz++;
        }
        for (int j = 0; j < noz; j++) {//n-1 passess

            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}