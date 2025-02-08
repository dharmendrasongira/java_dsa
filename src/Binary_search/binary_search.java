package Binary_search;

public class binary_search {
    public static void main(String[] args) {
        int []arr= {1,3,4,5,6,7,8,9};
        int target=5;

        int low =0;
        int high=arr.length-1;


        boolean flag= false;//not present
        while (low <= high) {
        int mid= (high-low)/2+low;

         if (target==arr[mid]){flag=true;
         break;}

         else if (target>arr[mid]){low =mid+1;}

        else if (target<arr[mid]){high= mid-1;}
        }
        if (flag==true) System.out.println("target is present in given array");
        if (flag==false) System.out.println("target is not present in given array");
        }

    }

