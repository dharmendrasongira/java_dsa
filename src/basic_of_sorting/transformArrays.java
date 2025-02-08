package basic_of_sorting;

public class transformArrays {
    public static void print(int[] arr) {
        for (int ele :arr) {

            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {20, 6, 9, 8, 4, 32, 12};
           //         6 ,1,   ,2,0 ,5
        print(arr);
        int x=0;

        int n = arr.length;


            for (int i = 0; i <n; i++) {
                int min = Integer.MAX_VALUE;
                int minindex = -1;
                for (int j = 0; j <n ; j++) {

                    if (arr[j]<min && arr[j]>0) {

                        min = arr[j];
                        minindex = j;
                    }
                }
/////////////////
                arr[minindex]=x;
                x--;
            }
            for (int i = 0; i <arr.length; i++) {
            arr[i]  *=(-1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

        }

