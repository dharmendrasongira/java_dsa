package conditionals;

import java.util.Scanner;

public class MARKS_RESULT {
    public static void main(String[] args) {

        System.out.println("please enter the marks:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//    not good tarika
//        if ( 81<= n && n<100 ) {
//            System.out.println(" very good");}
//        if ( 61<= n && n<81 ) {
//            System.out.println(" good");}
//        if ( 41<= n && n<61 ) {
//            System.out.println(" average");}
//        if ( n<41) {
//            System.out.println(" fail");
        if ( 81<= n) {
            System.out.println(" very good");}
        else if ( 61<= n ) {
            System.out.println(" good");}
        else if ( 41<= n  ) {
            System.out.println(" average");}
        else  {
            System.out.println(" fail");  }
    }} 