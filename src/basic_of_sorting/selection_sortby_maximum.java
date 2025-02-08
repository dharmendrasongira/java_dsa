package basic_of_sorting;

public class selection_sortby_maximum {    public static void print( int[]arr){
    for(int ele:arr) {System.out.print(ele +" ");}
    System.out.println();
}
    public static void main(String[] args) {
        int[]arr={20,6,9,8,4,32,12};
        int max= Integer.MIN_VALUE;
        int n=arr.length;
        int maxindex=-1;
        print(arr);
        for (int i = 0; i <arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                if (arr[j]>max) {
                    max = arr[j];
                    maxindex = j;
                }
            }
/////////////////
            int temp= arr[i];
            arr[i]= arr[maxindex];
            arr[maxindex]=temp;

        }
        print(arr);
    }
}


