package Two_D_array;

public class product_of_array {public static void main(String[] args) {
    int[][] grid = {{1, 5, 5}, {5, 6, 8}};

    int product=1;

    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++)
            product*=grid[i][j];

    }
    System.out.println( "product of all element of the given array is "+product);
}
}


