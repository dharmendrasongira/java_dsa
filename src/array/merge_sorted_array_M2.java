package array;

public class merge_sorted_array_M2 {public static void main(String[] args) {


    int[] arr = {0, 1, 5, 8, 10, 12, 16};
    int[] brr = {5, 6, 9, 10, 15, 17, 19};


    int n = arr.length + brr.length;
    int[] crr = new int[n];
    int i = arr.length-1, j = brr.length-1, k = n-1;
    while (i>0&& j>=0) {
        if (arr[i] >= brr[j]) {
            crr[k] = arr[i];
            i--;
            k--;
        } else {
            crr[k] = brr[j];
            j--;
            k--;

        }
        if (i == 0) {
            while (j >0) {
                crr[k] = brr[j];
                j--;
                k--;
            }
        }
        if (j == 0) {
            while (i >0) {
                crr[k] = arr[i];
                i--;
                k--;
            }
        } for (k=0;k<n;k++){
            System.out.print(crr[k]+ " ");}
    }
}}