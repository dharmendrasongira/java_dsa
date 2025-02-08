package recursion;

public class travarsal_in_array {
    public static void print(int i,int[]arr){
        if (i==arr.length)return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int []arr={1,5,6,8,7,4,55,6,99};
        print( 0,arr);
    }
}
