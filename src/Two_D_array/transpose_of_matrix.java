package Two_D_array;

public class transpose_of_matrix {
    public static void main(String[] args) {
        int arr[][]={{1,2},{3,4},{5,6}};
        int m= arr.length;
        int n= arr[0].length;
        int [][]brr=new int[n][m];

        ///storing tarnspose

        for (int j = 0; j < n; j++) {
            for (int i = 0; i <m ; i++) {
              brr[j][i]=arr[i][j];
            }
            System.out.println( );

        }
        //printing real array

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {


                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
       //transpose of array


        for (int j = 0; j < n; j++) {
            for (int i = 0; i <m ; i++) {
                System.out.print(brr[j][i ]+" ");
            }
            System.out.println( );

        }


    }
}
