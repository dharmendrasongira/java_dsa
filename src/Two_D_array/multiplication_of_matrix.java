package Two_D_array;

public class multiplication_of_matrix {

    public static void main(String[] args) {
        int[][] arr = {{1, 5, 5}, {5, 6, 8}};
        int[][] brr = {{1, 7, 6}, {2, 5, 10},{5,4,6}};
        int[][] crr = new int[arr.length][brr[0].length];


        if (arr[0].length== brr.length){

        for (int i = 0; i < crr.length; i++) {
            for (int j = 0; j < crr[0].length; j++) {
                for (int k = 0; k < brr.length; k++) {


                    crr[i][j] += arr[i][k] * brr[k][j];
                }

            }


        }
            for (int i = 0; i < crr.length; i++) {

                for (int j = 0; j < crr[0].length; j++){

                    System.out.print(crr[i][j]+" ");
                }
                System.out.println();
            }
        }
        else System.out.println("multiplication is not possible");
    }
}