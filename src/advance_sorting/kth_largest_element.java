package advance_sorting;


import java.util.Scanner;

public class kth_largest_element
  {
        public static int ans=-1;
        public static void print(int []arr) {
            for (int ele : arr) {
                System.out.print(ele +" ");
            }
            System.out.println();
        }
        public static  void swap( int[] arr, int i ,int j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j] = temp;;
        }
        public static int partition( int []arr, int low ,int high)
        { int idx=(low+high)/2;
            int pivot=arr[idx];
            int smallcount=0;
            for (int i=low; i<=high;i++ ){
                if(i==idx)continue;
                if (arr[i] <=pivot ) {
                    smallcount++;
                }
            }
            int correctidx = low+smallcount;
            swap(arr,idx,correctidx);

            int i =low,j=high;

            while (i<correctidx && j>correctidx){
                if (arr[i]<=pivot)i++;
                else if (arr[j]>pivot)j--;
                else if (arr[i]>pivot && arr[j]<pivot) { swap(arr,i,j);}

            }
            return correctidx;
        }
        public static void quickselect(int []arr, int low,int high,int k ){
            if (low>high) return;
            if(low == high ){
                if (low ==k-1)ans=arr[low];
                return;
            }
            int n= arr.length;
            int correctindex =partition(arr,low,high);
            if( correctindex == k-1){ ans = arr[correctindex];
                return;}
            if (k-1<correctindex){
                quickselect(arr,low,correctindex-1 ,k);}
            else   {quickselect(arr,correctindex+1,high,k );}
        }

        public static void main(String[] args) {
            int []arr= {4,9,1,2,6,5,8};
            int n= arr.length;
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter ");
            int k= sc.nextInt();
            print(arr);
            quickselect(arr,0,n-1,n-k+1);
            print(arr);
            System.out.println(ans);

        }
    }





