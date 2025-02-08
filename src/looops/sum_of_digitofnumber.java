package looops;

import java.util.Scanner;

public class sum_of_digitofnumber {  public static void main(String[] args) {
    System.out.println(" please enter number");
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int sum=0;
    while( n!=0){///////(n>0)not work for negative
         int ld = n%10;
        sum +=ld;
         n /=10;
    }
    System.out.println("sum of digit in given number  "  +sum);



}}

