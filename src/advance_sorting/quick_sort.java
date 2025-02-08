package advance_sorting;



public class quick_sort {
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
    public static void quicksort(int []arr, int low,int high ){
        if (low>=high) return;
        int correctindex=partition(arr,low,high);
        quicksort(arr,low,correctindex-1 );
        quicksort(arr,correctindex+1,high );
    }

    public static void main(String[] args) {
        int []arr= {5,15,5,6,2};
        int n= arr.length;
        print(arr);
        quicksort(arr,0,n-1);
        print(arr);

    }
}