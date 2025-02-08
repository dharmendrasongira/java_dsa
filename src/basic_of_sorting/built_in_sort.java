package basic_of_sorting;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class built_in_sort {
    public static void main(String[] args) {
        int[]arr={1,2,3,45,5,3,2,21};
        for(int ele:arr){
            System.out.println(ele+ " ");
        }
        System.out.println();
        Arrays.sort(arr);//built in sort
        for(int ele:arr){
            System.out.println(ele+ " ");
        }
        System.out.println();
    }
}
