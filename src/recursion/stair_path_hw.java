package recursion;


import java.util.Scanner;

public class stair_path_hw{
    public static int stair(int n){
        if (n==1) return 1;
        if (n==3) return 2;
        return stair(n-1)+stair(n-3);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("please the no of stair :");
        int n= sc.nextInt();
        System.out.println("the number of way is "+ stair(n));
    }
}


