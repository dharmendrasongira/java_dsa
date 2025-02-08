package array;


public class length_of_array {
    public static void main(String[] args) {


        int arr[] ={10,0,0,5,58,8,48,6,};
        int n= arr.length;

        System.out.println("lenth of the array is " +arr.length);
        //output loops
        System.out.println(" your array is ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}