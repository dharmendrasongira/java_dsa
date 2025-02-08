package Binary_search;

public class lower_bound {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;


        int lb = arr.length;
        int low = 0;
        int high = arr.length - 1;

        boolean flag = false;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (arr[mid] >= target) {
                lb = Math.min(lb, mid);
                high = mid - 1;}
            else{ low = mid + 1;}
                if (flag == true) System.out.println("target is present in given array");
            if (flag == false) System.out.println("target is not present in given array");
        }
    }
}


