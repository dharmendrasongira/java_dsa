package array;

public class shallow_copy_of_array {
    public static void main(String[] args) {

        int arr[] = {10, 0, 0, 5, 58, 8, 48, 6,};
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
        System.out.println( );
        int []num= arr;
        for(int ele:num){
            System.out.print(ele+ " ");
        }

    }
}