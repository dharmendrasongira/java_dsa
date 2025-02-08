package array;

public class passing_array_to_method { public static void main(String[] args) {


    int arr[] = {10, 0, 0, 5, 58, 8, 48, 6,};
    System.out.println(arr[0]);
    change(arr);
    System.out.println(arr[0]);
}

public  static void change(int[] x) {
    x[0]=90; 

}}