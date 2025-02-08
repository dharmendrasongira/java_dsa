package basic_of_sorting;

import org.w3c.dom.ls.LSOutput;

public class bubble_sort {
    public static void print( int[]arr){
      for(int ele:arr) {System.out.print(ele+" ");}
        System.out.println();
    }

    public static void main(String[] args) {
        int[]arr={1,2,5,8,9};
        print(arr);

        //bubble sort-->1
//        for (int j = 0; j <arr.length-1 ; j++) {//n-1 passess
//            for (int i = 0; i < arr.length-1; i++) {
//                if(arr[i]>arr[i+1]){
//                    int temp =arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                }}
//        } print(arr);
//
//        ///bubble sort 2
//        for (int j = 0; j <arr.length-1 ; j++) {//n-1 passess
//        for (int i = 0; i < arr.length-1-j; i++) {
//             if(arr[i]>arr[i+1]){
//                int temp =arr[i];
//                arr[i]=arr[i+1];
//                arr[i+1]=temp;
//            }}
//        } print(arr);
        //bubble sort optimisied(checing bhi laga do)


        for (int j = 0; j <arr.length-1 ; j++) {//n-1 passess
            boolean flag= true;
            for (int i = 0; i < arr.length-1-j; i++) {
                if(arr[i]>arr[i+1]){
                    int temp =arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                    flag=false;
                }}if (flag == true)break;

        } print(arr);
    }
}
