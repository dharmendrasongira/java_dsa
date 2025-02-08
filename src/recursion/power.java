package recursion;


import java.util.Scanner;

public class power {
 /*   public static int rec(int n,int m ){

        if (m==0) return 1;
        else
       return n* rec(n,m-1);//call
    }
    */
 public static int rec(int n,int m ){//less time complexity

     if (m==0) return 1;

     int ans =rec(n,m/2);
     if (m%2==0)return ans*ans;//even
     else
         return ans * ans * n;
 }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter number :");
        int n=sc.nextInt();
        System.out.println("please enter power:");
        int m=sc.nextInt();

        System.out.println(n + " raised to the power " + m +" is : "+rec(n,m));

    }
}


