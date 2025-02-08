package basic_of_sorting;

public class insertion_sort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {-5,-7,44, 89, 5, 8, 49};
        print(arr);



        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >=1 ; j--) {
                //while(j.=1&&arr[j]<arr[j-1])
                if (arr[j]<arr[j-1]){
                    int temp =arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
           }else break;

            }

        }print(arr);
    }
}

