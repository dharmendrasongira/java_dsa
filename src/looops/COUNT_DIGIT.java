package looops;

import java.util.Scanner;

public class COUNT_DIGIT {
    public static void main(String[] args) {
        System.out.println(" please enter number");
        Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int COUNT=0;
           while( n!=0){///////(n>0)not work for negative
               n /=10;
               COUNT++;}
        System.out.println("number of digit in given number"+COUNT);



}}
