package recursion;

import java.util.Scanner;

public class binary_string {
    public static void printstring(String s,int n) {
        int m = s.length();
        if (m == n) {
            System.out.println(s);
            return;
        }
        if (m == 0||s.charAt(m-1)=='0'){
            printstring(s+1,n);
            printstring(s+0,n);
        }
        else printstring(s+0,n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
     printstring("",n);
    }
}
