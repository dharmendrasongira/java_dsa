package looops;

import java.util.Scanner;

public class oddnum_by_continue {public static void main(String[] args) {
    System.out.println("please enter the number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//   100iteration
//   for (int i =1; i<=n; i++) {
//        if (n%2!=0) System.out.println(i);


  //  50 iteration
//   for (int i =1; i<=n; i+=2) {
//        System.out.println(i);}



  //100 iteration
for (int i =1; i<=n; i++) {
       if (n%2!=0) {continue;}
           System.out.println(i);
    }
}}
