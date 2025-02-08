package basic_of_sorting;

public class selection_sort {

    public static void print( int[]arr){
        for(int ele:arr) {System.out.print(ele +" ");}
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={20,6,9,8,4,32,12};
        int min= Integer.MAX_VALUE;
        int n=arr.length;
int minindex=-1;
print(arr);
        for (int i = 0; i <arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                if (arr[j]<min) {
                    min = arr[j];
                    minindex = j;
                }
            }
/////////////////
                int temp= arr[i];
                arr[i]= arr[minindex];
               arr[minindex]=temp;

        }
        print(arr);
    }
}
