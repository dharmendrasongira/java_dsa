package recursion;

import java.util.Scanner;

public class hcf {
  public static int   printhcf(int a,int b){
//      int remian=a%b;
//      if (remian==0){
//          System.out.println("hcf is "+b);
//          return;
//      }
//      else {
//          a = b;
//          b = remian;
//      }
//      printhcf(a,b);


if (a%b==0) return b;///return divisor
return printhcf(b,a%b);//recurssiom
  }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter any number");
        int a =sc.nextInt();
        System.out.println("please enter any number");
        int b =sc.nextInt();
        System.out.println(printhcf(a,b));
    }
}
