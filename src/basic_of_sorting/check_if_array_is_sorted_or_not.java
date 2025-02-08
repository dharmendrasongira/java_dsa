package basic_of_sorting;

public class check_if_array_is_sorted_or_not {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,3,};
        int n = arr.length;

        boolean flag= true;
        for (int i = 0; i <n ; i++) {
            if (arr[i]>arr[i+1]){
                flag=false;
             break;
            }}
            if (flag==true) System.out.println("arr is sorted");
            else  System.out.println("arr is not sorted");

    }}
