package array;

public class multiplication_of_array {
    public static void main(String[] args) {
        int arr[]= {7,8,9,87,7};
        int product=1;
        for (int i = 0; i <arr.length ; i++) {
            product *= arr[i];
        }
        System.out.println(product);
    }
}
