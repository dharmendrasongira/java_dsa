package recursion;

import java.util.Scanner;

public class maze_path {
    public static int maze(int row ,int coloumn,int n,int m){
        if(row==n||coloumn==m)return 1;
        int rightways= maze(row , coloumn+1, n, m);
        int downways =  maze(row+1 , coloumn, n, m);
        return rightways+downways;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please  number of row:");
        int n=sc.nextInt();
        System.out.println("please enter of column:");
        int m=sc.nextInt();
        System.out.println( maze(1,1,n,m));
    }
}
