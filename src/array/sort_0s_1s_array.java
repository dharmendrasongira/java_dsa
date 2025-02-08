package array;

public class sort_0s_1s_array {
    public static void main(String[] args) {
        int[] arr ={0,1,0,1,1,1,1,0,0,0,0,1};
        ///method1
//        int noofzeroes=0;int noofone=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==0){noofzeroes++;
//            }else noofone++;
//        }
//        int n = arr.length;
//        for (int i = 0; i < arr.length; i++) {
//         if (i<noofzeroes) {arr[i]=0;}
//       else {arr[i]=1;}}
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
        //method-2
        int i=0;
        int j= arr.length-1;
        while(i<j){
if(arr[i]==0)i++;
else if(arr[j]==1) j--;

           else if (arr[j]==0 && arr[i]==1){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for (int ele:arr) {
            System.out.print(ele+" ");

        }
    }}
