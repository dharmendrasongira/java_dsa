package advance_sorting;

public class merge_sort {
    public static void print(int []arr){
    for(int ele : arr){
        System.out.print(ele +" ");
    }
    System.out.println();
}
    public static void mergearray(int []a,int []b,int[]c){
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){
            if (a[i]<=b[j]) c[k++]=a[i++];
             else  c[k++]= b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
     public static void mergesort( int[]arr){
        int n=arr.length;
        if (n==1)return;
        //create two array n/2 size
        int []a= new int[n/2] ;
        int []b= new int[n-n/2];
        //copy pasting
        for (int i=0 ;i<n/2;i++){
            a[i]=arr[i];
        }
        for (int i=0 ;i<n-n/2;i++){
             b[i]=arr[i+n/2];
         }
        //recuussive call to break array till one element
         mergesort(a);
        mergesort(b);
        //for merging each broken array
         mergearray(a,b,arr);
     }
    public static void main(String[] args) {
    int [] a={1,85,9,6,7,2,68,55};
    mergesort(a);
   print(a);
}

}
