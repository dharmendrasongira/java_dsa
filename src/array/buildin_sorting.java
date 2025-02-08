package array;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;

public class buildin_sorting{ public static void main(String[] args) {


    int arr[] ={10,0,0,5,58,8,48,6,};

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] + " ");
    }




}
}