package array;

public class next_greatest_element {
    public static void main(String[] args) {

        int[] arr = {0, 1, 55, 8, 10, 12, 16};
        int n=arr.length;
        int[] brr = new int[arr.length];
     //method ---1
//        for (int i=0 ;i<n;i++ ){
//            for (int j = i; j < n; j++) {
//                if (arr[i]<arr[j]){
//                    brr[i]=arr[j];
//                }
//
//            }
//        }
//        brr[n-1]=-1;
//            for (int k = 0; k <n ; k++) {
//               System.out.print(brr[k]+" ");
//
//            }


        //method ---2
        brr[n-1]=-1;
        int nge=arr[n-1];
        for (int i=n-2;i>=0;i--){
            brr[i]=nge;
            nge=Math.max(nge,arr[i]);

        }

        for (int k = 0; k <n ; k++) {
               System.out.print(brr[k]+" ");

            }


        }
}