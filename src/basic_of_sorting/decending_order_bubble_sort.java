package basic_of_sorting;

public class decending_order_bubble_sort {
    public static void print( int[]arr){
    for(int ele:arr) {System.out.print(ele+" ");}
    System.out.println();
}

    public static void main(String[] args) {
        int[]arr={1,2,5,8,9};
        print(arr);

for (int j = 0; j <arr.length-1 ; j++) {//n-1 passess
boolean flag= true;
            for (int i = 0; i < arr.length-1-j; i++) {
                if(arr[i]<arr[i+1]){
                int temp =arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

                    flag=false;
        }}
            if (flag == true)break;

        } print(arr);
    }
}