package array;

public class sum_of_array {
    public static void main(String[] args) {
        int arr[]= {7,8,9,87,7};
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
