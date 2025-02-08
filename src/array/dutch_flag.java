package array;

public class dutch_flag {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 1, 1, 2, 1, 0, 0, 0, 0, 1};
        //int noofzeroes=0;int noofone=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==0)noofzeroes++;
//            if (arr[i]==1)noofone++;
//        }
//        int n = arr.length;
//        for (int i = 0; i < n ;i++) {
//
//         if (i<noofzeroes) arr[i]=0;
//
//         else if (i <noofzeroes+noofone)arr[i]=1;
//
//         else arr[i]=2;
//       }
//
//
//
//
//
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
        int low =0;int mid=0;int high=arr.length-1;
     while (mid<=high){
         if (arr[mid]==0){
             int temp= arr[mid];
             arr[mid] =arr[low];
             arr[low ]=arr[temp];
             mid++;
             low++;
         }
         else if (arr[mid]==1){
             mid++;
          }
         else {int temp= arr[mid];
             arr[mid] =arr[high];
             arr[high ]=arr[temp];
         high--;
         }
     }
        for (int ele:arr) {
            System.out.println(ele);}

    }}
