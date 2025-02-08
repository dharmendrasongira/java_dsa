package recursion;


import java.util.Scanner;

public class factorial {
  public int fact(int x){
      if (x==1 || x==0) return 1;
      return x*fact(x-1);


  }
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        System.out.println("please enter the number");
        int n=sc.nextInt();
        factorial p = new factorial();

        System.out.println( "factorial is " +p.fact(n));
    }
}
