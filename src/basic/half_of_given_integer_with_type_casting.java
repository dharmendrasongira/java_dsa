package basic;

import java.util.Scanner;

public class half_of_given_integer_with_type_casting {

    public static void main(String[] args) {
        System.out.println("please enter no. ");
        Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
        double b= (double)a;/////type casting
        System.out.println(b/2);

    }
}
