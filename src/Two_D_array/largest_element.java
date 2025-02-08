package Two_D_array;

public class largest_element {
    public static void main(String[] args) {
        int[][] grid = {{1, 5, 5}, {5, 6, 8}};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++)

                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
        }
        System.out.println( "maximum element in the given array is "+max);
    }
}