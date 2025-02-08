package array;
import java.util.*;
public class deep_copy_of_array {  public static void main(String[] args) {

    int []arr = {10, 0, 0, 5, 58, 8, 48, 6,};
    for(int ele:arr){
        System.out.print(ele+ " ");
    }
    System.out.println( );
    int []num= Arrays.copyOf(arr,arr.length);
    for(int ele:num){
        System.out.print(ele+ " ");
    }
//method 2
    //int[] crr =new int (arr.length);
    //for (int i=0; i<arr.length ;i++){
//crr[i]=arr[i];
//}


}
}
