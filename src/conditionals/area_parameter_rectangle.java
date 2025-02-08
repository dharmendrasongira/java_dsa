package conditionals;

import java.util.Scanner;

public class area_parameter_rectangle {
    public static void main(String[] args) {


    System.out.println("please enter the length of rectangle:");
    Scanner sc = new Scanner(System.in);
    double l= sc.nextDouble();
    System.out.println("please enter the breadth of rectangle:");
    Double b= sc.nextDouble();
    double area= l*b;
        double parameter= 2*(l+b);
    if (area<parameter){
        System.out.println(" area "+area+" is less than parameter "+parameter);}
    if (parameter>area){System.out.println(" parameter "+parameter+ "is less than area "+area);

    }
    if (area == parameter){
        System.out.println("both are equal");
    }}}