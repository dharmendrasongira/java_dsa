package Two_D_array;

public class sum_of_all_element {
    public static void main(String[] args) {
        int[][] grid = {{1, 5, 5}, {5, 6, 8}};

        int sum=0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++)
          sum+=grid[i][j];

        }
        System.out.println( "sum of all element of the given array is "+sum);
    }
}
