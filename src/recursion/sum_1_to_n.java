package recursion;

import java.util.Scanner;

public class sum_1_to_n {

///////// int type method
    /*
        public static int rec(int n){
            if (n==0 ||n==1 )  return 0;//base case
         return n + rec(n-1);//call

        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("please enter number :");
            int n=sc.nextInt();

            int sum =rec(n);
            System.out.println("sum of given number to :"+sum);

        }
    }
    */
public static void rec(int n,int sum){

    if (n==0) {
        System.out.println("sum of digit from 1 is:"+sum);
        return;
    }
     rec(n-1,sum+n);//call

}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter number :");
        int n=sc.nextInt();


        rec(n,0);

    }
}


