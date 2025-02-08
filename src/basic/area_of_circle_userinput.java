package basic;

import java.util.Scanner;

public class area_of_circle_userinput {
    public static void main(String[] args) {
        System.out.println( "please enter the radius");
        Scanner sc= new Scanner(System.in);
        double a= sc.nextDouble();
        System.out.println("area of circle is "+3.14*a*a);
    }
}
