package Two_D_array;

public class for_each_loop {
    public static void main(String[] args) {
        int[][] grid = {{1,5,5},{5,6,8}};//grid is array of array
        for(int[] ele: grid){       ///grid is collection of array so int[] can store it
            for (int x:ele){             //x jo ki element of array ko store kar sakta hai
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}