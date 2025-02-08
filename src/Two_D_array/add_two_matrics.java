package Two_D_array;

public class add_two_matrics {public static void main(String[] args) {
    int[][] arr = {{1, 5, 5}, {5, 6, 8}};
    int[][] brr = {{1, 7, 6}, {2, 5, 10}};
    int [][]crr =new int[arr.length][arr[0].length];

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++)
        {    crr[i][j] = arr[i][j] + brr[i][j];}
    }


    for (int i = 0; i < arr.length; i++) {

        for (int j = 0; j < arr[0].length; j++){

            System.out.print(crr[i][j]+" ");
        }
        System.out.println();
    }

}
}


