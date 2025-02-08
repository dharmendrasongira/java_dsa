package recursion;

import java.util.Scanner;

public class genrate_parenthesis {
    public static void genrator(int open,int close,String ans,int n){
       int m=ans.length();
        if( m==2*n){
            System.out.println(ans);
            return;
        }
        if (open<n)   genrator(open+1,close,ans+"(",n);
        if (close <open)  genrator(open,close+1,ans+")",n);

    }
    public static void main(String[] args) {   Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        genrator(0,0,"",n);


    }

}
