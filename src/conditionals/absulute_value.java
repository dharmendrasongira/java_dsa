package conditionals;

import java.util.Scanner;

public class absulute_value { public static void main(String[] args) {
    System.out.println("please enter the number:");
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    if( a<0){System.out.println(" absulute value of Given number=>  "+ -a);}
    else{System.out.println("abusulute value of Given number=>   "+a);}
}}
