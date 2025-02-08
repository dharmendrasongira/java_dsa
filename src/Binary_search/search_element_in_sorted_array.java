package Binary_search;



public class search_element_in_sorted_array {
//    public static int bs(int arr[],int low, int high,int target) {
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if(arr[mid ]== target) return mid;
//            else if (arr[mid]>target)high=mid-1;
//            else low=mid+1;
//
//    }
//    return -1;
//    }
//public static int search(int arr[],int target) {
//
//    int n = arr.length;
//    int low = 0, high = n - 1;
//    int p = -1;
//
//    while (low <= high) {
//        int mid = low + (high - low) / 2;
//
//        if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
//            p = mid;
//            break;
//
//        } else if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
//            p = mid - 1;
//            break;
//        } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
//            if (arr[mid] > arr[n - 1]) low = mid + 1;
//
//            else {
//                high = mid - 1;
//            }
//        }
//    }if (p==-1){return bs(arr,0,n-1,target );}
//    int left= bs(arr, 0,p,target );
//    if(left != -1)return left;
//    int right =bs(arr,p+1,n-1,target);
//return right;
//
//
//}


    public static void main(String[] args) {
        int[] arr = {20, 50, 60, 80};
        int target = 0  ;
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
       int mid = low + (high - low) / 2;
         if(arr[mid ]== target) {ans= mid;break;}
         else if (arr[mid]<=arr[high]) {//i am in right sorted array(mid to high everything is sorted)
             if(arr[mid]<target && target<= arr[high] )low = mid +1;
             else high =mid-1;
         }
         else{//i am left part of array(low to mid everything is sorted)
             if(target<arr[mid]&& arr[low]<=target)high=mid-1;
             else low = mid+1;
         }


        }
        if (ans ==-1) System.out.println("your target element is not present");
      else  System.out.println("your target element is present at "+ans);


}}